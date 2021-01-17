package application;

import java.util.Date;

import model.entities.Seller;
import model.entities.departament;

public class Program {

	public static void main(String[] args) {
		
		departament obj = new departament(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		System.out.println(seller);

	}

}
