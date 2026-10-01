class Solution {
    public boolean isPalindrome(String s) {
        int last = s.length()-1;
        int first = 0;

        while(first < last){
            if(!Character.isLetterOrDigit(s.charAt(first))){
                first++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(last))){
                last--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last))){
               return false;
            }
            last--;
            first++;
        }

        return true;
    }
}