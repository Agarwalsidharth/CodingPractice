package codeTheHellOut;

public class MergeSort {
	
	
	
	public void Sort(int[] Array)
	{
		
		
		if(Array.length <= 1)
			return;
		
		else
		{
		int end = Array.length;
		int mid = end/2;
		int[] left = new int[mid];
		int[] right = new int[end-mid];
		
		
		for(int i=0;i<mid;i++)
		{
			left[i] = Array[i];
		}
		
		for(int i=mid;i<end;i++)
		{
			right[i-mid] = Array[i];
		}
		
		Sort(left);
		Sort(right);
		merge(Array,left,right);
		}
	}
	

	public void merge(int[] Result,int[] left, int[] right)
	{
		
		int leftind = left.length;
		int rightind  = right.length;
		int i=0,j=0,k=0;
		
		
		while(i < leftind && j < rightind)
		{
			if(left[i] > right[j])
			{
				Result[k] = right[j];
				j++;
			}
			
			
			else
			{
				Result[k] = left[i];
				i++;
			}
			
			k++;
		}
		
		
		while(i<leftind)
		{
			Result[k] = left[i];
			i++;
			k++;
		}
		
		
		while(j<rightind)
		{
			Result[k]  = right[j];
			j++;
			k++;
		}
		
	}
	

}
