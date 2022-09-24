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
        int l,u,i,count=0;
        Scanner sc = new Scanner(System.in);
        l=sc.nextInt();
        u=sc.nextInt();
        for(i=l;i<=u;i++)
        {
            if(isprime(i))
            count++;
        }
        System.out.println(count);
    }
}