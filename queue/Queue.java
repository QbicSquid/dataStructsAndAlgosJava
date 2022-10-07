class Queue {
	private int[] data;
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		data = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(int value) {
		if (!canInsert()) return;

		nItems++;
		data[++rear] = value;
	}

	public int remove() {
		if (isEmpty()) return Integer.MIN_VALUE;

		nItems--;
		return data[front++];
	}

	public int peek() {
		if (isEmpty()) return Integer.MIN_VALUE;

		return data[front];
	}

	public boolean canInsert() {
		return (nItems < maxSize && front < maxSize - 1);
	}

	public boolean isEmpty() {
		return (nItems == 0);	
	}
}