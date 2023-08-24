import CustomLinkedList.CustomLinkedList;

public class DetectLoopLinkedList {

  

  public static void main(String[] args) {
    //create a LinkedList using CustomLinkedList
    CustomLinkedList list = new CustomLinkedList();
    list.add(1);
    list.add(14);
    list.add(52);
    list.add(10);
    list.add(10);
    list.printList();
    CustomLinkedList.Node headNode = list.getHeadNode();

    if (headNode != null) {
        CustomLinkedList.Node currentNode = headNode;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = headNode.next; // Creating the cycle
    }


    System.out.println(hasLoop(headNode));
}
  private static boolean hasLoop(CustomLinkedList.Node  head) {
      if (head == null)
          return false;

      CustomLinkedList.Node slow = head;
      CustomLinkedList.Node fast = head;

      while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
          if (slow == fast) {
              return true; // Loop is there
          }
      }

      return false; // No loop
  }
}
