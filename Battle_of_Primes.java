import java.util.Scanner;
class Battle
{
    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++)
         {
            if(n%i==0)
            count++;
        }
        if (count==0)
           return true;
        else
           return false;
    }
    public static void main(String args[])
    {
        int n1,n2,temp=0;
        Scanner sc =new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        int sum=n1+n2;
        for(int i=sum+1; ;i++)
        {
            if(isPrime(i))
            {
            temp=i;
            break;
            }
            else
            continue;
        }
        System.out.println(temp-sum);
    }
}