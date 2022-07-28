import java.util.*;

public class Main
    {
        public static void multiplication (int n,int arr1[][],int arr2[][])
        {
            int res[][]=new int[n][n];

            int i,j,k;

            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    res[i][i]=0;

                    for(k=0;k<n;k++)
                    {
                        res[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                    
                }
            }
            System.out.print("Multiplication");
            
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(res[i][j]+"");
                    
                        System.out.println();
                    
                   
                    
                }
            }
           
        }
        public static void addition (int n,int arr1[][],int arr2[][])
        {
            int i,j,temp;
            
            System.out.print("Addition");
            
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    temp = arr1[i][j]+ arr2[i][j];
                    System.out.print(temp+"");
                }   
                        System.out.println();
                    
            }
           
            
        }
        public static void subtraction (int n,int arr1[][],int arr2[][])
        {
            int i,j,temp;
            
            System.out.print("subtraction");
            
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    temp = arr1[i][j]- arr2[i][j];
                    System.out.print(temp+"");
                }   
                        System.out.println();
                    
            }
           
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            
            int arr1[][] = new int[n][n];
            int arr2[][] = new int[n][n];
            int i,j,k;
            
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    arr1[i][j]= sc.nextInt();
                }
            }
            
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    arr2[i][j]= sc.nextInt();
                }
            }
            System.out.println("1.Addition\n2.subtraction\n3.Multiplication");

            System.out.println("Enter your choice:");
            
            int choice =sc.nextInt();
            
            if(choice==1)

                addition(n,arr1,arr2);

            else if(choice==2)

                subtraction(n,arr1,arr2);

            else if(choice==3)

                multiplication(n,arr1,arr2);

            else

                System.out.println("Enter valid choice"); 
                
            
        }    
            
    }
