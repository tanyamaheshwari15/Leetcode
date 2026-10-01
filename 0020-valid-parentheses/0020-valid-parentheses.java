class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        for(char ch: s.toCharArray()){
            if(!map.containsKey(ch))
                st.push(ch);
            else if(!st.isEmpty())
                if(st.peek() == map.get(ch)) 
                    st.pop();
                else return false;
            else return false;
        }

        if(st.isEmpty()) 
            return true;

        return false;
    }
}