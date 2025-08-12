package dsa.trees;

import java.util.Stack;

public class DFSTrees {
    static int index=-1;
    public static void main(String[] args) {
        int[] data = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree(data);
        dfsTraversal(root);
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
    public static void dfsTraversal(Node root){
        Stack<Node> stack=new Stack<>();
        if(root==null){
            return;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            Node poppedData=stack.pop();
            System.out.println(poppedData.data);
            if(poppedData.left!=null){
                stack.push(poppedData.left);
            }
            if(poppedData.left!=null){
                stack.push(poppedData.right);
            }
        }
    }

}
