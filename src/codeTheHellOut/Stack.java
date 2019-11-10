package codeTheHellOut;

public class Stack <T>{
	
	/* Complexity of pushing a Node to Stack O(1)
	 * Complexity of popping a Node from Stack O(1)
	 * Question to be done using stack such as Removing Parenthesis, used for performing DFS without recursion
	 * Complexity for searching a Value O(n)
	 */
	
	
	
     Node<T> root;
	int size;
	
	public Stack()
	{
		root = null;
		size = 0;
	}
	
	public void push(T Value)
	{
		if(root==null)
		{
			root = new Node<T>();
			root.Value = Value;
		}
		else
		{
			Node<T> add = new Node<T>();
			add.next = root;
			add.Value = Value;
			root = add;
		}
		size++;
	}
	
	
	public T pop()
	{
		if(root==null)
		{
			System.out.println("Nothing to pop");		
		}
		else
		{
			T Object = root.Value;
			root = root.next;
			return Object;
		}
		size--;
		return null;
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
	
	
	public boolean isEmpty()
	{
		if(root==null)
		{
			return true;
		}
		else
			return false;
	}
	
	
	public T peek()
	{
		if(root == null)
		{
			return null;
		}
		else
		{
			return root.Value;
		}
	}
	
	

}
