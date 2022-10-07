import java.util.Scanner;
class Ele
{
    public static void main (String args[])
    {
        int n,x[],i,a,b,count=0;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%2!=0)
            System.out.print(x[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%2==0)
            System.out.print(x[i]+" ");
        }
    }
}