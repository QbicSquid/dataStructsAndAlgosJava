public class Demo {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();

		for (int i = 0; i < 4; i++)
			list.insertFirst((int)(Math.random() * 1000));

		System.out.println("Display:");
		list.display();

		System.out.print("removeFirst: ");
		list.removeFirst().display();

		System.out.println("Display:");
		list.display();

		System.out.print("Find 2: ");
		list.find(2).display();

		list.insertAfter(1, 100000);
		System.out.println("InsertAfter(1, 100000) Display:");
		list.display();

		System.out.print("remove(2): ");
		list.remove(2).display();
		System.out.println("Display:");
		list.display();

		list.reverse();
		System.out.println("reverse() Display:");
		list.display();
	}
}