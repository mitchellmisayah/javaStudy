
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradesPointsList;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradesPointsList = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.gradesPointsList.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        double sum = 0;
        if (this.grades.size() == 0) {
            return -1;
        }
        for (double grade : this.grades) {
            sum += grade;
        }
        double average = sum / this.grades.size();
        return average;

    }

    public double averageOfPoints() {
        double sum = 0;
        if (this.gradesPointsList.size() == 0) {
            return -1;
        }
        for (double grade : this.gradesPointsList) {
            sum += grade;
        }
        double average = sum / this.gradesPointsList.size();
        return average;
    }
}
