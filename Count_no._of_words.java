import java.util.Scanner;
class No_of_words 
{
      public static void main(String args[])   
      {
              String s;
              int words=0;
              Scanner sc = new Scanner(System.in);
              s=sc.nextLine();
              for(int i=0;i<s.length();i++)
              {
                       char ch= s.charAt(i);
                       if(ch==' ' && s.charAt(i+1)!=' ')
                        words++;
               }
               System.out.println(words+1);
       }
}
                            
            