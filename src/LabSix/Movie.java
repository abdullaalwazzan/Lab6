package LabSix;

public class Movie {
	private String name;
	private int ageRating;

	public Movie(String name, int ageRating) {
		this.name = name;
		this.ageRating = ageRating;
	}
	
	public String getName() {
		return this.name;
	
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getAgeRating() {
		return this.ageRating;
	}
	
	public void setAgeRating(int newAgeRating) {
		this.ageRating = newAgeRating;
	}
	
	public String toString() {
		String s = "Movie name is: " + this.getName() + 
				   "\n Move rating is: " + this.getAgeRating();
		return s;
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (!(o instanceof Movie)) return false;
		
		Movie tMovie = (Movie) o;
		return(
				(this.getName().equals(tMovie.getName())) &&
				(this.getAgeRating() == tMovie.getAgeRating())
				);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
