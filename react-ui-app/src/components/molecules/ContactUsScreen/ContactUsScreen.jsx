import React, { useState } from 'react'
import './ContactUsScreen.scss'
import Button from '../../atoms/Button/Button'

const ContactUsScreen = () => {
  const [emailId, setEmailId] = useState('')
  const [message, setMessage] = useState('')

  const sendEmail = () => {
    window.location.assign('/')
  }
  const backBtn = () => {
    window.location.assign('/')
  }

  const footerBtnArr = [
    {
      name: 'Send email',
      action: sendEmail,
      type: 'save',
    },
    {
      name: 'Cancel',
      action: backBtn,
      type: 'cancel',
    },
  ]

  return (
    <div className="contactUsScreen">
      <h1> Contact us:- </h1>
      <div className="employeeAddScreen__form">
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
            Enter your message:
            <textarea
              rows="4"
              cols="50"
              value={message}
              placeholder="Enter your message"
              onChange={(e) => setMessage(e.target.value)}
            />
          </label>
        </form>
      </div>
      <Button btnProp={footerBtnArr} origin="contactPage" />
    </div>
  )
}

export default ContactUsScreen
