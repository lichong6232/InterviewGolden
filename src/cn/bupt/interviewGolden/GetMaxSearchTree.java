package cn.bupt.interviewGolden;

/**
 * Created by chongli on 2017/7/2.
 */
public class GetMaxSearchTree {

    public TreeNode getMax(TreeNode root) {
        // write code here
        int indicator[] = new int[3];
        return postOrder(root,indicator);
    }

    public TreeNode postOrder(TreeNode root,int indicator[]){
        if (root == null){
            indicator[0] = Integer.MIN_VALUE;//0是以root为节点的二叉搜索子树的最大值
            indicator[1] = Integer.MAX_VALUE;//1是以root为节点的二叉搜索子树的最小值
            indicator[2] = 0;//2是以root为节点的二叉搜索子树的节点个数
            return null;
        }
        TreeNode leftNode = postOrder(root.left,indicator);
        int leftMax = indicator[0];
        int leftMin = indicator[1];
        int leftNumber = indicator[2];
        TreeNode rightNode = postOrder(root.right,indicator);
        int rightMax = indicator[0];
        int rightMin = indicator[1];
        int rightNumber = indicator[2];
        int val = root.val;
        indicator[0] = Math.max(rightMax,val);
        indicator[1] = Math.min(leftMin,val);
        if (leftNode == root.left && rightNode == root.right && leftMax < val && rightMin > val){
            indicator[2] = leftNumber + rightNumber;
            return root;
        }
        indicator[2] = Math.max(leftNumber,rightNumber);
        return rightNumber >= leftNumber?rightNode:leftNode;
    }
}
