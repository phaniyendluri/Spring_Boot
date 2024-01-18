package in.phaniit;

import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.phaniit.book.Bookrepo;

@SpringBootApplication
public class DataJpaCrudRepoAppApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(DataJpaCrudRepoAppApplication.class, args);
		System.out.println("Testing.....");
		Bookrepo repo = ctxt.getBean(Bookrepo.class);
		Book b1 = new Book();
		b1.setBookID(103);
		b1.setBookname("React.js");
		b1.setBookprice(6000.00);
		repo.deleteById(103);
		System.out.println("Record is inserted");

		Book b2 = new Book();
		b2.setBookID(103);
		b2.setBookname("Java Script");
		b2.setBookprice(6000.00);
		repo.deleteById(103);
		System.out.println("Record is inserted");
		repo.deleteAll(Arrays.asList(b1, b2));


		Optional<Book> findById = repo.findById(105);
		if (findById.isPresent()) {
			System.out.println("inside findby id is present");
			System.out.println(findById.get());

			Iterable<Book> findAllById = repo.findAllById(Arrays.asList(101, 102, 103, 104));
			for (Book b : findAllById) {
				System.out.println(b);
			}
			Iterable<Book> findAll = repo.findAll();
			for (Book b : findAll) {
				System.out.println(b);
			}
			if (repo.existsById(205)) {
				repo.deleteById(205);
			} else {
				System.out.println("Record not found");
			}
			List<Book> books = repo.findByBookpriceGreaterThan(1000.00);
			for (Book b : books) {
				System.out.println(b);
			}
			List<Book> bookprice = repo.getbook();
			for (Book b : bookprice) {
				System.out.println(b);
			}
		}
	}
}
		
		
	

//  	      repo.getbooks();
//		  for(Book b:book) {
//			  System.out.println(b);
//		  }
//		  }
//		  }



