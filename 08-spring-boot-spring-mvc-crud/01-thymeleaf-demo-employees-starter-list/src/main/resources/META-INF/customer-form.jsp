<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<html lang="en" xmlns:form="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>Title</title>


</head>
<body>
<form:form action = "processForm" modelAttribute = "customer">
    <br><br>
    First name: <form:input path = "firstName"/>
    <br><br>
    Last name: <form:input path = "lastName"/>
    <br><br>

    <input type="submit" value = "Submit">
</form:form>
</body>
</html>