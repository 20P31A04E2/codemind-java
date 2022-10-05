import java.util.Scanner;
class Adam
{
    public static int reverse(int n)
    {
        int r=0,digit=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            digit=(digit*10)+r;
        }
        return digit;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        int sq=n*n;
        int n_rev=reverse(n);
        int n_rev_sq=n_rev*n_rev;
        int n_rev_sq_rev=reverse(n_rev_sq);
        if(sq==n_rev_sq_rev)
        System.out.println("True");
        else
        System.out.println("False");
    }
}