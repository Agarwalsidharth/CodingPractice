package codeTheHellOut;

public class main {

	public static void main(String[] args) {
		
		
		//System.out.print("Objects not displaying");
	
		BinarySearchTree tree = new BinarySearchTree();
		tree.root =  tree.AddNode(tree.root,20);
		tree.root =  tree.AddNode(tree.root,10);
		tree.root =  tree.AddNode(tree.root,90);
		tree.root =  tree.AddNode(tree.root,2);
		tree.root =  tree.AddNode(tree.root,23);
		tree.root =  tree.AddNode(tree.root,16);
		tree.root =  tree.AddNode(tree.root,19);
		tree.root =  tree.AddNode(tree.root,45);
		tree.root =  tree.AddNode(tree.root,56);
		 
		 new DFSWithoutRecursion().PostOrder(tree.root);
		
		// TODO Auto-generated method stub

		 
		 
		 
	}

}
