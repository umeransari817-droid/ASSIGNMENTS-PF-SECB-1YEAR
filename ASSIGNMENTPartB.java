import java.util.scanner;

public class ASSIGNMENTPartB {

    public static int[] toBinary(int num) {
        int[] arr = new int[32]; 
        int i = 0;

        while (num > 0) {
            arr[i] = num % 2;
            num = num / 2;
            i++;
        }

        return Arrays.copyOf(arr, i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] result = toBinary(num);

        System.out.print("Binary: ");
        for (int j = result.length - 1; j >= 0; j--) {
            System.out.print(result[j]);
        }
    }
}
