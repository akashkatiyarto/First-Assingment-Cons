           
class Person{
	protected String name;
	protected String sname;
    public Person(){
        name = null;
	sname = null;
    }
    public Person(String name, String sname){
    this.name = name;
    this.sname = sname;
    }
    public Person(Person p){
    name = p.name;
    sname = p.sname;
    }    
    public void show()
    {
    System.out.println("Name = " + name + " " + sname);
    }
}

class ContactInfo extends Person{
	protected String number;
    public ContactInfo(){
	number = "0";
    }
    public ContactInfo(String name, String sname,String number){
    super(name, sname);
    this.name = name;
    this.sname = sname;
    this.number = number;
    }
    public ContactInfo(ContactInfo N){
    super(N);
    number = N.number;
    }    
    public void show()
    {
    super.show();
    System.out.println("Number = " + number);
    }
}

class Salary extends ContactInfo{
	protected float salary;
    public Salary(){
        salary = 0;
    }
    public Salary(String name, String sname, String number, float salary){
    super(name, sname, number);
    this.name = name;
    this.sname = sname;
    this.number = number;
    this.salary = salary;
    }
    public Salary(Salary s){
    super(s);
    salary = s.salary;
    }    
    public void show()
    {
    super.show();
    System.out.println("Employee Salary = " + salary);
    }
}

class OfficeData{
	public static void main(String args[]){
	Salary s1 = new Salary();
	Salary s2 = new Salary("Akash", "Katiyar","7007149728",23800);
	Salary s3 = new Salary(s2);
	System.out.println("First Employee Data : ");
	s1.show();
	System.out.println("Second Employee Data : ");
	s2.show();
	System.out.println("Third Employee Data : ");
	s3.show();
	}
}



