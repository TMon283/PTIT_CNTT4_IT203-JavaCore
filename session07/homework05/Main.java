package session07.homework05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giá trị MAX_SCORE: " + Config.MAX_SCORE);
        System.out.println("Giá trị MIN_SCORE: " + Config.MIN_SCORE);

        double score = 8.5;
        if (score <= Config.MAX_SCORE && score >= Config.MIN_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        }

//        Config.MAX_SCORE = 9.5; // nếu bỏ comment, trình biên dịch sẽ báo lỗi: cannot assign a value to static final variable MAX_SCORE
    }
}
