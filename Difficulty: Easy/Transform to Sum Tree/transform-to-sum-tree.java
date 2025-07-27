// User function template for JAVA

/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public int toSumTreeHelper(Node root) {
        if (root == null) return 0;

        int leftSum = toSumTreeHelper(root.left);
        int rightSum = toSumTreeHelper(root.right);

        int oldVal = root.data;
        root.data = leftSum + rightSum;

        return root.data + oldVal;
    }

    public void toSumTree(Node root) {
        toSumTreeHelper(root);
    }
}
