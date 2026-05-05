import java.util.Scanner;

public class ASSIGNMENTPartC {

    public static String toBinary(int num) {
        String result = "";

        while (num > 0) {
            result = (num % 2) + result;
            num = num / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        String binary = toBinary(num);

        System.out.println("Binary: " + binary);
    }
}