// Last updated: 7/12/2026, 9:44:24 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode increasingBST(TreeNode root) {
18        ArrayList<Integer> li=new ArrayList<>();
19        TreeNode ans=new TreeNode();
20        inorder(root,li);
21        Build(li,0,ans);
22        return ans.right;
23        
24    }
25    public static void inorder(TreeNode root,ArrayList<Integer> li){
26        if(root==null){
27            return;
28        }
29        inorder(root.left,li);
30        li.add(root.val);
31        inorder(root.right,li);
32    }
33    public TreeNode Build(ArrayList<Integer> li,int i,TreeNode ans){
34        if(i==li.size()){
35            return ans;
36        }
37        TreeNode newnode=new TreeNode(li.get(i));
38        ans.right=newnode;
39        Build(li,i+1,ans.right);
40        return ans;
41    }
42}