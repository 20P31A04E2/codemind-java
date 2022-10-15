import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        String s;
        int i,a=0,count=0,temp=0;
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u')
            count++;
            else
            {
                if(count>a)
                a=count;
                count=0;
            }
        }
        temp=count;
        if(temp<a)
        System.out.println(a);
        else
        System.out.println(temp);
    }
}
