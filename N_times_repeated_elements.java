import java.util.Scanner;
class Ele
{
    public static void main(String args[])
    {
        int n,x[],i,j,k,count=0,flag=0;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]!=-99)
            {
                count=1;
                for(j=0;j<n;j++)
                {
                    if(x[i]==x[j]&& i!=j)
                    {
                        count++;
                        x[j]=-99;
                    }
                }
                if(count==k)
                {
                    System.out.print(x[i]+" ");
                    flag=1;
                }
            }
        }
        if(flag==0)
        System.out.println("-1");
    }
}