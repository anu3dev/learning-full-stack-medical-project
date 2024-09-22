import { BASE_EMP_URL } from '../constants'

export const fetchEmployeeList = async (setEmpList) => {
  const url = `${BASE_EMP_URL}employees`
  try {
    const response = await fetch(url)
    if (!response.ok) {
      throw new Error(`Response status: ${response.status}`)
    }
    setEmpList(await response.json())
  } catch (error) {
    console.error(error.message)
  }
}

export const deleteEmployeeList = (id) => {
  const url = `${BASE_EMP_URL}deleteEmployee/${id}`
  fetch(url, {
    method: 'DELETE',
  })
    .then((response) => response.json())
    .then((json) => console.log(json))
}

export const saveEmployeeData = (formData) => {
  const url = `${BASE_EMP_URL}addEmployee`
  fetch(url, {
    method: 'POST',
    body: JSON.stringify(formData),
    headers: {
      'Content-type': 'application/json; charset=UTF-8',
    },
  })
    .then((response) => response.json())
    .then((json) => console.log(json))
}

export const getEmployeeData = async (ids, setFirstName, setLastName, setEmailId) => {
  const url = `${BASE_EMP_URL}getEmployee/${ids}`
  try {
    const response = await fetch(url)
    if (!response.ok) {
      throw new Error(`Response status: ${response.status}`)
    }
    const { emailId, firstName, lastName } = await response.json()
    setFirstName(firstName)
    setLastName(lastName)
    setEmailId(emailId)
  } catch (error) {
    console.error(error.message)
  }
}

export const updateEmployeeData = (formData, ids) => {
  const url = `${BASE_EMP_URL}updateEmployee/${ids}`
  fetch(url, {
    method: 'PUT',
    body: JSON.stringify(formData),
    headers: {
      'Content-type': 'application/json; charset=UTF-8',
    },
  })
    .then((response) => response.json())
    .then((json) => console.log(json))
}
