import java.util.Scanner;
class Arra
{
    public static void main(String args[])
    {
        int n,x[],count=0;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        x= new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]!=-99)
            {
                for(int j=0;j<n;j++)
                {
                    if(i!=j && x[i]==x[j])
                    {
                       x[j]=-99;
                       x[i]=-99;
                       count++;
                       break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}