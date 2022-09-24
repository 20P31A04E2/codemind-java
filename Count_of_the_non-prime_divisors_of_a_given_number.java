import java.util.Scanner;
class prime
{
    public static boolean isprime(int n)
    {
        if(n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int n,i,count=1;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                if (!isprime(i))
                count++;
            }
        }
        System.out.println(count);
    }
}