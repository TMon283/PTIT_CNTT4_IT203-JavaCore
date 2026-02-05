package session09.homework01;

public class Student extends Person {
    private String studentId;
    private double avg;

    public Student(String name, int age, String studentId, double avg) {
        super(name, age);
        this.studentId = studentId;
        this.avg = avg;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + avg);
    }
}
