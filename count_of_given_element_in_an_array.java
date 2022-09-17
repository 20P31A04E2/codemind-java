import java.util.Scanner;
class Mini
{
    public static void main(String args[])
    {
        int n,i,x[],count=0,k;
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
            if(x[i]==k)

                {
                    count++;
                }
            
        }
        System.out.println(count);
    }
}