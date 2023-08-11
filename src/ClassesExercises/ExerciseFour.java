package ClassesExercises;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int employeeNumber = sc.nextInt();
        int hours = sc.nextInt();
        double paymentPerHour = sc.nextDouble();
        double salary = hours * paymentPerHour;
        System.out.printf("NUMBER = %d %nSALARY = U$ %.2f%n", employeeNumber, salary);

        sc.close();
    }
}
