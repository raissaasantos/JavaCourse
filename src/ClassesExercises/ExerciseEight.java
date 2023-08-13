package ClassesExercises;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("EVEN NUMBER");
        }
        else{
            System.out.println("ODD NUMBER");
        }

        sc.close();
    }
}
