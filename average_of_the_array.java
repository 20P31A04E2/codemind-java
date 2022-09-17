import java.util.Scanner;
class Mini
{
    public static void main(String args[])
    {
        int n,i,x[],sum=0;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
           sum=sum+x[i];
        }
        float avg=(float)sum/n;
        System.out.format("%.2f",avg);
    }
}