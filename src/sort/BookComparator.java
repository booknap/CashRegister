package sort;

public class BookComparator implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		Book book1 = (Book) obj1;
		Book book2 = (Book) obj2;

		if (book1.getWeight() < book2.getWeight()) {
			return -1;
		} else if (book1.getWeight() > book2.getWeight()) {
			return 1;
		}
		return 0;
	}
}