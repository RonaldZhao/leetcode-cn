/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        // 以层序遍历的思路
        if (root == null)
            return 0;
        if (root.children.size() == 0)
            return 1;
        int ret = 1;
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        while (true) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Node node = queue.pop();
                if (node.children.size() > 0)
                    queue.addAll(node.children);
            }
            if (queue.isEmpty())
                break;
            ret++;
        }
        return ret;
    }
}