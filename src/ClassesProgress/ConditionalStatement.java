package ClassesProgress;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int time;

        System.out.println("What time is it? ");
        time = sc.nextInt();

        if (time < 12) {
            System.out.println("Good morning!");
        }
        else {
            if (time < 18){
                System.out.println("Good afternoon!");
            }
            else {
                System.out.println("Good night!");
            }
        }
        sc.close();
    }
}
