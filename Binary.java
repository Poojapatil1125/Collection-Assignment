package com.Question10;
//10) Suppose that you are given the In-Order traversal of the Binary Search Tree in the 
//form of ArrayList or Array. Now your task is that you have create a new ArrayList or 
//Array for the In-Order traversal of Binary Search Tree where all duplicates are 
//removed.
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
public class Binary {
    static Set<TreeNode> set = new HashSet<>();
    static Stack<TreeNode> stack = new Stack<>();
    // Function to build tree using given traversal
    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
        
        TreeNode root = null;
        for (int pre = 0, in = 0; pre < preorder.length;) {

            TreeNode node = null;
            do {
                node = new TreeNode(preorder[pre]);
                if (root == null) {
                    root = node;
                }
                if (!stack.isEmpty()) {
                    if (set.contains(stack.peek())) {
                        set.remove(stack.peek());
                        stack.pop().right = node;
                    }
                    else {
                        stack.peek().left = node;
                    }
                }
                stack.push(node);
            } while (preorder[pre++] != inorder[in] && pre < preorder.length);

            node = null;
            while (!stack.isEmpty() && in < inorder.length &&
                    stack.peek().val == inorder[in]) {
                node = stack.pop();
                in++;
            }

            if (node != null) {
                set.add(node);
                stack.push(node);
            }
        }

        return root;
    }
	 void printInorder(TreeNode node)
	    {
	        if (node == null)
	            return;

	        /* first recur on left child */
	        printInorder(node.left);

	        /* then print the data of node */
	        System.out.print(node.val + " ");

	        /* now recur on right child */
	        printInorder(node.right);
	    }
	 public static void main(String args[])
	    {
	        Binary tree = new Binary();

	        int in[] = new int[] { 9, 8, 4, 2, 10, 5, 10, 1, 6, 3, 13, 12, 7 };
	        int pre[] = new int[] { 1, 2, 4, 8, 9, 5, 10, 10, 3, 6, 7, 12, 13 };
	        int len = in.length;

	        TreeNode root = tree.buildTree(pre, in);

	        tree.printInorder(root);
	    }
	}

