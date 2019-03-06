package sort;

public class Main {

	private static SortAll sortAll = new SortAll();

	public static void main(String[] args) {
		Book list[] = { new Book(300), new Book(200), new Book(1000), new Book(500) };
		sortAll.sort(list, new BookComparator());
		for (int i = 0; i < list.length; i++) {
			System.out.println("Book's weight(g) : " + list[i].getWeight());
		}
	}

}
