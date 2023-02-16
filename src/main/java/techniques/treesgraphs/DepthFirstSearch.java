package techniques.treesgraphs;

public class DepthFirstSearch {
    public static void main(String...args) {
        TreeNode root = new TreeNode(0);
        TreeNode right1 = new TreeNode(2);
        right1.setRightNode(new TreeNode(5));
        root.setRightNode(right1);

        TreeNode left1 = new TreeNode(1);
        TreeNode left2 = new TreeNode(3);
        TreeNode left3 = new TreeNode(6);

        left1.setLeftNode(left2);
        left2.setLeftNode(left3);

        TreeNode left21 = new TreeNode(4);
        TreeNode left31 = new TreeNode(7);
        TreeNode right31 = new TreeNode(8);
        left21.setLeftNode(left31);
        left21.setRightNode(right31);

        left1.setRightNode(left21);

        root.setLeftNode(left1);

        dfs(root);

    }

    private static void dfs(TreeNode node) {
        if( node == null ) {
            return;
        }
        dfs( node.getRightNode());
        dfs( node.getLeftNode());
        System.out.println("Value = " + node.getVal());
    }
}
