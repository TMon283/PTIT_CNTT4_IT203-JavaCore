package session08.btth;

public class StudentManager {
    private Student[] students = new Student[100];
    private int size = 0;

    // FR1 - Add
    public boolean addStudent(Student s) {
        if (size == students.length) {
            System.out.println("Danh sách đã đầy");
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (students[i].getStudentId().equalsIgnoreCase(s.getStudentId())) {
                System.out.println("Mã sinh viên đã tồn tại");
                return false;
            }
        }
        students[size++] = s;
        return true;
    }

    // FR2 - Show
    public void showAll() {
        if (size == 0) {
            System.out.println("Danh sách trống");
            return;
        }
        System.out.printf("%-10s %-20s %-5s %-10s %-6s %-12s%n",
                "Mã SV", "Họ tên", "Tuổi", "Giới tính", "ĐTB", "Xếp loại");
        for (int i = 0; i < size; i++) {
            Student s = students[i];
            System.out.printf("%-10s %-20s %-5d %-10s %-6.2f %-12s%n",
                    s.getStudentId(), s.getFullName(), s.getAge(),
                    s.getGender(), s.getAverageScore(), s.getRank());
        }
    }

    // FR3 - Search
    public void search(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (students[i].getStudentId().equalsIgnoreCase(keyword)
                    || students[i].getFullName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Tìm thấy: " + students[i].getFullName());
                found = true;
            }
        }
        if (!found)
            System.out.println("Không tìm thấy sinh viên");
    }

    // FR4 - Update
    public boolean update(String id, String name, int age,
                          double m, double p, double c) {
        for (int i = 0; i < size; i++) {
            if (students[i].getStudentId().equalsIgnoreCase(id)) {
                students[i].setFullName(name);
                students[i].setAge(age);
                students[i].setMathScore(m);
                students[i].setPhysicsScore(p);
                students[i].setChemistryScore(c);
                students[i].calculateAverageAndRank();
                return true;
            }
        }
        return false;
    }

    // FR5 - Delete
    public boolean delete(String id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getStudentId().equalsIgnoreCase(id)) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--size] = null;
                return true;
            }
        }
        return false;
    }

    // FR6 - Tính điểm trung bình và xếp loại theo mã SV
    public void showAverageAndRank(String studentId) {
        for (int i = 0; i < size; i++) {
            if (students[i].getStudentId().equalsIgnoreCase(studentId)) {
                System.out.printf("Điểm trung bình: %.2f%n", students[i].getAverageScore());
                System.out.println("Xếp loại: " + students[i].getRank());
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên");
    }

    // FR7 - Sort by average DESC (Bubble Sort)
    public void sortByAverage() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (students[j].getAverageScore() < students[j + 1].getAverageScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // FR8 - Statistic
    public void statistic() {
        int gioi = 0, kha = 0, tb = 0, yeu = 0;
        for (int i = 0; i < size; i++) {
            switch (students[i].getRank()) {
                case "Giỏi":
                    gioi++;
                    break;
                case "Khá":
                    kha++;
                    break;
                case "Trung bình":
                    tb++;
                    break;
                default:
                    yeu++;
            }
        }
        System.out.println("Giỏi: " + gioi);
        System.out.println("Khá: " + kha);
        System.out.println("Trung bình: " + tb);
        System.out.println("Yếu: " + yeu);
    }
}