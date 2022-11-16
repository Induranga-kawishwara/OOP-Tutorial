public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("John Jones", 35000);
        Employee e3 = new Employee("Ian Smith", 20000);
        System.out.println("e1: " + e1.getName() + ", salary: " + e1.getSalary());
        System.out.println("e2: " + e2.getName() + ", salary: " + e2.getSalary());
        System.out.println("e3: " + e3.getName() + ", salary: " + e3.getSalary());
    }

}
