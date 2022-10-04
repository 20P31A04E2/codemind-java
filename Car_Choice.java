import java.util.Scanner;
class car
{
    public static void main(String args[])
    {
        int n,i,x1,x2,y1,y2;
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        while(n>0)
        {
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
            float car1=(float)y1/x1;
            float car2=(float)y2/x2;
            if(car1>car2)
            System.out.println("1");
            else if(car1<car2)
            System.out.println("-1");
            else if(car1==car2)
            System.out.println("0");
            n--;
        }
    }
}