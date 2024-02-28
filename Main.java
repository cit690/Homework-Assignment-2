import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner userInput = new Scanner((System.in));

        System.out.println("Enter grade for Assignments: ");
        double assignments = userInput.nextDouble();
        System.out.println("Enter grade for Final Project: ");
        double finalProject = userInput.nextDouble();
        System.out.println("Enter grade for Tests and Quizzes: ");
        double tests = userInput.nextDouble();
        System.out.println("Enter grade for Participation: ");
        double participation = userInput.nextDouble();

        double weightedAssignments = 0.2;
        double weightedFinalProject = 0.3;
        double weightedTests = 0.4;
        double weightedParticipation = 0.1;

        double finalGrade = (assignments * weightedAssignments)
                + (finalProject * weightedFinalProject)
                + (tests * weightedTests)
                + (participation * weightedParticipation);

        char letterGrade;
        if (finalGrade >= 90) {
            letterGrade = 'A';
        } else if (finalGrade >= 80) {
            letterGrade = 'B';
        } else if (finalGrade >= 70) {
            letterGrade = 'C';
        } else if (finalGrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        System.out.println("Your final grade is "+ finalGrade + " which gives you a " + letterGrade);
    }
}