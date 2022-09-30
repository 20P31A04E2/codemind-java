import java.util.Scanner;
class Capofdisc
{
    public static void main(String args[])
    {
        int c,t,s,b,c_kb=0;
        Scanner sc =new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        c=2*t*s*b*512;
        c_kb=c/1024;
        System.out.println(c_kb+"KB");
    }
}
