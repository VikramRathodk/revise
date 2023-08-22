public class ConvertCharArrayIntoInteger {
public static void main(String[] args) {
    char[] charArray = {'1','2','3','4','5','6','7'};
    
    //Approch 1
    int number = 0;
    
    for(int i = 0; i < charArray.length; i++) {
        number = number * 10 + (charArray[i] - '0');
    }

    //approach 2
    String newString = String.valueOf(charArray);
    
    System.out.println(number);
    System.out.println(newString);
}
}