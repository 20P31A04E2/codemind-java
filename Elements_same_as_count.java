import java.util.Scanner;
class Frequency 
{
       public static void main(String[] args)
       {
        int n,i,j,x[],count=0,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        
        for(i=0;i<n;i++)
        {    count=1;
            if(x[i]!=-99)
            {
              for(j=0;j<n;j++)
              {
                if(x[i]==x[j] && i!=j)
                {
                    count++;
                    x[j]=-99;
                }
              }
              if(x[i]==count)
                {
                 System.out.print(x[i]+" ");
                  flag=1;
                }
            }
        }
        if(flag==0)
           System.out.println("-1");
    }
}