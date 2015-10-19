/**
We can use Factory design pattern to implement this
We are going to create a Shape interface and concrete classes implementing the Shape interface
*/

//Definition for binary Tree
public class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}

}

//Recursive Solution
public class Solution{
	public int maxDepth(TreeNode root){
		if(root==null) return 0;
		
		return getDepth(root, 1);
	}
	
	public int getDepth(TreeNode root, int i){
		int left = i; int right = i;
		if(root.right != null) return getDepth(root.right, i+1);
		if(root.left != null) return getDepth(root.left, i+1);
		
		return left > right ? left : right;
	}
}

//non-Recursive Solution
public class Solution{
	public int maxDepth(TreeNode root){
		if(root == null) return 0;
		
		ArrayList<TreeNode> q = new ArrayList<TreeNode>();
		q.add(root);
		int depth = 0;
		
		while(!q.isEmpty()){
			ArrayList<TreeNode> next = new ArrayList<TreeNode>();
			for(TreeNode node : q){
				if(node.left != null) next.add(node.left);
				if(node.right != null) next.add(node.right);
			}
			q = new ArrayList<TreeNode>(next);
			depth++;
		}
		return depth;
	}
	
}