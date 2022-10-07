class Stack {
	private int[] data;
	private int maxSize;
	private int top;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		data = new int[maxSize];
		top = -1;
	}

	public void push(int value) {
		if (isFull()) return;
		data[++top] = value;
	}

	public int pop() {
		if (isEmpty()) return Integer.MIN_VALUE;
		return data[top--];
	}

	public int peek() {
		if (isEmpty()) return Integer.MIN_VALUE;
		return data[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return(top == maxSize - 1);
	}
}