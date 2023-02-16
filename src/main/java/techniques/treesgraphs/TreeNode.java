package techniques.treesgraphs;

public class TreeNode {
    private int val;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int val) {
        this.val = val;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public int getVal() {
        return val;
    }
}
