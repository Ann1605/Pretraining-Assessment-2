import java.util.*;

public class Main
{
    public static void generateRandomNum()
    {
        int min=1;

        int max=6;
        
        int dice=(int)(Math.random()*(max-min+1)+min);
        
        System.out.println(dice);
    }
    public static void main(String[] args)
{
        Scanner sc= new Scanner(System.in);

        int n=1;

        while(n!=3)
{
            System.out.print("Enter your choice:");

            n=sc.nextInt();

            if(n==1)
            {
                System.out.print("player 1:");

                generateRandomNum();
            }
            else if(n==2)
            {
                System.out.print("player 2:");

                generateRandomNum();
            }
            else
            {
                System.out.println("Exit");
            }
        }
    }
}
