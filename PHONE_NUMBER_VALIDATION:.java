import java.util.Scanner;
class Phone
{
    public static void main(String args[])
    {
        long num;
        long r=0,count=0;
        Scanner sc = new Scanner (System.in);
        num=sc.nextLong();
        while(num>0)
        {
            r=num%10;
            count++;
            num=num/10;
        }
        if(r!=0 && count==10)
        System.out.println("Valid");
        else
        System.out.println("Invalid");
    }
}