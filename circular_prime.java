import java.util.Scanner;
class Primes
{
    public static boolean isprime(int n)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static int rev(int n)
    {
        int sum=0,temp=n,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(!isprime(a))
        System.out.println("not prime");
        else if(isprime(rev(a)))
        System.out.println("circular prime");
        else
        System.out.println("prime but not a circular prime");
    }
}