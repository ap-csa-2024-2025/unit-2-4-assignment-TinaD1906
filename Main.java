public class Main
{
    public static void main(String[]args)
    {
        String word = lastFirstN("cream", "butter", 3);
        System.out.println(word);
        stringManip("Hello", "hello");
    }

    public static String lastFirstN(String s1, String s2, int n)
    {
  
        int indexOfNthToLast = s1.length() - n;
        String last = s1.substring(indexOfNthToLast); // starts at nth to last letter, and goes to the end 
        String first = s2.substring(0,n); //substring from 0 to n-1
        // System.out.println(first);
        // System.out.println(last);
        return last+first;
    }

    public static void stringManip(String s1, String s2)
    {
        System.out.println(s1.toUpperCase()); // makes entire word upper case 
        String firstLetter = s2.substring(0,1); // isolate first letter in word
        firstLetter = firstLetter.toUpperCase(); // make the first letter into upper case 

        String lower = s2.toLowerCase(); //makes entire word lowercase 
        String restOfs2 = s2.substring(1); // gets the rest of the word but the first letter 
        System.out.println(firstLetter + restOfs2);
    }


}