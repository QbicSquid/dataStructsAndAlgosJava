public class Demo {
	public static void main(String args[]) {
		Queue q = new Queue(4);

		q.insert(11);
		q.insert(22);
		q.insert(33);
		q.insert(44);

		System.out.println(q.peek());

		while (!q.isEmpty())
			System.out.println(q.remove());
	}
}