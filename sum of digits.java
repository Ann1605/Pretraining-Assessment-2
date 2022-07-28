import java.util.*;
public class Main
    {
        public static void main (String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the first number:");
            int a = sc.nextInt();
            System.out.print("Enter the Second number:");
            int b = sc.nextInt();
            System.out.print("Enter the Third number:");
            int c = sc.nextInt();
            a= a%10;
            b= b%10;
            c= c%10;
            int sum= a+b+c;
            System.out.print("Sum of the last digit:"+sum);
            
        }
    }
