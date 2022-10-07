class CircQueue {
	private int[] data;
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;

	public CircQueue(int maxSize) {
		this.maxSize = maxSize;
		data = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(int value) {
		if (isFull()) return;

		nItems++;
		data[++rear % maxSize] = value;
	}

	public int remove() {
		if (isEmpty()) return Integer.MIN_VALUE;

		nItems--;
		int toReturn = data[front];
		front = (front + 1) % maxSize;
		return toReturn;
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}
}