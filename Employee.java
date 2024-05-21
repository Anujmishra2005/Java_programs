class Employee:
    def _-init__(self, emp_name, emp_id, emp_salary, emp_company):
        self.emp_name = emp_name
        self.emp_id = emp_id
        self.emp_salary = emp_salary
        self.emp_company = emp_company
    def getdetails(self):
        return f"Name: {self.emp_name}, ID: {self.emp_id}, Salary: {self.emp_salary}, Company: {self.emp_company}"

emp = Employee("Abhay Rana", 2346 , 50000, "TechCorp")
print(emp.getdetails())
