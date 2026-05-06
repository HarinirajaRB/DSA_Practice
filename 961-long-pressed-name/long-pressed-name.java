class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int l = 0;
        int s = 0;
        int count = 0;

        while (l < name.length() && s < typed.length()) {

            // last characters must match
            if(name.charAt(name.length() - 1) != typed.charAt(typed.length() - 1)){
                return false;
            }

            // normal match
            if (typed.charAt(s) == name.charAt(l)) {
                l++;
                s++;
                count++;
            } 
            else {

                // valid long press
                if(s > 0 && typed.charAt(s) == typed.charAt(s - 1)){
                    s++;
                }
                else{
                    return false;
                }
            }
        }

        // remaining characters in typed should be same as previous
        while(s < typed.length()){

            if(typed.charAt(s) != typed.charAt(s - 1)){
                return false;
            }

            s++;
        }

        // both strings should be fully traversed
        if(count == name.length() && l == name.length()){
            return true;
        }

        return false;
    }
}