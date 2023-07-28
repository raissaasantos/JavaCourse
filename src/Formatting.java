public class Formatting {
    public static void main(String[] args) {

        double x = 10.35784;
        String name = "Cecily";
        int age = 18;
        double salary = 4000.0;
        System.out.println(x);
        System.out.printf("%.2f%n", x);//2 decimal places
        System.out.printf("%.4f%n", x); // %.4f%n + printf
        System.out.println("Result = "+ x + " meters");
        System.out.printf("Result = %.2f meters%n", x);
        System.out.printf("%s is %d years old and receives a salary of $ %.2f dollars%n", name, age, salary);

       /* %f = double number
          %d = int number
          %s = String
          %n = line break
        */
    }
}
