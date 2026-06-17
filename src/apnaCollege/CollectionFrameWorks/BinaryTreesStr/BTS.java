package apnaCollege.CollectionFrameWorks.BinaryTreesStr;

import java.util.ArrayList;

public class BTS {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean isFound(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return isFound(root.left, key);
        } else {
            return isFound(root.right, key);
        }
    }

    public static Node inorderSuccessor(Node root) {
        if (root.left == null) {
            return root;
        }

        return inorderSuccessor(root.left);
    }

    public static Node delete(Node root, int val) {
        if (root == null) {
            return root;
        }

        if (root.data == val) {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null || root.right == null) {
                if (root.left == null) {
                    return root.right;
                } else {
                    return root.left;
                }
            } else {
                Node successor = inorderSuccessor(root.right);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            root.right = delete(root.right, val);
        }

        return root;
    }

    public static void printInRange(Node root, int low, int high) {
        if (root == null) {
            return;
        }

        if (root.data >= low && root.data <= high) {
            printInRange(root.left, low, high);
            System.out.print(root.data + " ");
            printInRange(root.right, low, high);
        } else if (root.data > high) {
            printInRange(root.left, low, high);
        } else {
           printInRange(root.right, low, high);
        }
    }

    public static int countRootToLeafPath(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int leftPath = countRootToLeafPath(root.left);
        int rightPath = countRootToLeafPath(root.right);
        return leftPath+rightPath;
    }

    public static void rootToLeafPaths(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            for (Integer ele : path) {
                System.out.print(ele + "-->");
            }
            System.out.print("Path\n");
        } else {
            rootToLeafPaths(root.left, path);
            rootToLeafPaths(root.right, path);
        }
        path.removeLast();
    }

    public static void main(String[] args) {
        ArrayList<Integer> path = new ArrayList<>();
        int[] values = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);

        System.out.println("\n" + isFound(root, 7));

        delete(root, 7);
        inorder(root);
        System.out.println();

        printInRange(root, 2, 6);
        System.out.println("\n" + countRootToLeafPath(root));

        rootToLeafPaths(root, path);
    }
}