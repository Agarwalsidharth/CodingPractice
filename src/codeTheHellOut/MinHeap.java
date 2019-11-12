package codeTheHellOut;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {

	List<Integer> MinHeap = new ArrayList<Integer>();
	
	
	public void AddValue(int Value)

	{
		MinHeap.add(Value);
		
		SelfBalance(MinHeap,MinHeap.size()-1);
		
	}
	
	
	
	public void SelfBalance(List<Integer> MinHeap, int index)
	{
		if(index==0)
		{
			return;
		}
		else
		{
		int lastindex = index;
		int parentindex = (lastindex-1)/2;
		
		if(MinHeap.get(parentindex) > MinHeap.get(lastindex))
		{
			int temp = MinHeap.get(parentindex);
			MinHeap.set(parentindex, MinHeap.get(lastindex));
			MinHeap.set(lastindex, temp);
			SelfBalance(MinHeap,parentindex);
		}
		
		}
		
	}
	
	
	public int Size()
	{
		return MinHeap.size();
	}
	
	
	public int get(int index)
	{
		return MinHeap.get(index);
	}
	
}
		