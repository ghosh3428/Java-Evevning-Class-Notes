import java.util.Scanner;

//Program to check if a number is a Prime number.
class Prime
{
    public static void main(String [] a)
    {
        Scanner sc= new Scanner(System.in);

        System.out.printf("Enter a number : \n");
        int num = sc.nextInt();
        int count=0;
        for(int i = 1; i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count != 2)
        {
             System.out.printf("%d is not prime.",num);
        }
        else
        {
             System.out.printf("%d is  prime.",num);   
        }
    }
          
}


