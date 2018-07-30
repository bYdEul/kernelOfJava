package algorithm.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class twoThreeZero {

    public class TreeNode{
        private int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            this.val = x;
        }
    }

    public class Solution{
        public boolean isValidBST(TreeNode root){
            if(root == null) return true;
            List<Integer> list = new ArrayList<>();
            inOrder(root,list);

            for(int i=0;i<list.size();i++) {
                if(list.get(i) >= list.get(i+1))
                return false;
            }
            return true;
        }
    }

    private void inOrder(TreeNode root, List<Integer> list)
    {
        if(root == null) return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);

    }
}
