import java.util.Scanner;
class Prime
{
    public static boolean prime(int n)
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
    public static void main(String args[])
    {
        int n,i,n1=0,n2=0,num;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        if(prime(num))
        System.out.println("0");
        else
        {
            for(i=num+1; ;i++)
            {
                if(prime(i))
                {
                   n1=i;
                   break;
                }
            }
           for(i=num-1; ;i--)
           {
                if(prime(i))
                {
                    n2=i;
                    break;
                }
            }
            if((n1-num)>=(num-n2))
            System.out.println(num-n2);
            else
            System.out.println(n1-num);
        }
    }
}
