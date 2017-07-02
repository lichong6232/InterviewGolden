package cn.bupt.interviewGolden;

/**
 * Created by chongli on 2017/7/2.
 */
public class LongestDistance {

    private int longest=0;

    public int findLongest(TreeNode root) {
        // write code here
        getDist(root);
        return longest;
    }

    public int getDist(TreeNode root){
        if (root == null)
            return 0;
        int left = getDist(root.left);
        int right = getDist(root.right);

        longest = Math.max(left+right+1,longest);
        return Math.max(left,right)+1;

    }
}
