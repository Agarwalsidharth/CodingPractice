package codeTheHellOut;

public class AvlTree {

	AvlTreeNode root;
	
	
	public AvlTree()
	{
		root = null;
	}
	
	
	
	public AvlTreeNode AddNode(AvlTreeNode root, int Value)
	{
		
		if(root == null)
		{
			root = new AvlTreeNode();
			root.Value = Value;
			root.height = 1;
			return root;
		}
		else if(root.Value >= Value)
		{
			root.left = AddNode(root.left,Value);
			
		}
		else
		{
			root.right = AddNode(root.right,Value);
		}
		
		int balance = Height(root.left) - Height(root.right);
		if(balance > 1)
		{
			
				if(Height(root.left.left) >= Height(root.left.right))
				{
					root = RotateRight(root);
				}
				else
				{
					root.left = RotateLeft(root.left);
					root = RotateRight(root);
				}
		}
		else if(balance < -1)
		{
				if(Height(root.right.right) >= Height(root.right.left))
				{
					root = RotateLeft(root);
				}
				else
				{
					root.right = RotateRight(root.right);
					root = RotateLeft(root);
				}
		}
		root.height = Height(root);
		return root;
	}
	
	
	public AvlTreeNode RotateRight(AvlTreeNode root)
	{
		AvlTreeNode newNode = root.left;
		root.left = newNode.right;
		newNode.right = root;
		root.height = 1+Math.max(Height(root.left), Height(root.right));
		newNode.height = 1+Math.max(Height(newNode.left), Height(newNode.right));
		return newNode;
		
	}
	
	
	public AvlTreeNode RotateLeft(AvlTreeNode root)
	{
		AvlTreeNode newNode = root.right;
		root.right = newNode.left;
		newNode.left = root;
		root.height = 1+Math.max(Height(root.left), Height(root.right));
		newNode.height = 1+Math.max(Height(newNode.left), Height(newNode.right));
		return newNode;
	}
	
	
	public int Height(AvlTreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			int left = Height(root.left);
			int right = Height(root.right);
			if(left>right)
			{
				return ++left;
			}
			else
			{
				return ++right;
			}
			
		}
		
	}
	
	
}
