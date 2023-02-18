package techniques.treesgraphs.trees;

public class MaxDepthBinaryTree {
    public static void main(String...args) {
        TreeNode root = new TreeNode(0);
        TreeNode left1 = new TreeNode(1);
        TreeNode left2 = new TreeNode(3);
        TreeNode rightl2 = new TreeNode(4);

        left1.setLeftNode(left2);
        left1.setRightNode(rightl2);
        root.setLeftNode(left1);

        TreeNode right1 = new TreeNode(2);
        TreeNode right2 = new TreeNode(5);
        TreeNode right3 = new TreeNode(6);

        right1.setRightNode(right2);
        right2.setRightNode(right3);
        root.setRightNode(right1);

        System.out.println( findMaxDepth(root) );

    }

    private static int findMaxDepth(TreeNode root) {
        if( root == null ) {
            return 0;
        }
        int left = findMaxDepth(root.getLeftNode()) + 1;
        int right = findMaxDepth(root.getRightNode()) + 1;

        return Math.max(left, right);
    }
}
