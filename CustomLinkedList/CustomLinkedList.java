package CustomLinkedList;

public class CustomLinkedList {

    Node head;

    class Node {
        int val;
        Node next;

        Node(int data) {
            this.val = data;
            this.next = null;
        }
    }

    public void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // implement the delete method
    public void delete(int index) {

    }

    public void printList() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.val + "->");
            currentNode = currentNode.next;
        }
        System.out.println();

    }
}
