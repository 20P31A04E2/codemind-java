import java.util.Scanner;
class Arr
{
    public static void main(String args[])
    {
        int n,x[],i,count=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=1;i<n-1;i++)
        {
            if(x[i-1]%2==0 && x[i+1]%2!=0 || x[i-1]%2!=0 && x[i+1]%2==0)
            count++;
        }
            if(x[n-1]%2==0 && x[1]%2!=0 || x[n-1]%2!=0 && x[1]%2==0)
            count++;
            if(x[n-1]%2==0 && x[0]%2!=0 || x[n-2]%2!=0 && x[0]%2==0)
            count++;
        System.out.println(count);
    }
}