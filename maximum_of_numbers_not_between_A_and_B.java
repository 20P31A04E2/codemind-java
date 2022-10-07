import java.util.Scanner;
class Ele
{
    public static void main(String args[])
    {
        int n,x[],i,a,b,big=0,count=0;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]<a || x[i]>b)
            {
                if(x[i]>big)
                big=x[i];
                count++;
            }
        }
        if(count==0)
        System.out.println("-1");
        else
        System.out.println(big);
    }
}