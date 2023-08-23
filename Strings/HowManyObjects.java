public class HowManyObjects {

  public static void main(String[] args) {
    // Creating two strings using string literals ("code").
    String s1 = "code";
    String s3 = "code";

    // Creating a new string object using the 'new' keyword.
    String s2 = new String("code");

    // Printing the hash codes of the strings.
    System.out.println(s1.hashCode()); // Hash code of s1 (string literal "code").
    System.out.println(s2.hashCode()); // Hash code of s2 (newly created string object).
    
    // Comparing references of s3 and s1 to 
    // check if they point to the same object.
    System.out.println(s3 == s1); // True, as both s3 and s1 refer to the same string literal in the string pool.
    
    // Printing the hash code of s2 again.
    System.out.println(s2.hashCode()); // Hash code of s2 remains the same.
    
    // Comparing references of s3 and s2
    //  to check if they point to the same object.
    System.out.println(s3 == s2); // False, as s2 is a separate string object with a different reference than s3.
  }
}
