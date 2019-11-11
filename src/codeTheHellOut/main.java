package codeTheHellOut;

public class main {

	public static void main(String[] args) {
		
		
		//System.out.print("Objects not displaying");
	
		AvlTree tree = new AvlTree();
		tree.root =  tree.AddNode(tree.root,20);
		tree.root =  tree.AddNode(tree.root,10);
		tree.root =  tree.AddNode(tree.root,5);
		
		 
		 new AvlDFSRecursion().postorder(tree.root);
		
		// TODO Auto-generated method stub

		 
		 
		 
	}

}
