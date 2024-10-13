## learning-full-stack-medical-project - a spring boot project for backend and react for frontend.

### REST API endpoints list

```
endpoint -> http://localhost:8080/email/v1/contact -> public API -> POST type
payload ->
{
    "emailId": "anu3rag@gmail.com",
    "message": "Lorem Ipsum is simply dummy text of the printing and typesetting
        industry. Lorem Ipsum has been the industry's standard dummy text ever
        since the 1500s, when an unknown printer took a galley of type and scrambled
        it to make a type specimen book. It has survived not only five centuries,"
}
success response -> We have received your query.
failure respnse -> request can't be completed.
```
```
endpoint -> http://localhost:8080/employee/v1/employees -> public API -> GET type
success response ->
[
    {
        "id": 1,
        "firstName": "anurag",
        "lastName": "kumar",
        "emailId": "anu3dev@gmail.com"
    },
    {
        "id": 2,
        "firstName": "seema",
        "lastName": "kumari",
        "emailId": "seemas1310@gmail.com"
    }
]
failure respnse ->
{
    "time": "2024-10-13T16:19:18.3569599",
    "msg": "Request method 'POST' is not supported",
    "status": "INTERNAL_SERVER_ERROR"
}
```
```
endpoint -> http://localhost:8080/employee/v1/getEmployee/* -> public API -> GET type
success response ->
{
    "id": 2,
    "firstName": "seema",
    "lastName": "kumari",
    "emailId": "seemas1310@gmail.com"
}
failure respnse ->
{
    "time": "2024-10-13T16:24:09.5276359",
    "msg": "Request method 'POST' is not supported",
    "status": "INTERNAL_SERVER_ERROR"
}

{
    "time": "2024-10-13T16:24:50.7429259",
    "msg": "Employee not exist with id: 4",
    "status": "NOT_FOUND_ERROR"
}
```

### React app supported features
