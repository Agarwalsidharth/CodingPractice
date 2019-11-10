package codeTheHellOut;

public class DFSRecursion {

/* Complexity of this code is O(n) */
	
	
	public void inorder(TreeNode root)
	{
		if(root ==null)
		{
			return;
		}
		else
		{
			inorder(root.left);
			System.out.print(root.Value+" ");
			inorder (root.right);
		}
	}

	public void preorder(TreeNode root)
	{
		if(root ==null)
		{
			return;
		}
		else
		{
			System.out.print(root.Value);
			preorder(root.left);
			preorder (root.right);
		}
	}
	
	public void postorder(TreeNode root)
	{
		if(root ==null)
		{
			return;
		}
		else
		{
			
			postorder(root.left);
			postorder (root.right);
			System.out.print(root.Value);
		}
	}
	
}
