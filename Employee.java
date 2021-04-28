import java.util.*;

public class Employee {
    private float hours, salary;

    public Employee() {
        salary = 0;
        hours = 0;
    }

    public void getInfo(float sal, float hr) {
        sal = salary;
        hr = hours;
    }

    public float AddSal() {
        if (salary < 500) {
            salary = 500 + 10;
        }
        return salary;
    }

    public float AddWork() {
        if (hours > 6) {
            salary = 500 + 5;
        }
        return salary;
    }
}
    class TestEmployee{
        float salary;
        public TestEmployee(float sal){
            salary = sal;
        }
        public void printsal(){
            System.out.println("Salary : " + salary);
        }
    }

    class Employ{
        public static void main(String[] args) {
            Employee emp = new Employee();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Salary");
            float salary = sc.nextFloat();
            System.out.println("Enter no. of hours of work");
            float hours = sc.nextFloat();
            emp.getInfo(salary, hours);
            salary = emp.AddSal();
            hours = emp.AddWork();
            TestEmployee test = new TestEmployee(salary);
            test.printsal();
        }
    }

