public class Demo {
	public static void main (String args[]) {
		BiSearchTree tree = new BiSearchTree();

		for (int i = 0; i < 4; i++)
			tree.insert((int)(Math.random() * 1000));
		tree.insert(222);

		tree.displayAsc();

		System.out.print("Find(222): ");
		tree.find(222).display();

		System.out.print("findAncestor(222): ");
		tree.findAncestor(222).display();
	}
}