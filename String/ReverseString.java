// package String;

public class ReverseString {
 // function to reverse string 
    public static String reverseString(String str){
        String reversedString = "";
// // starting from last index and appending to reversedstring
//         for(int i = str.length()-1; i>=0; i--){
//             reversedString += str.charAt(i);
//         }

// starting from first index but we have changed just one thing that we are adding reversedstring (empty ) after char(i)
    for(int i=0; i<str.length();i++){
        reversedString = str.charAt(i)+ reversedString;
    }
        return reversedString;
    }

    public static void main(String[] args) {
        String str = "abcde";
        String reversedString = reverseString(str);
        System.out.println(reversedString);
    }
    
}