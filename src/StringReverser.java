public class StringReverser {
    public String reverseString(String s){
        String reversedString = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reversedString = reversedString + s.charAt(i);
        }
        return reversedString;
    }
}
