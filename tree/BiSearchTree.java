class BiSearchTree {
	private Node root;

	public void insert(int data) {
		if (root == null) {
			root = new Node(data);
			return;
		}

		Node current = root;
		while(true) {
			if (data < current.data) {
				if (current.leftChild == null) {
					current.leftChild = new Node(data);
					return;
				} else
					current = current.leftChild;
			} else if (data > current.data) {
				if (current.rightChild == null) {
					current.rightChild = new Node(data);
					return;
				} else
					current = current.rightChild;
			} else
				return;
		}
	}

	public void displayAsc() {
		inOrderAsc(root);
	}

	public Node find(int value) {
		if (root == null) return null;
		if (root.data == value) return root;

		return findR(value, root);
	}
	private Node findR(int value, Node localRoot) {
		if (localRoot == null) return null;

		if (value < localRoot.data)
			return findR(value, localRoot.leftChild);
		else if (value > localRoot.data)
			return findR(value, localRoot.rightChild);
		else
			return localRoot;
	}

	private void inOrderAsc(Node localRoot) {
		if (localRoot != null) {
			inOrderAsc(localRoot.leftChild);
			localRoot.display();
			inOrderAsc(localRoot.rightChild);
		}
	}
}