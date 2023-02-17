package techniques.treesgraphs;

public class PathSum {
    public static void main(String...args) {
        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode left = new TreeNode(3);

        root.setRightNode(right);
        root.setLeftNode(left);
        System.out.println(hasPathSum(root, 3));
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {

        return ( hasPath(root, 0, targetSum));

    }

    private static boolean hasPath(TreeNode root, int i, int targetSum) {
        if( root == null ) {
            return false;
        }
        if( root.getLeftNode() == null || root.getRightNode() == null ) {
            return ( i + root.getVal() ) == targetSum;
        }
        i += root.getVal();
        boolean left = hasPath(root.getLeftNode(), i, targetSum);
        boolean right = hasPath(root.getRightNode(), i, targetSum);
        return left || right;
    }

}
