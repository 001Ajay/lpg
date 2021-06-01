import React from 'react'

import ReactTable from "react-table-6"
import "react-table-6/react-table.css"
import "../styles/product-table.css"


class ProductTable extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            data: [],
            columns:[
                { Header: "NAME", accessor: "name"},
                { Header: "DESCRIPTION", accessor: "description"},
                { Header: "CATEGORY", accessor: "category"},
                { Header: "CREATION DATE", accessor: "creation_date"},
                { Header: "UPDATE DATE", accessor: "update_date"},
                { Header: "LAST PURCHASED", accessor: "last_purchased"}
            ],
            loading: true
        };
    }

    componentDidMount() {
        const productData = this.getData().then(data => {
            this.setState({ data: data, loading: false });
        });
    }

    async getData() {
        console.log("fetching product information...");
        const result = await fetch("http://localhost:8080/products/")
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

    defaultFilter(filter, row) {
        return row[filter.id].toUpperCase().includes(filter.value.toUpperCase());
    };

    render () {
        const { data, loading, columns } = this.state;
        if(!loading){
            return (<div className='product-table'>
                <ReactTable
                    data={data}
                    columns={columns}
                    defaultPageSize={10}
                    className="-striped -highlight"
                    filterable
                    defaultFilterMethod={this.defaultFilter}
                    />
            </div>);
        }
        return (<div className='product-table'>
            This is Product Table
        </div>);
    }
}

export default ProductTable;
