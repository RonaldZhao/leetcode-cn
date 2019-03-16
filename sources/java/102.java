class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    list.add(node.val);
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                }
                lists.add(list);
            }
        }
        return lists;
    }
}