
public class BinaryTree<K extends Comparable<K>> {
	private BinaryTreeNode<K> root;

	public void add(K key) {
		this.root = this.addRecursive(root, key);
	}

	private BinaryTreeNode<K> addRecursive(BinaryTreeNode<K> root, K key) {
		if (root == null) {
			return new BinaryTreeNode<>(key);
		}
		int comRes = key.compareTo(root.key);
		if (comRes == 0)
			return root;
		if (comRes < 0) {
			root.left = addRecursive(root.left, key);
		} else {
			root.right = addRecursive(root.right, key);
		}
		return root;
	}

	public void inOrder() {
		inOrderRec(this.root);
	}

	private void inOrderRec(BinaryTreeNode<K> root) {

		if (root != null) {
			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);
		}
	}

	public void preOrder() {
		preOrderRec(this.root);
	}

	private void preOrderRec(BinaryTreeNode<K> root) {

		if (root != null) {
			System.out.println(root.key);
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}

	public void postOrder() {
		postOrderRec(this.root);
	}

	private void postOrderRec(BinaryTreeNode<K> root) {
 
		if (root != null) {
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.println(root.key);
		}
	}

	private boolean containsNodeRecursive(BinaryTreeNode<K> root, K key) {
		if (root == null) {
			return false;
		}
		if (key == root.key) {
			return true;
		}
		if (key.compareTo(root.key)<0)
			return containsNodeRecursive(root.left, key);
		else
			return containsNodeRecursive(root.right, key);
	}

	public boolean containsNode(K key) {
		return containsNodeRecursive(root, key);
	}

}
