package com.company;



public class min_Node {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    int closer;
    public int node_Finder(TreeNode root,int target){

        if(root.val>target){
            if(root.left!=null)return node_Finder(root.left,target);
            if(root.right!=null)return node_Finder(root.right,target);




        }
        else {


            closer = root.val;

            if (root.val == target) return target;

        }
        if((root.val-target)<0 && (closer-target)<(root.val-target)){

            closer=root.val;


        }

        if(root.left!=null){
           return node_Finder(root.left,target);


        }
        if(root.right!=null){


            return node_Finder(root.right,target);
        }
        return closer;




    }



}
