import java.util.Scanner;
public class palindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int given = num;
        int rev =0;

        while (num>0) {
            int  rem = num%10;
            rev = (rev*10)+rem;
            num = num/10;
                        
        }
        if (rev == given) {
            System.out.println("number is palindrone");

            
        }
        else
        {
            System.out.println("number is not palindrone");
        }
       
    }
}