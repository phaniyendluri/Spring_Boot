package in.phaniit.book;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import in.phaniit.Book;
@Repository
public interface Bookrepo extends CrudRepository<Book, Integer>{
	 List<Book> findByBookpriceGreaterThan(Double price);
	 @Query(value = "Select * from book",nativeQuery = true)
	 public List<Book>m1();
	 @Query("from Book")
	 public List<Book>getbooks();
	 @Query(value = "select * from Book where bookprice = 1000 and Bookname = 'spring'",nativeQuery=true)
	 public List<Book>getbook();
}
	 

