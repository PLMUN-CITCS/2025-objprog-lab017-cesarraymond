import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        int score = getStudentScore();
        String grade = calculateGrade(score);
        System.out.println("Your Grade is: " + grade);
    }

    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        int score;

        while (true) {
            try {
                System.out.print("Enter your score: ");
                score = Integer.parseInt(scanner.nextLine());

                if (score >= 0 && score <= 100) {
                    break;
                } else {
                    System.out.println("Please enter a valid score between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric score.");
            }
        }

        return score;
    }

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}