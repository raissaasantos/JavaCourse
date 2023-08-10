package ClassesExercises;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = A + B;
        System.out.println("Sum = "+ result);

        sc.close();
    }
}
