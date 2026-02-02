package session07.homework03;

public class ScoreUtils {
    public static boolean checkPass (double score) {
        if (score >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public static double calculateAverage(double[] score) {
        double sum = 0;
        for (double s : score) {
            sum += s;
        }
        return sum/score.length;
    }
}

