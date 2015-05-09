package ny.c4q.eboves;

public class Main
{

    public static void main(String[] args)
    {

        String source = "hello good old world";
        StringBuffer input = new StringBuffer();

        String[] strArr = source.split(" ");
        for(String str : strArr)
        {
            char[] stringArray = str.trim().toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);
            str = new String(stringArray);

            input.append(str).append(" ");
        }

        System.out.println(input.toString().trim());
        System.out.println(reverseWords2("java love i"));
    }

    public static String reverseWords2(String sentence)
    {
        StringBuilder sb = new StringBuilder(sentence.length() + 1);
        String[] words = sentence.split(" ");
        for(int i = words.length - 1; i >= 0; i--)
        {
            sb.append(words[i]).append(' ');
        }
        sb.setLength(sb.length() - 1);  // Strip trailing space
        return sb.toString();

    }


}
