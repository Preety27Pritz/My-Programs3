class StringPalindrome2
{
    public static void main(String[] args) {
        String s="madam";
        if(isPalindrome(s)) System.out.println("String Palindrome");
        else System.out.println("Not a String Palindrome");
    }
    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}    