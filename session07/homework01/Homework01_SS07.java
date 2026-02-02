package session07.homework01;

public class Homework01_SS07 {
    public static class Student {
        private String studentId;
        private String studentName;
        public static int totalStudent;

        public Student (String studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
            totalStudent++;
        }

        public void displayStudentInfo() {
            System.out.println("Mã Sinh Viên: "+ studentId);
            System.out.println("Tên Sinh Viên: "+ studentName);
        }

        public static void getNumberOfStudent() {
            System.out.println("Tổng số sinh viên: "+ totalStudent);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("1", "Hoàng Thái Minh");
        Student s2 = new Student("2", "Nguyễn Doanh Tuấn");
        Student s3 = new Student("3", "Lê Trung Chiến");
        Student s4 = new Student("4", "Đoàn Trung Nguyên");
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
        s4.displayStudentInfo();
        Student.getNumberOfStudent();
    }
}
