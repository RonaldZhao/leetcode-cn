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
        // DFS
        if (root == null)
            return 0;
        if (root.children.size() == 0)
            return 1;
        int ret = 0;
        for (Node child : root.children)
            ret = Math.max(ret, maxDepth(child));
        return ret + 1;
    }
}