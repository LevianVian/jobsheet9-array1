import java.util.Scanner;

public class arrayAverageScore12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        double totalPass = 0, totalFail = 0;
        int passCount = 0, failCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the final score " + i + ": ");
            scores[i] = sc.nextInt();

            if (scores[i] >= 70) {
                totalPass += scores[i];
                passCount++;
            } else {
                totalFail += scores[i];
                failCount++;
            }
        }

        if (passCount > 0)
            System.out.println("The average score of students who passed is " + (totalPass / passCount));
        else
            System.out.println("No students passed.");

        if (failCount > 0)
            System.out.println("The average score of students who failed is " + (totalFail / failCount));
        else
            System.out.println("No students failed.");
    }
}
