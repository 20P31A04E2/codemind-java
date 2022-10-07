import java.util.Scanner;
class uni
{
    public static void main(String args[])
    {
        int n,x[],i;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            int count=1;
            if(x[i]!=-99)
            {
                for(int j=0;j<n;j++)
                {
                    if(i!=j && x[i]==x[j])
                    {
                    x[j]=-99;
                    }
                }
                System.out.print(x[i]+" ");
            }
        }
    }
}