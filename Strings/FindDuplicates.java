import java.util.HashSet;
import java.util.Set;


//more improvement can be made
public class FindDuplicates {

  public static void main(String[] args) {
    findDuplication("heeelllleee");
  }

  private static void findDuplication(String array) {
    Set<Character> duplicatesCharSet = new HashSet<Character>();
    System.out.println("Duplicate char found at : ");
    for (int i = 0; i < array.length(); i++) {
      if (!duplicatesCharSet.add(array.charAt(i))) {
        System.out.print(array.charAt(i) + ",");
      }
    }
  }
}
