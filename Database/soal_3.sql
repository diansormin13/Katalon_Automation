SELECT tbl_employee.emp_code,emp_name,emp_status,emp_income FROM tbl_employee,tbl_income 
WHERE tbl_employee.emp_code = tbl_income.emp_code 
ORDER BY tbl_income.emp_income DESC