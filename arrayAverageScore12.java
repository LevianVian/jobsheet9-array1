
import java.util.Scanner;

public class arrayAverageScore12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[10];
        double total = 0;
        double average;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        average = total / scores.length;
        System.out.println("The class average score is: " + average);

    }
}