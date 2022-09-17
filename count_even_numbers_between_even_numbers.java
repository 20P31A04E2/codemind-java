import java.util.Scanner;
class Mini
{
    public static void main(String args[])
    {
        int n,i,x[],count=0;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n-2;i++)
        {
            if(x[i]%2==0 && x[i+2]%2==0)
            {
                if(x[i+1]%2==0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}