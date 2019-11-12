package codeTheHellOut;

public class QuickSort {

	
	
	public void sort(int[] Array, int start,int end)
	{
		
		if(start<end)
		{	
			int part = partition(Array,start,end);
				sort(Array,start,part-1);
				sort(Array,part+1,end);
		}
					
	}
		
	
	
	
	public int partition(int[] Array,int low,int high)
	{
		int pivot = Array[high];
		int i = low-1;
		
		for(int j=low;j<high;j++)
		{
			if(Array[j] <= pivot)
			{
				i++;
				
				int swapTemp = Array[i];
	            Array[i] = Array[j];
	            Array[j] = swapTemp;
				
			}
		}
			
		int swapTemp = Array[i+1];
        Array[i+1] = Array[high];
        Array[high] = swapTemp;
		
        return i+1;
	}
	
	
	
	
}
