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
		
		MaxHeap Heap = new MaxHeap();
		
		Heap.AddValue(9);
		Heap.AddValue(12);
		Heap.AddValue(29);
		Heap.AddValue(8);
		
		for(int i=0;i<Heap.Size();i++)
		{
			System.out.println(Heap.get(i));
		}
		 
	}
}
