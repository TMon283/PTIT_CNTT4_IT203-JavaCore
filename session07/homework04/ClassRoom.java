package session07.homework04;

public class ClassRoom {
    private String studentName;
    public static double classFund;

    public ClassRoom (String studentName) {
        this.studentName = studentName;
    }

    public void contribute (double amount) {
        classFund += amount;
        System.out.println(studentName +" đã đóng "+ amount +" vào quỹ lớp");
    }

    public static void getClassFund () {
        System.out.println("Tổng quỹ lớp hiện tại là: "+ classFund);
    }
}

