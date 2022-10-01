import java.util.Scanner;
class Cars
{
    public static void main(String args[])
    {
        int n1,n2,x,c1,c2;
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        x=sc.nextInt();
        c2=1;
        c1=c2+x;
        if(n1>n2)
        System.out.println("-1");
        else
        {
        for(int i=1; ;i++)
        {
            c1=c1+n1;
            c2=c2+n2;
            if(c2>c1)
            {
            System.out.println(i);
            break;
            }
        }
        }
    }
}