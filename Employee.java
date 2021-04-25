public class Employee {
    int salary;
    int hours ;

    Employee(int salary, int hours) {
        this.salary = salary;
        this.hours = salary;
    }
    void getInfo(int salary, int hours){
        System.out.println("Initial salary: 300");
        System.out.println("Number of hours of work per day: 3");
    }

    void AddSal() {
        if (this.salary < 500) {
            System.out.println("New salary taking the initial salary into consideration: " + (10 + salary));
        }
    }

    void AddWork() {
        if (this.hours > 6) {
            System.out.println("New salary taking the hours into consideration: "+ (5 + salary));
        }
    }

    public static void main(String[] args) {
        Employee finalSalary = new Employee(300, 3);
        finalSalary.getInfo(300,3);
        finalSalary.AddSal();
        finalSalary.AddWork();
    }
}
