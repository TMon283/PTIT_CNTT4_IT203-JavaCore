package session08.btth;

public class Student {
    private String studentId;
    private String fullName;
    private int age;
    private String gender;
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;
    private double averageScore;
    private String rank;

    public Student(String studentId, String fullName, int age, String gender,
                   double mathScore, double physicsScore, double chemistryScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        calculateAverageAndRank();
    }

    public void calculateAverageAndRank() {
        averageScore = (mathScore + physicsScore + chemistryScore) / 3;

        if (averageScore >= 8 && mathScore >= 6.5 && physicsScore >= 6.5 && chemistryScore >= 6.5)
            rank = "Giỏi";
        else if (averageScore >= 6.5 && mathScore >= 5 && physicsScore >= 5 && chemistryScore >= 5)
            rank = "Khá";
        else if (averageScore >= 5 && mathScore >= 3.5 && physicsScore >= 3.5 && chemistryScore >= 3.5)
            rank = "Trung bình";
        else
            rank = "Yếu";
    }

    // GETTER & SETTER
    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String getRank() {
        return rank;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }
}