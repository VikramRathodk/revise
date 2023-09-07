package Trees;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(50);
    bst.insert(85);
    bst.insert(56);
    bst.insert(9);
    bst.insert(8);
    bst.insert(5);
    bst.insert(9);

    bst.printBFS();
    bst.display();
    System.out.println("------------");

    bst.invertTree(bst.getRoot());
      bst.display();
  }
}
