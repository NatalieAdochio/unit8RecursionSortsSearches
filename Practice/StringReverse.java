
public class StringReverse
{
    public static String reverse(String text)
    {
        if(text.length()==0)
        {
            return text;
        }
        
        char c = text.charAt(0);
        String rest = text.substring(1);
        String reverseText = reverse(rest);
        reverseText += c;
        return reverseText;
    }
    public static String reverseIter(String text)
    {
        String reverseText = " ";
        for(int i = text.length()-1; i>=0;i--)
        {
            char c = text.charAt(i);
            reverseText+= c;
        }
        return reverseText;
    }
    public static void main(String[] args)
    {
        System.out.println(StringReverse.reverse("hello"));
        System.out.println("Expected: olleh");
        System.out.println(StringReverse.reverseIter("hello"));
    }
}