public class Main
{
    public static void main(String[]args)
    {

    }
    public static String lastFirstN(String s1, String s2, int n)
    {
        String first = s1.substring(0,n); //substring from 0 to n-1
        int indexOfNthToLast = s2.length() - n;
        String last = s2.substring(indexOfNthToLast); // starts at nth to last letter, and goes to the end 
        System.out.println(first);
        System.out.println(last);


}