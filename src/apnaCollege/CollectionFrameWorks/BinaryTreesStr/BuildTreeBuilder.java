package apnaCollege.CollectionFrameWorks.BinaryTreesStr;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BuildTreeBuilder {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelorder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node curr = q.remove();

                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                System.out.print(curr.data + " ");

                    if (curr.left != null) {
                        q.add(curr.left);
                    }

                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }

        public static int countOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int left = countOfNodes(root.left);
            int right = countOfNodes(root.right);

            return left+right+1;
        }

        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum  = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return leftSum+rightSum+root.data;
        }

        public static int heightOfTree(Node root) {
            if (root == null) {
                return 0;
            }

            int heightOfLeft = heightOfTree(root.left);
            int heightOfRight = heightOfTree(root.right);

            return Math.max(heightOfLeft, heightOfRight) + 1;
        }

        public static int diaOfTree(Node root) {
            if (root == null) {
                return 0;
            }

            int diaOfLeft = diaOfTree(root.left);
            int diaOfRight = diaOfTree(root.right);
            int dia = heightOfTree(root.left) + heightOfTree(root.right) + 1;

            return Math.max(dia, Math.max(diaOfLeft, diaOfRight));

//            if (diaOfLeft > diaOfRight) {
//                if (diaOfLeft > dia) {
//                    return diaOfLeft;
//                } else {
//                    return dia;
//                }
//            } else {
//                if (diaOfRight > dia) {
//                    return diaOfRight;
//                } else {
//                    return dia;
//                }
//            }
        }

        static class TreeInfo {
            int ht;
            int dia;

            TreeInfo(int ht, int dia) {
                this.ht = ht;
                this.dia = dia;
            }
        }

        public static TreeInfo diameter(Node root) {
            if (root == null) {
                return new TreeInfo(0,0);
            }

            TreeInfo left = diameter(root.left);
            TreeInfo right = diameter(root.right);

            int myHeight = Math.max(left.ht, right.ht) + 1;

            int diaLeft = left.dia;
            int diaRight = right.dia;
            int dia = left.ht + right.ht + 1;

            int myDia = Math.max(dia, Math.max(diaLeft, diaRight));

            return new TreeInfo(myHeight, myDia);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(root.data);
        BinaryTree.preorder(root);
        System.out.println();
        BinaryTree.inorder(root);
        System.out.println();
        BinaryTree.postorder(root);
        System.out.println();

        Queue<Integer> q = new ArrayDeque<>();
        BinaryTree.levelorder(root);

        System.out.println(BinaryTree.countOfNodes(root));

        System.out.println(BinaryTree.sumOfNodes(root));

        System.out.println(BinaryTree.heightOfTree(root));

        System.out.println(BinaryTree.diaOfTree(root));

        System.out.println(BinaryTree.diameter(root).dia);
    }
}