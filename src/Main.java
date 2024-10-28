import java.util.Scanner;

public class Main {

    static int sum;
    static int count;
    static int number;
    final static int staticNumber = 1;

    public static void main(String[] args) {

        System.out.println("Enter your number greater then 0 : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        int input = number;

        while (input <= 0) {
            System.out.println(" Wrong number !Try again !");
            input = scanner.nextInt();
        }
        for (int a = 1; a <= number; a++)  {
            count++;
            System.out.println(count + ")"  + a);
            sum = 0;
        }
        for (int a = 1; a <=
                number; a++) sum += a; {
            count++;
            System.out.println(count + ")Sum our numbers is :"  + sum);
        }
    }
}
