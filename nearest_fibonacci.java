import java.util.Scanner;
class fibonacci
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c=a+b,n;
        n=sc.nextInt();
        while(c<=n)
        {
            c=a+b;
            a=b;
            b=c;
            c=a+b;
        }
        if((c-n)>(n-b))
        System.out.println(b);
        else if((c-n)==(n-b))
        System.out.println(b+" "+c);
        else
        System.out.println(c);
    }
}