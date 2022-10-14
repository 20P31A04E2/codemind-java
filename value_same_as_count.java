import java.util.Scanner;
class Ele
{
    public static void main(String args[])
    {
        int n,x[],i,j,flag=0;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            int count=1;
            if(x[i]!=-999)
            {
                for(j=0;j<n;j++)
                {
                    if(i!=j && x[i]==x[j])
                    {
                        count++;
                        x[j]=-999;
                    }
                }
                if(x[i]==count)
                flag++;
            }
        }
        System.out.println(flag);
    }
}