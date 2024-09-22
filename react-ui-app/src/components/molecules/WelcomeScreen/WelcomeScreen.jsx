import React from 'react'
import './WelcomeScreen.scss'
import EmployeeList from '../../atoms/EmployeeList/EmployeeList'

const WelcomeScreen = () => {
  return (
    <div className="welcomeScreen">
      <EmployeeList />
    </div>
  )
}

export default WelcomeScreen
