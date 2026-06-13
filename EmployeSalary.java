import java.util.Scanner;
public class EmployeSalary {
        public static void main(String[] args){
            float hra; float da; float salary; int id ;int n; float m; float tax; 
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a employee id:");
            n = sc.nextInt();
            id = n;
            System.out.println("enter a basic salary:");
            m = sc.nextInt();
            salary = m;

            hra = (salary*20)/100;
            System.out.println("Hra="+hra);
            da = (salary*10)/100;
            System.out.println("Da="+da);

            double gross_salary= salary+hra+da;
            System.out.println("gross salary="+gross_salary);
               




        
        }
    }            