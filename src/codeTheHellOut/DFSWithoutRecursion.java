package codeTheHellOut;

public class DFSWithoutRecursion {

	public void InOrder(TreeNode root)
	{
		Stack<TreeNode> treelist = new Stack<TreeNode>();
		
		while(root != null || !(treelist.isEmpty()))
		{
			while(root!=null)
			{
				treelist.push(root);
				root = root.left;
			}
			root = treelist.pop();
			System.out.println(root.Value);
			root = root.right;
		}
		
	}
	
	
	public void PreOrder(TreeNode root)
	{
		Stack<TreeNode> treelist = new Stack<TreeNode>();
		
		while(root != null || (!treelist.isEmpty()))
		{
			while(root!=null)
			{
				treelist.push(root);
				System.out.println(root.Value);
				root = root.left;
			}
			root = treelist.pop();
			root = root.right;
		}
		
	}
	
	public void PostOrder(TreeNode root)
	{
		Stack<TreeNode> treelist = new Stack<TreeNode>();
		
		while(root != null || !(treelist.isEmpty()))
		{
			while(root!=null)
			{
			   treelist.push(root);
			   treelist.push(root);
			   root = root.left;
			}
			
			root = treelist.pop();
			
			if((!treelist.isEmpty()) && (treelist.peek() == root))
			{
				root = root.right;
			}
			else
			{
				System.out.println(root.Value+" ");
				root = null;
			}
			
		}
			
		
		
	}
	
}
