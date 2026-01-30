package session06.homework01;

public class Homework01_SS06 {
    public static class Student {
        private String studentID;
        private String studentName;
        private int YOB;
        private double gpa;

        public Student (String studentID, String studentName, int YOB, double gpa) {
            this.studentID = studentID;
            this.studentName = studentName;
            this.YOB = YOB;
            this.gpa = gpa;
        }

        public void displayStudentInfo() {
            System.out.println("Mã Sinh Viên: "+ studentID);
            System.out.println("Họ và tên: "+ studentName);
            System.out.println("Năm sinh: "+ YOB);
            System.out.println("Điểm trung bình: "+ gpa);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Hoàng Thái Minh", 2006, 8.5);
        Student s2 = new Student("SV002", "Nguyễn Doanh Tuấn", 2006, 8.8);

        s1.displayStudentInfo();
        s2.displayStudentInfo();
        }
}


