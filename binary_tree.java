package DSA;
import java.util.LinkedList;
import java.util.Queue;

public class binary {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static int countNodes(Node root){ 
        if(root == null){
            return 0;
        }
        int countOfLeftNodes = countNodes(root.left);
        int countOfRightNodes = countNodes(root.right);
        return countOfLeftNodes + countOfRightNodes + 1;
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = sumOfNodes(root.left);
        int rightNodes = sumOfNodes(root.right);
        return leftNodes + rightNodes + root.data;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int treeHeight = Math.max(leftHeight, rightHeight);
        return treeHeight + 1;
    }


        // Most Important
    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                //queue empty
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data+" ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(root.data);
        preOrder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        System.out.println();
        levelOrder(root);
        System.out.println();
        System.out.println(countNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root)); 
    }
}

