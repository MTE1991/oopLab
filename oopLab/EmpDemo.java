class Employee {
    public String name;
    public String rank;
    private int salary;

    Employee() {
        name = "undefined";
        rank = "undefined";
        salary = 0;
    }

    Employee(String name, String rank, int salary) {
        this.name = name;
        this.rank = rank;
        this.salary = salary;
    }

    Employee(Employee emp) {
        name = emp.name;
        rank = emp.rank;
        salary = emp.salary;
    }

    public void getInfo() {
        System.out.println("Name : " + name);
        System.out.println("Rank : " + rank);
        System.out.println("Salary : " + salary + "$");
    }
}

public class EmpDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ekleel", "Director", 50000);
        Employee e3 = new Employee(e2);

        e1.getInfo();
        e2.getInfo();
        e3.getInfo();
    }
}
