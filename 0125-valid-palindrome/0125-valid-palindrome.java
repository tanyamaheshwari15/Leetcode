class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() <= 1) return true;
        char[] chars = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        int last = chars.length-1;
        int first = 0;

        while(first < last){
            if(chars[first] == chars[last]){
                last--;
                first++;
            }
            else return false;
        }

        return true;
    }
}