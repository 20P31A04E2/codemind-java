import java.util.Scanner;
class Ele
{
    public static void main(String args[])
    {
        int x[],n,i,sum=0,avg=0,count=0;
        Scanner sc = new Scanner(System.in);
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
        avg=(int)sum/n;
        for(i=0;i<n;i++)
        {
            if(x[i]>=avg)
            count++;
            else
            continue;
        }
        System.out.println(count);
    }
}