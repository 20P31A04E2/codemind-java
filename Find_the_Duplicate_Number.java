import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],i,found=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for( int j=i+1;j<n;j++)
            {
                if(x[i]==x[j])
                {
                System.out.println(x[i]);
                found++;
                break;
                }
            }
            if(found==1)
            break;
        }
    }
}