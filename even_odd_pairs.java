import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        int e[]=new int[n];
        int o[]=new int[n];
        int j=0,k=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]%2==0)
            {
            e[j++]=x[i];
            }
            else
            {
                o[k++]=x[i];
            }
        }
        int min=Math.min(j,k);
        for(int i=0;i<min;i++)
          System.out.print(e[i]+" "+o[i]+" ");
        
        if(min==j)
          for(int i=min;i<k;i++)
            System.out.print(o[i]+" ");
        else
          for(int i=min;i<j;i++)
             System.out.print(e[i]+" ");
        if(n%2!=0)
          System.out.print("0");
    }
}