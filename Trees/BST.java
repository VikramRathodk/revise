package Trees;

import java.util.*;

import javax.swing.tree.TreeNode;


public class BST {

  private static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      left = null;
      right = null;
    }
  }

  private Node root;

  public BST() {
    root = null;
  }
  public Node getRoot(){
    return root;
  }

  //insert elements in tree
  public void insert(int data) {
    root = insertData(root, data);
  }

  private Node insertData(Node root, int data) {
    if (root == null) {
      return new Node(data);
    }

    if (data < root.data) {
      root.left = insertData(root.left, data);
    } else if (data > root.data) {
      root.right = insertData(root.right, data);
    }

    return root;
  }

  public void display() {
    inorder(root);
  }

  public List<List<Integer>> BFS() {
    List<List<Integer>> result = new ArrayList<>();
      if(root == null){
            return result;
        }
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        List<Integer> currentLevelList = new ArrayList<>();

        for (int i = 0; i < levelSize; i++) {
            Node currentNode = queue.poll();
            currentLevelList.add(currentNode.data);

            //not add null nodes in to queue
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
        result.add(currentLevelList);
    }
    return result;
}
public void printBFS() {
    List<List<Integer>> result = BFS();
    for (List<Integer> levelList : result) {
        for (Integer val : levelList) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
//Directly printing BFS 
 public void BFSTraversal() {
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);

    while (!((AbstractCollection<Node>) queue).isEmpty()) {
        int levelSize = ((LinkedList<Node>) queue).size();

        for (int i = 0; i < levelSize; i++) {
            Node currentNode = queue.poll();
            System.out.print(currentNode.data + " ");

            // Not adding null nodes into the queue
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }

        // Move to the next line after printing a level
        System.out.println();
    }
}

  public void inorder(Node root) {
    if (root != null) {
      inorder(root.left);
      System.out.print(root.data + " ->");
      inorder(root.right);
    }
  }
 
  public Node invertTree(Node root) {
        if(root == null){
            return null;
        }
    

    Node leftNode = invertTree(root.left);
    Node righNode= invertTree(root.right);

    root.left = righNode;
    root.right = leftNode;
    return root;
    }

}
