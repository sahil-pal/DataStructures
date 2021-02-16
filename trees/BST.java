package DataStructures.trees;

public class BST {
	
	private BSTNode root;
	
	public BST() {
		root = null;
	}
	
	public boolean isEmpty() {
		if(root == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insert(int data) {
		root = insertion(root,data);
	}
	
	public BSTNode insertion(BSTNode node, int data) {
		if(isEmpty()) {
			node = new BSTNode(data);
		}
		else {
			if(data <= node.getData()) {
				node.left = insertion(node.left,data);
			}
			else {
				node.right = insertion(node.right, data);
			}
		}
		return node;
	}
	
	public void inorder() {
		inorder_traversal(root);
	}
	
	public void inorder_traversal(BSTNode temp) {
		if(!isEmpty()) {
			inorder_traversal(temp.getLeft());
			System.out.println(temp.getData());
			inorder_traversal(temp.getRight());
		}
		else {
			
		}
	}
	
	public void preorder() {
		preorder(root);
	}
	
	private void preorder(BSTNode r) {
		if(r!=null) {
			System.out.println(r.getData()+" ");
		}
		preorder(r.getLeft());
		preorder(r.getRight());
	}
	
	public void postorder() {
		postorder(root);
	}
	
	private void postorder(BSTNode r) {
		if(r!=null) {
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.println(r.getData()+" ");
		}
	}
	
	
	public int CountBST(BSTNode temp) {
		if(isEmpty()) {
			int i = 1;
			i += CountBST(temp.getLeft());
			i += CountBST(temp.getRight());
			return i;
		}
		else {
			return 0;
		}
	}
	
	public boolean search(int value) {
		return searching(root,value);
	}
	
	public boolean searching(BSTNode r, int value) {
		boolean found = false;
		while((r!= null) && !found){
			int rvalue = r.getData();
			if(value < rvalue) {
				r = r.getLeft();
			}
			else if(value > rvalue) {
				r = r.getRight();
			}
			else {
				found = true;
				break;
			}
			found = searching(r,value);
		}
		return found;
	}
	
	public void delete(int k ) {
		if(isEmpty()) {
			System.out.println("Tree is empty");
		}
		else if(search(k) == false) {
			System.out.println(k+" is not present");
		}
		else {
			root = delete(root,k);
			System.out.println(k+" is deleted");
		}
	}
	
	private BSTNode delete(BSTNode root, int k) {
		BSTNode p1, p2, n;
		if(root.getData() == k) {
			BSTNode lt, rt;
			lt = root.getLeft();
			rt = root.getRight();
			if(lt == null && rt == null) {
				return null;
			}
			else if(lt == null) {
				p1 = rt;
				return p1;
			}
			else if(rt == null) {
				p1 = lt;
				return p1;
			}
			else {
				p2 = rt;
				p1 = rt;
				while(p1.getLeft()!= null) {
					p1 = p1.getLeft();
					p1.setLeft(lt);
					return p2;
				}
			}
			
			if(k < root.getData()) {
				n = delete(root.getLeft(),k);
				root.setLeft(n);
			}
			else {
				n = delete(root.getRight(),k);
				root.setRight(n);
			}
			
			
			}
		return root;
	}
	
	
}
