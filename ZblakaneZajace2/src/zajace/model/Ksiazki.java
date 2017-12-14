package zajace.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Ksiazki {

	private StringProperty name = new SimpleStringProperty();
	private StringProperty author = new SimpleStringProperty();
	private IntegerProperty year = new SimpleIntegerProperty();
	
	
	public Ksiazki(String name , String author , int year){
		this.name.set(name);
		this.author.set(author);
		this.year.set(year);
	}

	public StringProperty getName() {
		return name;
	}

	public void setName(StringProperty name) {
		this.name = name;
	}
	
	public String getN(){
		return name.get();
	}

public StringProperty getAuthor() {
		return author;
	}

	public void setAuthor(StringProperty author) {
		this.author = author;
	}
	
	public String getA(){
		return author.get();
	}

	public IntegerProperty getYear() {
		return year;
	}

	public void setYear(IntegerProperty year) {
		this.year = year;
	}

	public Integer getY(){
		return year.get();
	}
	
	
	
}
