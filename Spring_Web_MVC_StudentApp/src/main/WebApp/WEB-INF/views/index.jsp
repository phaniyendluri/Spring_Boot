<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<h2>Student Enquiry Form</h2>
<p>
    <font color="green">${msg}</font>
</p>
<form:form action= "save" modelAttribute="Student" method="POST">
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td> <form:input  path="email"/></td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td><form:radiobutton path="gender" value="M"/>Male
            </td>

            <td><form:radiobutton path="gender" value="F"/>Fe_Male
            </td>
        </tr>
        <tr>
            <td>course:</td>
            <td>
            <form:select path="course">
                <form:option value="">-select</form:option>
                <form:options items="${courses}"/>
            </form:select></td>
        </tr>
        <tr>
            <td>Timings:</td>
            <td>
               <form:checkboxes items="${timings}" path="timings"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td> <input type="submit" value="save"/></td>
        </tr>
    </table>

</form:form>
</body>
</html>