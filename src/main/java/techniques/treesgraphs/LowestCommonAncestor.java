package techniques.treesgraphs;

public class LowestCommonAncestor {

    public static void main(String...args) {
        TreeNode root = new TreeNode(3);
        TreeNode p = new TreeNode(5);
        p.setLeftNode(new TreeNode(6));
        p.setRightNode(new TreeNode(2));
        TreeNode q = new TreeNode(1);
        q.setRightNode(new TreeNode(0));
        q.setLeftNode(new TreeNode(8));
        root.setLeftNode(p);
        root.setRightNode(q);

        TreeNode n = lowestCommonAncestor( root, p, q);
        System.out.println(n.getVal());
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( root == null ) {
            return null;
        } // if one of nodes is root, then root is common ancestor between them
        if( root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.getLeftNode(), p, q);
        TreeNode right = lowestCommonAncestor(root.getRightNode(), p, q);

        // if both nodes are not null, then that means root is common between them.
        if( left != null && right != null) {
            return root;
        }

        if( left != null) {
            return left;
        }
        return right;

    }


}
