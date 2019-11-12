package codeTheHellOut;

public class Tries {

	TrieNode root;
	
	
	public Tries()
	{
		root = new TrieNode();
	}
	
	
	public void addString(TrieNode root,String input,int index)
	{
		if(index == input.length())
		{
			root.endofworld = true;
			return;
			
		}
		else
		{
			char ch = input.charAt(index);
			TrieNode node = root.children.get(ch);
			if(node == null)
			{
				node = new TrieNode();
				root.children.put(ch, node);
			}
			addString(node,input,index+1);
		}
	}
	
	
	public boolean searchString(TrieNode root,String word,int index)
	{
		if(index==word.length())
		{
			return root.endofworld;
		}
		else
		{
			char ch = word.charAt(index);
			TrieNode node = root.children.get(ch);
			if(node == null)
				return false;
			else
			return searchString(node,word,index+1);
		}
		
		
	}
	
	public boolean deleteWord(TrieNode root,String word,int index)
	{
		
		if(index==word.length())
		{
			if(!root.endofworld)
			{
				return false;
			}
			
			root.endofworld = false;
			return root.children.size()==0;
		}
		char ch = word.charAt(index);
			TrieNode node = root.children.get(ch);
			
			if(node == null)
			{
				return false;
			}
	boolean shoulddelete = deleteWord(node,word,index+1);
	
	if(shoulddelete)
	{
		root.children.remove(ch);
		
		return root.children.size() ==0;
	
	}
	return false;
		
	}
	
	
	
}
