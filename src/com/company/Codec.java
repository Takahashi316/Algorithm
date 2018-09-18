package com.company;

public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        helper(root , res);
        return new String(res);
    }

    public void helper(TreeNode root , StringBuilder a) {
        if (root == null) {
            return;
        }
        a.append((char)(root.val));
        helper(root.left , a);
        helper(root.right , a);

    }
    // Decodes your encoded data to tree.
    int index = 0;
    public TreeNode deserialize(String data) {
        char[] input = data.toCharArray();
        return helper2(input , Integer.MIN_VALUE , Integer.MAX_VALUE);

    }
    private TreeNode helper2(char[] input , int min , int max) {
        if (index >= input.length || Integer.valueOf(input[index]) >= max || Integer.valueOf(input[index]) <= min) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(input[index++]));
        root.left = helper2(input , min,Integer.valueOf(root.val));
        root.right = helper2(input , Integer.valueOf(root.val) , max);
        return root;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
