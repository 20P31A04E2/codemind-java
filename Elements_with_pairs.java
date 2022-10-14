import java.util.Scanner;
class Ele
{
    public static void main(String args[])
    {
        int n,x[],i,j,count=1;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        if(n%2==0)
        {
            for(i=0;i<n;i++)
            {
                System.out.print(x[i]+" ");
            }
        }
        else
        {
            for(i=0;i<n;i++)
            {
                System.out.print(x[i]+" ");
            }
                System.out.print("0");
        }
    }
}