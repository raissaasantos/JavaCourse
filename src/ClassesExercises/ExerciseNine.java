package ClassesExercises;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("They are multiples");
        }
        else {
            System.out.println("They are not multiples");
        }

        sc.close();
    }
}
