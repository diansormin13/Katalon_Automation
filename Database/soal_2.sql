SELECT emp_status,emp_income FROM tbl_employee,tbl_income 
WHERE tbl_employee.emp_code = tbl_income.emp_code 
AND tbl_employee.emp_status = 'R'