import java.util.Scanner;
class Palin
{
    public static boolean palindrome(int n)
    {
        int r=0,d=0,temp=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            d=(d*10)+r;
        }
        if(d==temp)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        int n,i,n1=0,n2=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=n+1; ;i++)
        {
            if(palindrome(i))
            {
               n1=i;
               break;
            }
        }
        for(i=n-1; ;i--)
        {
            if(palindrome(i))
            {
               n2=i;
               break;
            }
        }
        if((n1-n)>(n-n2))
        System.out.println(n2);
        else if((n1-n)==(n-n2))
        System.out.println(n2+" "+n1);
        else
                System.out.println(n1);
    }
}