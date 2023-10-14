package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.tree.TreeNode;

public class binaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans =  morrisTraversal(root);
        Collections.reverse(ans);
        return ans;
    }
    public List<Integer> morrisTraversal(TreeNode node){
        List<Integer> ans = new ArrayList<>();

        while(node!=null){
            if(node.right == null){
                ans.add(node.val);
                node = node.left;
            }else{
                TreeNode nodep1 = node.right; 

                while(nodep1.left != null && nodep1.left != node){
                    nodep1 = nodep1.left;
                }
                if(nodep1.left == null){ 
                    ans.add(node.val);
                    nodep1.left = node;
                    node = node.right;
                }
                else{
                    nodep1.left = null;
                    node = node.left;
                }
            }
        }
        return ans;
    }
}
