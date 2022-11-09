import java.util.Scanner;
class Factors
{
    public static void main(String [] a)
    {
        Scanner sc= new Scanner(System.in);

        System.out.printf("Enter a number : \n");
        int num = sc.nextInt();

        System.out.printf("Factors of %d are : " , num);

        for(int i = 1 ; i<=num ; i++)
        {
            if(num % i == 0)
                System.out.printf("%d\t" , i);
        }
    }
}