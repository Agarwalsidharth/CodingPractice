package codeTheHellOut;


/*Complexity of Enqueue is O(n)
 * Complexity of Dequeue is O(1)
 * Complexity of Searching is o(n)
 */

public class Queue<T> {
	
	Node<T> root;
	
	
	
	public Queue()
	{
		root = null;
	}
	
	
	public void Enqueue(T Value)
	{
		if(root == null)
		{
		root = new Node<T>();
		root.Value = Value;		
		}
		else
		{
			Node<T> Traverse = root;
			while(Traverse.next != null)
			{
				Traverse = Traverse.next;
			
			}
			Traverse.next = new Node<T>();
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
	
	public boolean search(T Value)
	{
		if(root == null)
		{
			return false;
		}
		else
		{
			Node<T> Traverse = root;
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
