class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isValidSubBST(root, Long.MIN_VALUE, Long.MAX_VALUE); // 使用Long的极值是防止某节点的值是Integer.MAX_VALUE
    }

    private boolean isValidSubBST(TreeNode node, long low, long high) {
        if (node == null) {
            return true;
        }
        // 判断当前节点的值是否合法
        if (node.val <= low || node.val >= high) {
            return false;
        }
        // 返回左右子树综合后的结果
        return isValidSubBST(node.left, low, node.val) && isValidSubBST(node.right, node.val, high);
    }
}
