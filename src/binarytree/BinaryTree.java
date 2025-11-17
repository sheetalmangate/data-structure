package ds.binarytree;

class Node {
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
	}
}


public class BinaryTree {
	
	Node root;
	
	public void insert(int data) {
		
		this.root = insertRecursive(this.root, data);
		
	}
	
	
	public Node insertRecursive(Node root, int data ) {
		
		if(root == null ) {
			root = new Node(data);
		}else if(data < root.data) {
			//insert on left side
			root.left = insertRecursive(root.left, data);
		}else if(data > root.data) {
			// insert on right side
			root.right = insertRecursive(root.right, data);
		}
		
		return root;
	}
	
	public void inorder() {
		System.out.println("Printing inorder tree");
		inorderRecursive(this.root);
	}
	
	public void inorderRecursive(Node root) {
		
		if(root != null ){
			inorderRecursive(root.left);
			System.out.print(root.data+" ");
			inorderRecursive(root.right);
		}
	}
	
	public void preorder() {
		System.out.println("Printing preorder tree");
		preorderRecursive(this.root);
	}
	
	public void preorderRecursive(Node root ){
		
		if(root != null ){
			System.out.print(root.data+ " ");
			preorderRecursive(root.left);
			preorderRecursive(root.right);
		}
	}
	
	public void postorder(){
		System.out.println("Printing postorder tree");
		postorderRecursive(this.root);
	}
	
	
	public void postorderRecursive(Node root){
		if(root != null ) {
			postorderRecursive(root.left);
			postorderRecursive(root.right);
			System.out.print(root.data+" ");
		}
		
	}
	
}