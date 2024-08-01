 class employee 
{
    private String name;
    private int salary;


    public employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }


    public void setName(String name) 
    {
        this.name = name;
    }

    public void setSalary(int salary) 
    {
        this.salary = salary;
    }


    public String getName() 
    {
        return name;
    }

    public int getSalary() 
    {
        return salary;
    }


    public void raiseSalary() 
    {
        this.salary *= 1.10;
    }



    public static void main(String[] args)
    {

        employee one = new employee("Vinay", 10000);
        employee two = new employee("Atharv", 20000);
        employee three = new employee("Pranav", 30000);

        System.out.println("Before raise Salary:");
        System.out.println(" ");
        System.out.println(one.getName() + " has salary " + one.getSalary());
        System.out.println(two.getName() + " has salary " + two.getSalary());
        System.out.println(three.getName() + " has salary " + three.getSalary());

        one.raiseSalary();
        two.raiseSalary();
        three.raiseSalary();
        
        System.out.println("After raise Salary:");
        System.out.println(" ");
        System.out.println(one.getName() + " has salary " + one.getSalary());
        System.out.println(two.getName() + " has salary " + two.getSalary());
        System.out.println(three.getName() + " has salary " + three.getSalary());
    }
}