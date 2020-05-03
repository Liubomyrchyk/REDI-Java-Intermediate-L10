package movie;

public class Movie {
private String title;
private String name;

public Movie(String title, String name) {
	this.title = title;
	this.name = name;
	
}


public String getTitle() {
	return this.title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getName(String title) {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}
}
