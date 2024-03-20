class BigPalindrome
{
    public static void main(String args[])
    {
        String s="banana";
        String res="";

        for(int i=1;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(isPalindrome(s,i,j))
                {
                    String temp=s.substring(i,j+1);
                    if(res.length()<temp.length()) res=temp;
                }
            }
        }
        System.out.println(res);
    }
    public static boolean isPalindrome(String s,int start,int end)
    {
        int i=start;
        int j=end;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}