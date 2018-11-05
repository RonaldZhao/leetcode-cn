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
    public List<Integer> postorder(Node root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        List<Node> stack = new ArrayList<>();
        stack.add(root);
        while (stack.size() > 0) {
            int last = stack.size() - 1;
            Node n = stack.get(last);
            stack.remove(last);
            ret.add(n.val);
            if (n.children != null) {
                for (Node c : n.children) {
                    stack.add(c);
                }
            }
        }
        int n = ret.size();
        for (int i = 0; i < n / 2; i++) {
            int t = ret.get(i);
            ret.set(i, ret.get(n - 1 - i));
            ret.set(n - 1 - i, t);
        }
        return ret;
    }
}