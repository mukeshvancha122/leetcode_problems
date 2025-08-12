package dsa.trees;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}

public class Tree {
    static int index=-1;
    public static void main(String[] args) {
        
        int[] data={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=buildTree(data);
        System.out.println("PreOrder: ");
        preOrderTraversal(root);
        inOrderTraversal(root);
        postOrderTraversal(root);
    }

    public static Node buildTree(int[] arr){
        index++;
        if(index>=arr.length || arr[index]==-1){
            return null;
        }
        Node newNode =new Node(arr[index]);
        newNode.left=buildTree(arr);
        newNode.right=buildTree(arr);
        return newNode;
    }
    public static void preOrderTraversal(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }
    public static void postOrderTraversal(Node node){
        if(node==null){
            return;
        }
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
        System.out.println(node.data);

    }
    public static void inOrderTraversal(Node node){
        if(node==null){
            return;
        }
        preOrderTraversal(node.left);
        System.out.println(node.data);
        preOrderTraversal(node.right);
        

    }

    
}
