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
    public static int palindrome(int n)
    {
        int r=0,d=0,temp=n;
        while(n>0)
        {
            r=n%10;
            d=(d*10)+r;
            n=n/10;
        }
        return d;
    }
    public static void main(String args[])
    {
        int n,i,temp=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        temp=palindrome(n);
        if(isprime(n) && isprime(temp))
        System.out.println("circular prime");
        else if(isprime(n) && !isprime(temp))
        System.out.println("prime but not a circular prime");
        else
        System.out.println("not prime");
    }
}