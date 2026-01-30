package session06.homework04;

public class Homework04_SS06 {
    public static class Employee {
        private String empID;
        private String empName;
        private double salary;

        public Employee() {
            this.empID = "N/A";
            this.empName = "Unknown";
            this.salary = 0.0;
        }

        public Employee(String empID, String empName) {
            this.empID = empID;
            this.empName = empName;
            this.salary = 0.0;
        }

        public Employee(String empID, String empName, double salary) {
            this.empID = empID;
            this.empName = empName;
            this.salary = salary;
        }

        public void displayInfo() {
            System.out.println("Mã Nhân Viên: "+ empID);
            System.out.println("Tên Nhân Viên: "+ empName);
            System.out.println("Lương Tháng: "+ salary);
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("E002", "Hoàng Thái Minh");
        Employee e3 = new Employee("E003", "Nguyễn Doanh Tuấn",15000000.0);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
