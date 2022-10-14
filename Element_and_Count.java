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
        for(i=0;i<n;i++)
        {
            count=1;
            if(x[i]!=-999)
            {
                for(j=0;j<n;j++)
                {
                    if(i!=j && x[i]==x[j])
                    {
                        x[j]=-999;
                        count++;
                    }
                }
                System.out.print(x[i]+" "+count+" ");
            }
        }
    }
}