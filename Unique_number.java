import java.util.Scanner;
class Unique
{   public static boolean isUnique(int num,int n)
    {
        int r=0;
        while(num>0)
        {
            r=num%10;
            num=num/10;
            if(r==n)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int num,r=0;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        while(num>0)
        {
            r=num%10;
            num=num/10;
            if(isUnique(num,r))
            continue;
            else
            System.out.println("Not Unique Number");
            System.exit(0);
        }
        System.out.println("Unique Number");
    }
}