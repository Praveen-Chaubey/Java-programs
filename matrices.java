import java.util.Scanner;

public class matrices {
    public static void main(String[] args){
        int n , m , c , d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of row and column ");
        m = sc.nextInt();
        n = sc.nextInt();
        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];
        System.out.println("enter a first element");
        
        for(c=0; c<m; c++)
            for(d=0; d<n; d++)       
        first[c][d] = sc.nextInt();
        System.out.println("enter a second element");
        for(c=0; c<m; c++)
            for(d=0; d<n; d++)
        second[c][d] = sc.nextInt();
        for(c=0; c<m; c++)
            for(d=0; d<n; d++)
        sum[c][d] = first[c][d] + second[c][d];
        
        System.out.println("sum of entered matrices:-");
        for(c=0; c<m; c++)
        {
            for(d=0; d<n; d++)
                System.out.println(sum[c][d]+"/t");
            System.out.println();
        }
    } 
    
}
