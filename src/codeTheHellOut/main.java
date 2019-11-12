package codeTheHellOut;

public class main {

	public static void main(String[] args) {
		
		
		//System.out.print("Objects not displaying");
	/*
		AvlTree tree = new AvlTree();
		tree.root =  tree.AddNode(tree.root,20);
		tree.root =  tree.AddNode(tree.root,10);
		tree.root =  tree.AddNode(tree.root,5);
		
		new BFS().BreadthFirstSearch(tree.root);
		
		*/
		// TODO Auto-generated method stub

		 
		 int[] Values = {18,90,54,12,1,87};
		 
		 
	new MergeSort().Sort(Values);
		 
	for(int i=0;i<Values.length;i++)
	{
	System.out.println(Values[i]);
	}
	
	}

}
