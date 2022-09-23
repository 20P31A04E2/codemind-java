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
        int n,i,n1=0,n2=0,num;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            num=sc.nextInt();
            for(i=num; ;i++)
            {
                if(prime(i))
                {
                   n1=i;
                   break;
                }
            }
           for(i=num; ;i--)
           {
                if(prime(i))
                {
                    n2=i;
                    break;
                }
            }
            if((n1-num)>=(num-n2))
            System.out.println(n2);
            else
            System.out.println(n1);
            n--;
        }
    }
}