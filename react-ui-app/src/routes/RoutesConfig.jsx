import React, { lazy } from 'react'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Header from '../components/atoms/Header'

export const WelcomeScreen = lazy(() => import('../components/molecules/WelcomeScreen'))
export const EmployeeAddScreen = lazy(() => import('../components/molecules/EmployeeAddScreen'))
export const ContactUsScreen = lazy(() => import('../components/molecules/ContactUsScreen'))

const SelectedRoutes = () => {
  let routes = null

  switch (window?.location?.pathname.replace('/', '')) {
    case 'add':
      routes = <EmployeeAddScreen />
      break
    case 'contact':
      routes = <ContactUsScreen />
      break
    default:
      routes = <WelcomeScreen />
      break
  }

  return (
    <>
      <Header />
      {routes}
    </>
  )
}

const routeBasePath = '/*'

const RoutesConfig = (
  <BrowserRouter>
    <Routes>
      <Route exact path={routeBasePath} element={<SelectedRoutes />} />
    </Routes>
  </BrowserRouter>
)

export default RoutesConfig
