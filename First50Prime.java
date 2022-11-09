//Program to check if a number is a Prime number.
class First50Prime
{
    public static void main(String [] a)
    {
        int pCount = 0;
        int count=0;
        System.out.printf("First 50 Prime numbers are : ");
        for(int num = 1 ; pCount<50 ; num++)
        {
            count = 0;
            for(int i = 1; i<=num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                pCount++;
                System.out.printf("%d\t",num);
            }
        }
    }
          
}


