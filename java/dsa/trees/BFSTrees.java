package dsa.trees;

import java.util.*;

public class BFSTrees {
    static int index = -1;

    public static void main(String[] args) {
        int[] data = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree(data);
        bfsTraversal(root);
    }

    public static Node buildTree(int[] arr) {
        index++;
        if (index >= arr.length || arr[index] == -1) {
            return null;
        }
        Node newNode = new Node(arr[index]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);
        return newNode;
    }

    public static void bfsTraversal(Node rootNode) {
        if (rootNode == null) {
            System.out.println("No root node");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(rootNode);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.println(currentNode.data);

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }
}
