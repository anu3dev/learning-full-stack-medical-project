import React, { useState } from "react"
import "./LoginScreen.scss"
import Button from "../../atoms/Button/Button"

const LoginScreen = () => {
  const [emailId, setEmailId] = useState("")
  const [password, setPassword] = useState("")

  const sendEmail = () => {
    window.location.assign("/")
  }
  const backBtn = () => {
    window.location.assign("/")
  }

  const footerBtnArr = [
    {
      name: "Login",
      action: sendEmail,
      type: "save",
    },
    {
      name: "Cancel",
      action: backBtn,
      type: "cancel",
    },
  ]

  return (
    <div className="loginScreen">
      <h1> Login:- </h1>
      <div className="loginScreen__form">
        <form>
          <label>
            Enter your email:
            <input
              type="email"
              value={emailId}
              placeholder="Enter your email"
              onChange={(e) => setEmailId(e.target.value)}
            />
          </label>
          <label>
            Enter your password:
            <input
              type="password"
              value={password}
              placeholder="Enter your password"
              onChange={(e) => setPassword(e.target.value)}
            />
          </label>
        </form>
      </div>
      <Button btnProp={footerBtnArr} origin="contactPage" />
    </div>
  )
}

export default LoginScreen
