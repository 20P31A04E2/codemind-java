import java.util.Scanner;
class ele
{
    public static void main(String args[])
    {
        int n,x[],i,flag=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%2!=0)
            {
                if(i%2!=0)
                continue;
                else
                flag++;
            }
        }
        if(flag >0)
        System.out.println("False");
        else
        System.out.println("True");
    }
}