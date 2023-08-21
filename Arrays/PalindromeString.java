package Arrays;
public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("avva"));
    }

    private static boolean isPalindrome(String string) {
        int s = 0;
        int e = string.length()-1;
        while(s < e){
            if(string.charAt(s)!= string.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    
}
