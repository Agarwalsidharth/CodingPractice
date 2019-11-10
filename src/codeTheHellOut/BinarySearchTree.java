package codeTheHellOut;


/*Complexity for adding a node in Binary Search Tree O(log n)
 * Complexity for Searching a node in Binary Search Tree O(log n)
 * Complexity for deleting a node in Binary Search Tree O(log n)
 */



public class BinarySearchTree {
	
	TreeNode root;
	
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	
	public TreeNode AddNode(TreeNode root, int Value)
	{
		
		if(root==null)
		{
			root = new TreeNode();
			root.Value = Value;
			return root;
		}
		else
		{
			if(root.Value > Value)
			{
				root.left = AddNode(root.left,Value);
			}
			else
			{
				root.right = AddNode(root.right,Value);
			}
		}
		return root;	
	}
	
	
	public TreeNode DeleteNode(TreeNode root,int Value)
	{
		if(root==null)
		{
			return null;
		}
		else if(root.Value > Value)
		{
			root.left = DeleteNode(root.left,Value);
		}
		else if(root.Value < Value)
		{
			root.right = DeleteNode(root.right,Value);
		}
		else
		{
			if(root.left == null && root.right == null)
				return null;
			
			else if(root.left != null)
				{
					root.Value = root.left.Value;
					root.left = null;
				}
			else if(root.right != null)
				{
					root.Value = root.right.Value;
					root.right = null;
				}
			else
			{
				TreeNode temp = FindNode(root.left);
				root.Value = temp.Value;
				root.left = DeleteNode(root.left,temp.Value);	
			}
		}
		return root;
	}
	
	
	public TreeNode FindNode(TreeNode root)
	{
		if(root.right == null)
			return root;
		else
		{
			FindNode(root.right);
		}
		return root;
	}
	
	

}
