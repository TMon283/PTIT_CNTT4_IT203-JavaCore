package session08.mini_project;

public class Student {
        private String studentId;
        private String fullName;
        private double score;
        public Student(){
        }
        public Student(String studentId, String fullName, double score) {
            this.studentId = studentId;
            this.fullName = fullName;
            this.score = score;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }
        public String getRank(){
            if (score >=8.0){
                return "Giỏi";
            }else if (score < 8.0 && score >=6.5){
                return "Khá";
            } else{
                return "Trung bình";
            }

        }

        public String toString(){
            return "Id: " + studentId + " | Tên sinh viên: " + fullName + " | Điểm Trung bình: " + score + " |  Học lực: " + getRank();
        }
}
