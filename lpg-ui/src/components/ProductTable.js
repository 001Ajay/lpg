import React from 'react'

import ReactTable from "react-table-6"
import "react-table-6/react-table.css"
import "../styles/product-table.css"


class ProductTable extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            data: [],
            loading: true,
            categories: []
        };
    }

    componentDidMount() {
        this.getProductData().then(data => {
            this.setState({ data: data, loading: false });
        });
        this.getCategoryData().then(data => {
            this.setState({ categories: data});
        });
    }

    async getProductData() {
        console.log("fetching product information...");
        const result = await fetch("http://localhost:8080/products")
            .then(response => response.json());
        console.log("product data received");
        return result.map(row => {
           const r = {};
           r.name = row.name;
           r.description = row.description;
           r.category = row.category.name;
           r.creation_date = row.creation_date;
           r.update_date = row.update_date;
           r.last_purchased = row.last_purchased;
           return r;
        });
    }

    async getCategoryData() {
        console.log("fetching category information...");
        const result = await fetch("http://localhost:8080/products/categories")
            .then(response => response.json());
        console.log("category data received");
        return result;
    }

    defaultFilter = function(filter, row) {
        return row[filter.id].toUpperCase().includes(filter.value.toUpperCase());
    };

    render () {
        const { data, loading, categories } = this.state;
        if(!loading){

            const columns = [
                { Header: "NAME", accessor: "name", filterMethod: this.defaultFilter},
                { Header: "DESCRIPTION", accessor: "description", filterMethod: this.defaultFilter},
                { Header: "CATEGORY", accessor: "category", filterMethod: this.defaultFilter,
                    Filter: ({ filter, onChange }) =>
                    <select
                        onChange={event => onChange(event.target.value)}
                        style={{ width: "100%" }}
                        value={filter ? filter.value : ""}
                    >
                        <option value="">Show All</option>
                        {categories.map(category => <option value={category.name}>{category.name}</option>)}
                    </select>
                },
                { Header: "CREATION DATE", accessor: "creation_date", filterMethod: this.defaultFilter},
                { Header: "UPDATE DATE", accessor: "update_date", filterMethod: this.defaultFilter},
                { Header: "LAST PURCHASED", accessor: "last_purchased", filterMethod: this.defaultFilter}
            ];

            return (<div className='product-table'>
                <ReactTable
                    data={data}
                    columns={columns}
                    defaultPageSize={10}
                    className="-striped -highlight"
                    filterable
                    />
            </div>);
        }
        return (<div className='product-table'>
            This is Product Table
        </div>);
    }
}

export default ProductTable;
