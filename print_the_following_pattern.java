import java.util.Scanner;
class Pattern 
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            for(i=1;i<=n;i++)
            {
                System.out.print(i);
            }
            System.out.println();
            n--;
        }
    }
}