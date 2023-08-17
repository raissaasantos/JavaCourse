package ClassesExercises;

import java.util.Scanner;

public class ExerciseEleven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        double amount = sc.nextDouble();
        double total;

        if (code == 1) {
           total = amount * 4;
        }
        else {
            if (code == 2) {
                total = amount * 4.5;
            }
            else {
                if (code == 3){
                    total = amount * 5;
                }
                else {
                    if (code == 4) {
                        total = amount * 2;
                    }
                    else {
                        total = amount * 1.5;
                    }
                }
            }
        }

        System.out.printf("Total: R$%.2f%n", total);

        sc.close();
    }
}
