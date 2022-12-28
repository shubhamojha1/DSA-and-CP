/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    /*
    First approach: Iterative using Stack i.e. DFS
    */
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        //Stack used to simulate and handle inOrder insertion of elements
        TreeNode current = root;
        while(current!=null || !stack.isEmpty()){
            while(current!=null){                     //Keep going left and push in stack
                stack.push(current);              // Add left most child, then add ancestor/parent, then add right child
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }
}
/*
  Second approach: Recursive, using built-in function call stack
  Disadvantage: Too many function calls could cause memory overflows 
  Advantage: Easier + Intuitive to write, as each node in a BST, is a sub-BST in itself.
*/
    ArrayList<Integer> arr = new ArrayList<Integer>();          //Global variables avoidable, can use helper function instead.
    public List<Integer> inorderTraversal2(TreeNode root) {
        if(root!=null){
            inorderTraversal(root.left);
            arr.add(root.val);
            inorderTraversal(root.right);
        }
        return arr;
    }
}
/*
  NEW LEARNING: Morris Traversal using **Threaded Binary Trees**
 
*/
  public List<Integer> inorderTraversal3(TreeNode root){
        return null;
  }
