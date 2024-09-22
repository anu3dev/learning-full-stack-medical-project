import React from 'react'
import './Header.scss'
import Button from '../Button/Button'

const Header = () => {
  const isUserLoggedIn = false

  const handleContact = () => {
    window.location.assign('/contact')
  }
  const handleLogin = () => {
    window.location.assign('/login')
  }
  const handleLogout = () => {}

  const btnArr = [
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
    {
      name: 'Hello Guest',
      action: '',
      type: 'intro',
    },
  ]

  return (
    <div className="headerComp">
      <Button btnProp={btnArr} origin="headerComp" />
    </div>
  )
}

export default Header
