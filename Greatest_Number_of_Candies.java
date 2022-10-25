import java.util.Scanner;
class Candies
{
    public static void main(String args[])
    {
        int n,x[],num,big=0,i;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        num=sc.nextInt();
        for(i=0;i<n;i++)
        {
           if(x[i]>big)
           big=x[i];
        }
        for(i=0;i<n;i++)
        {
            if((x[i]+num)>=big)
            System.out.print("True"+" ");
            else
            System.out.print("False"+" ");
        }
    }
}