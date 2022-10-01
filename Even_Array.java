import java.util.Scanner;
class ele
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
            if(x[i]%2==0 || x[i]==0)
            continue;
            else
            System.out.println("False");
            System.exit(0);
        }
        System.out.println("True");
    }
}