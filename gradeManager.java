import java.util.Scanner;

public class gradeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student grades: ");
        int n = sc.nextInt();

        int[] grades = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
            total += grades[i];
        }

        double average = (double) total / n;

        int highest = grades[0];
        int lowest = grades[0];

        for (int i = 1; i < n; i++) {
            if (grades[i] > highest) highest = grades[i];
            if (grades[i] < lowest) lowest = grades[i];
        }

        System.out.println("\nAll student grades:");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }

        System.out.println("\n\nAverage grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}
