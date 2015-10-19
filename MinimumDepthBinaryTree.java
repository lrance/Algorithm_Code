/*Given a binary tree, find its minimum depth.
	The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
*/
//TreeNode
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val){
		this.val = val;
	}
}
//Recursive Solution
public class Solution{
	public int minDepth(TreeNode root){
		if(root == null) return 0;
		getDepth(root, 1);
	}
	
	public int getDepth(TreeNode root, int i){
		int left = i; int right = i;
		if(root.left != null) return getDepth(root.left, i+1);
		else if(root.right != null) return getDepth(root.right, i+1);
		else return 1+Math.min(left, right);
	}
}

//non-Recursive Solution
public class Solution{
	public int minDepth(TreeNode node){
		if(node == null) return 0;
		ArrayList<TreeNode> last = new ArrayList<TreeNode>();
		last.add(node);
		int depth = 1;
		
		while(!last.isEmpty()){
			ArrayList<TreeNode> curr = new ArrayList<TreeNode>();
			for(TreeNode root : last){
				if(root.left == null && root.right == null) return depth;
				if(root.left != null) node.add(root.left);
				if(root.right != null) node.add(root.right);
			}
			depth++;
			last = new ArrayList<TreeNode>(curr);
		}
		return depth;
	}
}