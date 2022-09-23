import java.util.Scanner;
class Prime
{
    public static boolean prime(int n)
    {
        if(n==1 || n==0)
        return false;
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
    public static void main(String args[])
    {
        int n,d=0,count=0,avg=0,r=0;
        Scanner sc =new Scanner (System.in);
        n=sc.nextInt();
        if(prime(n))
        {
            while(n>0)
            {
                r=n%10;
                n=n/10;
                d++;
                if(prime(r))
                {
                    count++;
                }
            }
            if(d==count)
              System.out.println("Mega Prime");
            else
              System.out.println("Not Mega Prime");
        }
        else
            System.out.println("Not Mega Prime");
    }
}