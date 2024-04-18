<html>
<head></head>
    <body>
    <h3>Employee Details</h3>
<form action = "/emp">
    emp_id :<input type = "text" name="emp_id"/>
    <input type="submit" value="Search"/>
</form>
    <hr/>
    emp_id:${emp_tbl.emp_id}<br/>
    emp_dept:${emp_tbl.emp_dept}<br/>
    emp_gender:${emp_tbl.emp_gender}<br/>
    emp_name:${emp_tbl.emp_name}<br/>
    emp_salary:${emp_tbl.emp_salary}<br/>
</body>
</html>