import java.util.Scanner;
class Pair
{
    public static void main (String args[])
    {
        int n,x[],i,len=0;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        len=n;
        x=new int [n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        if(n%2==0)
        {
            for(i=0;i<n/2;i++)
            {
                System.out.print(x[i]+" ");
                System.out.print(x[len-1]+" ");
                len--;
            }
        }
        else
        {
            for(i=0;i<(int)n/2;i++)
            {
                System.out.print(x[i]+" ");
                System.out.print(x[len-1]+" ");
                len--;
            }
            System.out.println(x[(int)n/2]+" 0");
        }
    }
}