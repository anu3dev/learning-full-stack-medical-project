import React, { useState, useEffect } from 'react'
import Button from '../Button'
import { fetchEmployeeList, deleteEmployeeList } from '../../../utils/serviceUtils'
import './EmployeeList.scss'

const EmployeeList = () => {
  const [empList, setEmpList] = useState([])

  useEffect(() => {
    fetchEmployeeList(setEmpList)
  }, [])

  const updateRecord = (id) => {
    window.location.assign(`/add?id=${id}&action=update`)
  }
  const deleteRecord = (id) => {
    deleteEmployeeList(id)
    window.location.reload()
  }
  const addRecord = () => {
    window.location.assign('/add')
  }

  const footerBtnArr = [
    {
      name: 'Update',
      action: updateRecord,
      type: 'update',
    },
    {
      name: 'Delete',
      action: deleteRecord,
      type: 'delete',
    },
  ]
  const btnArr = [
    {
      name: 'Add employee',
      action: addRecord,
      type: 'add',
    },
  ]

  return (
    <div className="employeeList">
      <p>
        <Button btnProp={btnArr} />
      </p>
      <h1>Employee List:-</h1>
      <div className="employeeList__content">
        <div className="employeeList__content__table">
          <table>
            <tr>
              <th>First name</th>
              <th>Last name</th>
              <th>Email</th>
              <th>Actions</th>
            </tr>
            {empList.map((item, index) => (
              <tr key={index}>
                <td>{item.firstName}</td>
                <td>{item.lastName}</td>
                <td>{item.emailId}</td>
                <td>
                  <Button btnProp={footerBtnArr} origin="actionBtn" ids={item.id} />
                </td>
              </tr>
            ))}
          </table>
        </div>
      </div>
    </div>
  )
}

export default EmployeeList
