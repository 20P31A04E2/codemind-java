import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        String s;
        int i,temp=0;
        Scanner sc = new Scanner (System.in);
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            {
                int ascii=ch;
                if(ascii>temp)
                temp=ch;
            }
        }
        System.out.println((char)temp);
    }
}