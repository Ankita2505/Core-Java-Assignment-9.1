package assignment9_1;

import java.util.HashMap;//Importing HashMap class
import java.util.Map;//importing map class package

class Employee 
{
	int emp_code;
	String emp_name;

	public Employee(int emp_code) 
	{			
		this.emp_code=emp_code;			
	}

	public Employee(String emp_name) 
	{
		this.emp_name=emp_name;
	}

	public Employee()//Default Employee Constructor
	{

	}
	//getter and setter for emp_code
	public int getEmp_code() 
	{
		return emp_code;
	}

	public void setEmp_code(int emp_code)
	{
		this.emp_code = emp_code;
	}
	//getter and setter for emp_name
	public String getEmp_name()
	{
		return emp_name;
	}

	public void setEmp_name(String emp_name) 
	{
		this.emp_name = emp_name;
	}
	
	public String toString()
	{
		return emp_code+""+emp_name;
	}

}
public class Employee_Name
{
	public static void main(String[] args) //Start of main class
	{
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);

		Employee emp3 = new Employee("Ankita");
		Employee emp4 = new Employee("Pranshu");

		Map<Employee,Employee> empMap=new HashMap<Employee,Employee>();//Declare hash map
		//Adding elements to employee hashmap
		empMap.put(emp1,emp3);
		empMap.put(emp2,emp4);	
		//printing only employee names
		System.out.println(empMap.entrySet());
		System.out.println(empMap.get(emp1));
		System.out.println(empMap.get(emp2));

	}//Close of Main class
}