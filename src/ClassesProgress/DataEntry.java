package ClassesProgress;

import java.util.Scanner;

public class DataEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("You typed: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close();

    }
}

