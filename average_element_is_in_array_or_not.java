import java.util.Scanner;
class Mini
{
    public static void main(String args[])
    {
        int n,i,x[],count=0,sum=0;
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
        int avg=(int)sum/n;
        for(i=0;i<n;i++)
        {
            if(x[i]==avg)
            count++;
        }
        if(count>=1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}