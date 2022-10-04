import java.util.Scanner;
class Ele
{
    public static void main (String args[])
    {
        int n,x[],i,sum=0;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            sum=sum+x[i];
        }
        System.out.println(sum);
    }
}