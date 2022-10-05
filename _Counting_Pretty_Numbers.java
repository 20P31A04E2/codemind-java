import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        int n,n1,n2,i,r=0;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        while(n>0)
        {
            int count=0;
            n1=sc.nextInt();
            n2=sc.nextInt();
            for(i=n1;i<=n2;i++)
            {
                r=i%10;
                if(r==2 || r==3 || r==9)
                {
                    count++;
                }
            }
            System.out.println(count);
            n--;
        }
    }
}