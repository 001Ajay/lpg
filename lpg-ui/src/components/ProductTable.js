import React from 'react'

import ReactTable from "react-table-6";
import "react-table-6/react-table.css"


class ProductTable extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            data: [],
            columns:[
                { Header: "Name", accessor: "name"},
                { Header: "Description", accessor: "description"},
                { Header: "Category", accessor: "category", Cell: ({ value }) => value.name},
                { Header: "Creation Date", accessor: "creation_date"},
                { Header: "Update Date", accessor: "update_date"},
                { Header: "Last Purchased", accessor: "last_purchased"}
            ],
            loading: true
        };
    }

    componentDidMount() {
        console.log("componentDidMount...");
        const productData = this.getData().then(data => {
            console.log(data);
            this.setState({ data: data, loading: false });
        });
    }

    async getData() {
        console.log("fetching product information...");
        const result = await fetch("http://localhost:8080/products/")
            .then(response => response.json());
        console.log("product data received");
        return result;
    }

    render () {
        console.log("render...");
        const { data, loading, columns } = this.state;
        if(loading){
            console.log("render : loading...");
        }else{
            console.log("rendering React-Table... ");
            return (<div className='product-table'>
                <ReactTable
                    data={data}
                    columns={columns}
                    defaultPageSize={10}
                    className="-striped -highlight"
                    />
            </div>);
        }
        console.log("rendering()...");
        return (<div className='product-table'>
            This is Product Table
        </div>);
    }
}

export default ProductTable;
