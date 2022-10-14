import java.util.Scanner;
class Ele
{
    public static void main(String args[])
    {
        int n,x[],i,j,sum=0;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]!=-999)
            {
                for(j=0;j<n;j++)
                {
                    if(i!=j && x[i]==x[j])
                    {
                        x[j]=-999;
                    }
                }
                if(x[i]%2!=0)
                sum=sum+x[i];
            }
        }
        System.out.println(sum);
    }
}