import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Book{
	int id;
	String bookName, authorName, publishers;
	float price;
	
	public Book(int id, String bookName, String authorName, String publishers, float price){
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishers = publishers;
		this.price = price;
	}
}

public class ListOBJTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> list = new ArrayList<Book>();
		Book b1 = new Book(1,"Ramayan","Balmiki","Ram-Publishers",10.90f);
		Book b2 = new Book(2,"Mahabharat","Rishi Vyasa","Krishna-Publishers",12.90f);
		Book b3 = new Book(3,"RupSom Love","Somoparna-Rupam","SomRup-Publishers",90.90f);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book s: list){
			System.out.println(s.id + " " + s.bookName + " " + s.authorName + " " + s.publishers + " " + s.price);
		}
	}

}
