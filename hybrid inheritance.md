Question 1
CODE 
class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {

    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing employees.");
    }

    public void addEmployee() {
        System.out.println("HR Manager added a new employee.");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(30000);
        employee.work();
        System.out.println("Employee salary: " + employee.getSalary());

        HRManager hrManager = new HRManager(50000);
        hrManager.work();
        System.out.println("HR Manager salary: " + hrManager.getSalary());
        hrManager.addEmployee();
    }
}
OUTPUT
Employee is working.
Employee salary: 30000.0
HR Manager is managing employees.
HR Manager salary: 50000.0
HR Manager added a new employee.
