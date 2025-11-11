//is_even(k) takes integer value and returns true if even and false if odd, cannot use multipication, division, or mod
import java.util.Scanner;

public class IsEven{

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number");
    
            if (!scanner.hasNextInt()){
                System.out.println("Please enter a valid integer input");
                return;  
            }

            int num = scanner.nextInt();

            if ((num & 1) == 0){
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }
    }
}