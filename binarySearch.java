/*import java.util.Arrays;
class binarySearch{
    public static void main(String[] args){
        char characters[]={'a','b','c','d','e'};
        System.out.println(Arrays.binarySearch(characters,'b'));
        System.out.println(Arrays.binarySearch(characters,'p'));
    }
}
*/
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args){
        int c, first, last, middle, n, search, array[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements");
        n = sc.nextInt();
        array = new int[n];
        System.out.println("Enter"+n+"Integer");
        for(c=0; c<n; c++)
            array[c] = sc.nextInt();
        System.out.println("Enter value to find ");
        search = sc.nextInt();
        first = 0;
        last = n-1;
        while(first<= last ){
        middle = (first + last)/2;
        if(array[middle]<search){
            first = middle+1;
        }
        else if (array[middle]==search) {
            System.out.println(search+ "             found at location               "  +(middle+1)+".");
            break; 
        }
        
        else {
            last = middle - 1;
            }
        }

        if(first>last){
            System.out.println(search+ "is not present in the list.\n");

                    }
                    sc.close();
    }
}   
