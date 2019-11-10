package codeTheHellOut;


/*Complexity of Enqueue is O(n)
 * Complexity of Dequeue is O(1)
 * Complexity of Searching is o(n)
 */

public class Queue {
	
	Node root;
	
	
	
	public Queue()
	{
		root = null;
	}
	
	
	public void Enqueue(int Value)
	{
		if(root == null)
		{
		root = new Node();
		root.Value = Value;		
		}
		else
		{
			Node Traverse = root;
			while(Traverse.next != null)
			{
				Traverse = Traverse.next;
			
			}
			Traverse.next = new Node();
			Traverse = Traverse.next;
			Traverse.Value = Value;
			
		}
	}
	
	
	public void dequeue()
	{
		if(root==null)
		{
			System.out.println("Nothing to pop");		
		}
		else
		{
			root = root.next;
		}
	}
	
	public boolean search(int Value)
	{
		if(root == null)
		{
			return false;
		}
		else
		{
			Node Traverse = root;
			while(Traverse != null)
			{
				if(Traverse.Value == Value)
				{
					return true;
				}
				
				Traverse = Traverse.next;
			}
		}
		return false;
	}
	
	
}
