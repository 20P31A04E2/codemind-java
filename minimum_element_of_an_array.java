import java.util.Scanner;
class Mini
{
    public static void main(String args[])
    {
        int n,i,x[];
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int temp=x[0];
        for(i=0;i<n;i++)
        {
           if(x[i]<temp)
           {
               temp=x[i];
           }
        }
        System.out.println(temp);
    }
}