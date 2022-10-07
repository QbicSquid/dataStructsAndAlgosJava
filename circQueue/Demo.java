public class Demo {
	public static void main(String args[]) {
		CircQueue q = new CircQueue(4);
		int toInsert;

		// first use of whole queue
		System.out.println("Insertion order:");
		while (!q.isFull()) {
			toInsert = (int)(Math.random() * 1000);
			System.out.println(toInsert); 
			q.insert(toInsert);
		}

		System.out.println("Extraction order:");
		while (!q.isEmpty())
			System.out.println(q.remove());

		// second use
		System.out.println("Insertion order:");
		while (!q.isFull()) {
			toInsert = (int)(Math.random() * 1000);
			System.out.println(toInsert); 
			q.insert(toInsert);
		}

		System.out.println("Extraction order:");
		while (!q.isEmpty())
			System.out.println(q.remove());
	}
}