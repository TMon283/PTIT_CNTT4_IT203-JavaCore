package session07.homework03;

public class Program {
    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5, 5.5, 7.0, 3.5};

        double avg = ScoreUtils.calculateAverage(scores);
        System.out.printf("Điểm trung bình: %.2f\n", avg);

        for (double score : scores) {
            boolean result = ScoreUtils.checkPass(score);
            System.out.println("Điểm " + score + ": " + (result ? "Đạt" : "Trượt"));
        }
    }
}

