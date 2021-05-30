import React from 'react'
import ProductTable from "./ProductTable";

class Dashboard extends React.Component {
    render () {
        return <div className='dashboard'>
                Dashboard
            <ProductTable />
        </div>
    }
}

export default Dashboard;
