package KeyboardInput;
import java.util.Scanner;


/**
 * Created by SankarEdala on 2/24/17.
 */
public class number6 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first num:");
        int num1 = in.nextInt();
        System.out.println("Second first num:");
        int num2 = in.nextInt();

        System.out.println("addition:"+(num1+num2));
        System.out.println("subtraction:"+(num1-num2));
        System.out.println("multiplication:"+(num1*num2));
        System.out.println("division:"+(num1/num2));
        System.out.println("modulus:"+(num1 % num2));


    }
}
