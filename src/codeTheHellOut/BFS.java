package codeTheHellOut;

public class BFS {

	
	
	public void levelOrderprint(AvlTreeNode root, int Height)
	{
		if(Height==0)
		{
			System.out.print(root.Value+" ");
		}
		else
		{
			
			levelOrderprint(root.left,Height-1);
			levelOrderprint(root.right,Height-1);
		}
	}
	
	public void BreadthFirstSearch(AvlTreeNode root)
	{
		
		int height = Height(root);
		
		for(int i=0;i<height;i++)
		{
			levelOrderprint(root,i);
		}
		
	}
	
	public int Height(AvlTreeNode root)
	{
		if(root==null)
			return 0;
		else
		{
			int left = Height(root.left);
			int right = Height(root.right);
			if(left < right)
			{
				return ++right;
			}
			else
			{
				return ++left;
			}
		}
	}
	
	
	
}
