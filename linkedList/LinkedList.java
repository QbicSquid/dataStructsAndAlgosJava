class LinkedList {
	private Link first;

	public void insertFirst(int data) {
		first = new Link(data, first);
	}

	public Link removeFirst() {
		if (isEmpty()) return null;

		Link toReturn = first;
		first = first.next;
		return toReturn;
	}

	public void display() {
		Link current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
	}

	public void insertAfter(int index, int data) {
		if (isEmpty()) return;
		Link current = find(index);

		current.next = new Link(data, current.next);
	}

	public Link remove(int index) {
		if (isEmpty()) return null;
		if (index == 0) return removeFirst();

		Link parent = find(index - 1);
		Link current = parent.next;

		parent.next = current.next;
		return current;
	}

	public Link find(int index) {
		Link current = first;
		int i = 0;
		
		while (current != null) {
			if (i == index)
				return current;
			else
				current = current.next;
			i++;
		}

		return null;
	}

	public void reverse() {
		Link current = first, prev = null, next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		first = prev;
	}

	public boolean isEmpty() {
		return (first == null);
	}
}