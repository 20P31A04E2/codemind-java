import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        String s;
        int Vowels=0,Consonants=0,Digits=0,Whitespaces=0;
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            Vowels++;
            else if(ch==32)
            Whitespaces++;
            else if(ch>=48 && ch<=57)
            Digits++;
            else
            Consonants++;
        }
        System.out.println("Vowels: "+Vowels);
        System.out.println("Consonants: "+Consonants);
        System.out.println("Digits: "+Digits);
        System.out.println("White spaces: "+Whitespaces);

    }
}