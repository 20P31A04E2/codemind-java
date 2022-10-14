import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        String s;
        char c;
        int count=0;
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        c=sc.next().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==c)
            count++;
        }
        if(count>0)
        System.out.println(count);
        else
        System.out.println("-1");
    }
}