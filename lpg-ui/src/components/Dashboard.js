import React from 'react'
import ProductTable from "./ProductTable"

class Dashboard extends React.Component {
    render () {
        return (
            <div className='dashboard'>
                    <h1 align="center">Product Dashboard</h1>
                <ProductTable />
            </div>
        );
    }
}

export default Dashboard;
