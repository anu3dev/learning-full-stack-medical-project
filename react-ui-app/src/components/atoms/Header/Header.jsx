import React from 'react'
import './Header.scss'
import Button from '../Button/Button'

const Header = () => {
  const isUserLoggedIn = false

  const handleContact = () => {
    window.location.assign('/contact')
  }
  const handleLogin = () => {}
  const handleLogout = () => {}

  const footerBtnArr = [
    {
      name: 'Contact',
      action: handleContact,
      type: 'contact',
    },
    {
      name: isUserLoggedIn ? 'Logout' : 'Login',
      action: isUserLoggedIn ? handleLogout : handleLogin,
      type: 'signin',
    },
  ]

  return (
    <div className="haederComp">
      <Button btnProp={footerBtnArr} origin="headerComp" />
    </div>
  )
}

export default Header
