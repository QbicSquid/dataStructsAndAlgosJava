public class Demo {
	public static void main(String args[]) {
		Stack stack = new Stack(4);

		while (!stack.isFull())
			stack.push((int)(Math.random() * 1000));

		stack.push((int)(Math.random() * 1000)); // check overflows

		System.out.println(stack.peek());

		while (!stack.isEmpty())
			System.out.println(stack.pop());

		System.out.println(stack.pop()); // check empty pops
	}
}