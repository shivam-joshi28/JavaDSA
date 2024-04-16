//package String;
// palindrome means the word should be same if we reverse it  like e.g. abba , aba, mama, papa

public class CheckPalindrome {

    public static boolean checkPanlindrome(String str){
        int firstIndex =0;                 // starting from first index
        int lastIndex = str.length()-1;   // starting from last index
        while(firstIndex < lastIndex){
            if(str.charAt(firstIndex)!= str.charAt(lastIndex)){
                return false;   
            }
            else{
                firstIndex++;
                lastIndex--;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        String str = "aba";
        System.out.println(checkPanlindrome(str));
    }
}
