package KeyboardInput;
import java.util.Scanner;

/**
 * Created by SankarEdala on 2/24/17.
 */
public class number7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number:");
                int num = in.nextInt();
        for(int i=1;i<10; i++)
        {
            System.out.println(num+ "X"+ (i+1)+ "=" + (num*(i+1)));

        }

    }
}
