package com.company.BST;

public class BinarySearch {


   public static int sum = 0;
    public static int max_level = Integer.MIN_VALUE;
    Node root;
    public BinarySearch() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }


   public static void sumOfNodesAtMaxDepth(Node root, int level) {
        if(root == null)
            return;
        if(level > max_level) {
            sum = root.key;
            max_level = level;
        }
        else if(level == max_level)
        {
            sum = sum + root.key;
        }
        sumOfNodesAtMaxDepth(root.left, level + 1);
        sumOfNodesAtMaxDepth(root.right, level + 1);
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        binarySearch.insert(50);
//        binarySearch.insert(30);
//        binarySearch.insert(20);
//        binarySearch.insert(40);
//        binarySearch.insert(70);
//        binarySearch.insert(60);
//        binarySearch.insert(80);
        binarySearch.insert(10);
        binarySearch.insert(75);
        binarySearch.inorder();
        System.out.println("Sum ");
        sumOfNodesAtMaxDepth(binarySearch.root, 0);
        System.out.println(sum);
    }
}
