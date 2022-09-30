import java.util.Scanner;
class binary
{
    public static void main(String args[])
    {
        int x[],n,i,dec=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int power=n-1;
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]!=0)
            {
            dec=dec+(int)Math.pow(2,power);
            }
            power--;
        }
        System.out.println(dec);
    }
}