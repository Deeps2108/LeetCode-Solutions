class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i = 0;i < s.length(); i++)
        {
        char ch = Character.toLowerCase(s.charAt(i));
        if(Character.isLetterOrDigit(ch))
        {
            str += ch;
        }
    }
        int l = 0;
        int r = str.length() - 1;
        while(l < r)
        {
            if(str.charAt(l) != str.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}