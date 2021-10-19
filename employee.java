class Employee{
	private String name;
	private int age;
	private float salary;
    public Employee(){
        name = null;
	age = 0;
        salary = 0;
    }
    public Employee(String name,int age,float salary){
    this.name = name;
    this.age = age;
    this.salary = salary;
    }
    public Employee(Employee e){
    name = e.name;
    age = e.age;
    salary = e.salary;
    }    
    public void show()
    {
    System.out.println("Employee Name is" + name);
    System.out.println("Employee Age is" + age);
    System.out.println("Employee Salary is" + salary);
    }
}
class demoEmployee{
	public static void main(String args[]){
	System.out.println("Employee Details are");
	Employee e1 = new Employee();
	e1.show();
	Employee e2 = new Employee("Akash",22,20000);
	e2.show();
	Employee e3 = new Employee(e2);
	e3.show();
	System.out.println("\n\n\n\n");
	}
}
