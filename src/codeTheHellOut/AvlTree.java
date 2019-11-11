package codeTheHellOut;

import java.util.List;

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
	
	
	
	
	public AvlTreeNode deleteNode(AvlTreeNode root, int Value)
	{
		if(root == null)
		{
			return null;
		}
		
		else if(root.Value > Value)
		{
			root.left = deleteNode(root.left,Value);
		}
		else if(root.Value < Value)
		{
			root.right = deleteNode(root.right,Value);
		}
		else if(root.Value == Value)
		{
			if(root.right == null && root.left == null)
				root = null;
			else if(root.right == null)
			{
				root = root.left;
			}
			else if(root.left == null)
			{
				root = root.right;
			}
			else
			{
				AvlTreeNode left = findleft(root.left);
				root.Value = left.Value;
				root.left  = deleteNode(root.left,left.Value);
				
			}
		}
		
		int balance = Height(root.left) - Height(root.right);
		if(balance > 1)
		{
			if(Height(root.left.left) > Height(root.left.right))
			{
				root = RotateRight(root);
			}
			else
			{
				root.left = RotateLeft(root.left);
				root = RotateRight(root);
			}
		}
		else if( balance < -1)
		{
			if(Height(root.right.right) > Height(root.right.left))
			{
				root = RotateLeft(root);
			}
			else
			{
				root.right = RotateRight(root.right);
				root = RotateLeft(root);
			}
		}
		
		root.height = 1+Math.max(Height(root.left), Height(root.right));
		return root;
		
	}
	
	
	public boolean isBST(AvlTreeNode root,int high, int low)
	{
		if(root==null)
		{
			return true;
		}
		else if(root.Value >= low && root.Value <= high)
		{
			return isBST(root.left,root.Value,low) && isBST(root.right,high,root.Value);
		}
		else
		{
			return false;
		}
	}
	
	
	public List<Integer> sumBST(AvlTreeNode root,List<Integer> path, int Value)
	{
		if(Value == 0)
		{
			return path;
		}
		else if(root==null && Value > 0)
		{
			return null;
		}
		else if(root.Value > Value)
		{
			return null;
		}
		else
		{
			Value = Value-root.Value;
			if(sumBST(root.left,path,Value) != null)
			{
				path.add(root.Value);
				return path;
			}
			else if (sumBST(root.right,path,Value) != null)
			{
				path.add(root.Value);
				return path;
			}
			else
			{
				return null;
			}
		}
	}
	
	
	
	
	
	public AvlTreeNode findleft(AvlTreeNode root)
	{
		if(root.right == null)
			return root;
		else
			return findleft(root.right);
	}
	
	
}
