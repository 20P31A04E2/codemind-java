import java.util.Scanner;
class Mini
{
    public static void main(String args[])
    {
        int n,i,x[],k,sum=0;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<=k-1;i++)
        {
                sum=sum+x[i];
        }
        System.out.println(sum);
    }
}