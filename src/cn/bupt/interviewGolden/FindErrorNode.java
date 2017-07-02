package cn.bupt.interviewGolden;

import java.util.Arrays;

/**
 * Created by chongli on 2017/7/2.
 */
public class FindErrorNode {

    public static void main(String args[]){
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(5);
        TreeNode node8 = new TreeNode(8);

        node3.left = node2;
        node3.right = node4;
        node2.left = node1;
        node4.right = node7;
        node7.left = node5;
        node7.right = node8;
        node5.right = node6;
        FindErrorNode findErrorNode = new FindErrorNode();
        int[] error = findErrorNode.findError(node3);
        System.out.println(Arrays.toString(error));


    }

    private int pre=Integer.MIN_VALUE;
    private int firstError;
    private int lastError;
    private boolean first = true;
    public int[] findError(TreeNode root) {
        // write code here
        int error[] = new int[2];
        inSearch(root);
        error[0] = lastError;
        error[1] = firstError;
        return error;
    }

    private void inSearch(TreeNode root){

        if (root !=null){
            inSearch(root.left);
            int curr = root.val;
            if (curr < pre){
                if (first){
                    firstError = pre;
                    first = false;
                }
                lastError = curr;
            }
            pre = curr;
            inSearch(root.right);

        }
    }
}
