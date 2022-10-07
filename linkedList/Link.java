class Link {
	public int data;
	public Link next;
	
	public Link(int data) { this.data = data; }

	public Link(int data, Link next) {
		this(data);
		this.next = next;
	}

	public void display() { System.out.println(data); }
}