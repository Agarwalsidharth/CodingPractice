package codeTheHellOut;

public class Stack {
	
	/* Complexity of pushing a Node to Stack O(1)
	 * Complexity of popping a Node from Stack O(1)
	 * Question to be done using stack such as Removing Parenthesis, used for performing DFS without recursion
	 * Complexity for searching a Value O(n)
	 */
	
	
	
	Node root;
	
	
	public void Stack()
	{
		root = null;
	}
	
	public void push(int Value)
	{
		if(root==null)
		{
			root = new Node();
			root.Value = Value;
		}
		else
		{
			Node add = new Node();
			add.next = root;
			add.Value = Value;
		}
	}
	
	
	public void pop()
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
