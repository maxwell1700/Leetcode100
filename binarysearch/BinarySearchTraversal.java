package binarysearch;

import java.awt.*;
import java.util.*;
import java.util.List;

public class BinarySearchTraversal {

    public static void main(String[] args) {

        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(14);
        TreeNode c = new TreeNode(9);
        TreeNode d = new TreeNode(7);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(17);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

       // System.out.println(a.val);

       //System.out.println(withinTree(a,23));

        postOrderTreeTraversal(a);




    }

    static boolean withinTree(TreeNode root, int target){

        Stack<TreeNode> stack = new Stack<>();

        if(root == null){

            return false;
        }
        else if (root.val == target){
            return true;
        }

        stack.add(root);

        while(!stack.isEmpty()){

             TreeNode current = stack.pop();

            if(current.val == target){

                return true;

            }
            if (current.left != null){

               stack.add(current.left);

            }
            if(current.right != null){
                stack.add(current.right);
            }
        }

        return false;
    }


    static void postOrderTreeTraversal(TreeNode root){ // iteratively

        Stack<TreeNode>stack = new Stack<>();
        TreeNode curr = root;
        stack.push(root);


            while(root != null)
            {
            if(root.left != null){
                stack.push(root.left);
            } if( root.right != null){
                stack.push(root.right);
            }
            root = root.left;
            }


            root = curr.right;

            while(root != null)
            {
                if(root.left != null){
                    stack.push(root.left);
                }if( root.right != null){
                    stack.push(root.right);
                }
                root = root.right;
            }
            while(!stack.isEmpty()){
                System.out.println(stack.pop().val);
            }


    }


    static List<Integer> inOrderTreeTraversal(TreeNode root){
        Stack<TreeNode>stack = new Stack<>();
        List<Integer> order = new ArrayList<>();



        while(!stack.isEmpty() || root != null)
        {
            while(root != null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            order.add(root.val);
            root = root.right;
        }

        return order;

    }

    static boolean isSymmetrical(TreeNode root){

        if(root == null){
            return true;
        }

        Stack<TreeNode> s1 = new Stack<>();
        s1.push(root.left);
        s1.push(root.right);

        TreeNode left, right;


        while(!s1.isEmpty()){
            right = s1.pop();
            left = s1.pop();
            if(right == null && left == null) continue; // continue skips everything below and goes to next iteration so it wont add the null to stack
            if(right.val != left.val || left == null || right == null)// if one is null and the other isnt as if both it wouldve been caught in line above
            {
                return false;
            }
            s1.push(left.left);
            s1.push(right.right);
            s1.push(left.right);
            s1.push(right.left);

        }

        return true;
    }


    static boolean isSymmetricRecursive(TreeNode root){
       return root == null || isSymmetricRecusriveHelper(root.left,root.right);
    }

    static boolean isSymmetricRecusriveHelper(TreeNode left, TreeNode right) {
        if(left == null && right == null){
            return true;
        }

        if(left.val != right.val){
            return false;
        }

        return isSymmetricRecusriveHelper(left.left, right.right) && isSymmetricRecusriveHelper(left.right, right.left);

    }



}
