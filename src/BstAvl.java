public class BstAvl{
    private class Node{
        int key,height;
        Node left,right;
        Node(int d){
            key=d;
            height= 1;
        }
    }
    private Node root;
    private int height(Node n){
        return (n == null) ? 0: n.height;
    }
    private int getBalance(Node n){
        return (n == null) ? 0 :height(n.left) - height(n.right);
    }
    private Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height=Math.max(height(y.left), height(y.right)) + 1;
        x.height=Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }
    private Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }
    public void insert(int key) {
        root=insertRecursive(root, key);
    }
    private Node insertRecursive(Node node, int key){
        if (node == null) return new Node(key);
        if (key < node.key) node.left = insertRecursive(node.left, key);
        else if (key > node.key) node.right = insertRecursive(node.right, key);
        else return node;
        return rebalance(node);
    }
    public void delete(int key){
        root = deleteRecursive(root, key);
    }
    private Node deleteRecursive(Node root,int key){
        if (root == null) return root;
        if (key < root.key) root.left = deleteRecursive(root.left, key);
        else if (key > root.key) root.right = deleteRecursive(root.right, key);
        else {
            if ((root.left == null)||(root.right == null)){
                Node temp = (root.left!=null) ? root.left : root.right;
                if (temp == null)
                    root=null;
                else
                    root = temp;
            } else{
                Node temp = minValueNode(root.right);
                root.key = temp.key;
                root.right = deleteRecursive(root.right, temp.key);
            }
        }
        if (root == null)
            return root;
        return rebalance(root);
    }
    private Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) current = current.left;
        return current;
    }
    private Node rebalance(Node z) {
        z.height = 1 + Math.max(height(z.left), height(z.right));
        int balance = getBalance(z);
        if (balance > 1 && getBalance(z.left) >= 0) return rightRotate(z);
        if (balance > 1 && getBalance(z.left) < 0) {
            z.left = leftRotate(z.left);
            return rightRotate(z);
        }
        if (balance < -1 && getBalance(z.right) <= 0) return leftRotate(z);
        if (balance < -1 && getBalance(z.right) > 0) {
            z.right = rightRotate(z.right);
            return leftRotate(z);
        }
        return z;
    }
    public void printTree() {
        print2DUtil(root, 0);
    }
    private void print2DUtil(Node root, int space) {
        final int COUNT = 5;
        if (root == null) return;
        space += COUNT;
        print2DUtil(root.right, space);
        System.out.print("\n");
        for (int i = COUNT; i < space; i++) System.out.print(" ");
        System.out.println(root.key);
        print2DUtil(root.left, space);
    }
}