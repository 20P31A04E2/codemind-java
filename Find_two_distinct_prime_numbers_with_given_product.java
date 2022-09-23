import java.util.Scanner;
class Prime
{
    public static boolean prime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int n,i,j=0,temp=0,flag=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(prime(i) && prime(n/i))
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
          System.out.println(i+" "+n/i);
          else
          System.out.println("-1");
        
    }
}