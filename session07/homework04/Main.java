package session07.homework04;

public class Main {
    public static void main(String[] args) {
        ClassRoom s1 = new ClassRoom("Minh");
        ClassRoom s2 = new ClassRoom("Tuấn");
        ClassRoom s3 = new ClassRoom("Chiến");
        s1.contribute(100000);
        s2.contribute(150000);
        s3.contribute(200000);
        ClassRoom.getClassFund();
    }
}
