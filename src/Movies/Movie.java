package Movies;

import java.io.ObjectInputStream.GetField;

public class Movie {
	private String name;
	private int duration, year;
	
	
	public Movie(String name, int dur, int year) {
		this.name = name;
		this.duration = dur;
		this.year = year;
	}

    public Movie() {

    }


    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Movie other = (Movie) obj;
		if (duration != other.duration && duration - other.duration > 5 ) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (year != other.year) {
			return false;
		}
		return true;
	}



	@Override
	public String toString() {
		return "name : " + this.name + " duration  : " + this.duration + " year : " + this.year;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYear() {
		return year;
	}
	

}
