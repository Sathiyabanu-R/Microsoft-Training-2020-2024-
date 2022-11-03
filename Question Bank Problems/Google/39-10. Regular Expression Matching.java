class Solution {
public boolean isMatch(String s, String p) {
    // if the pattern is zero return the value for string is zero.
    if (p.length() == 0) {
        return s.length() == 0;
    }
    // condition for checking if the second character is *
    if (p.length() > 1 && p.charAt(1) == '*') { 
        //substring(2)-checking condition in pattern index 2.
        if (isMatch(s, p.substring(2))) {
            return true;
        }
        if(s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0))) {
            //substring(1)-checking condition in string index 1.
            return isMatch(s.substring(1), p);
        }
        return false;
    } 
    //condition for checking if the second character is not *
    else {                                    
        if(s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0))) {
            return isMatch(s.substring(1), p.substring(1));
        }
        return false;
    }
}
}
