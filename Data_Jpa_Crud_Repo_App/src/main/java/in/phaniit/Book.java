package in.phaniit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
@Entity
public class Book {
@Id
private Integer BookID;
private String Bookname;
private Double bookprice;

public Integer getBookID() {
	return BookID;
}
public void setBookID(Integer bookID) {
	BookID = bookID;
}
public String getBookname() {
	return Bookname;
}
public void setBookname(String bookname) {
	Bookname = bookname;
}
public Double getBookprice() {
	return  bookprice;
}
public void setBookprice(Double bookprice) {
	  bookprice = bookprice;
}
@Override
public String toString() {
	return "Book [BookID=" + BookID + ", Bookname=" + Bookname + ", Bookprice=" + bookprice + "]";
}


}
