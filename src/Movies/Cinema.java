package Movies;

import java.util.ArrayList;

public class Cinema {
	public String name;
	public ArrayList<Movie> movies;
	public Movie[] rooms;
	public int useful;
	
	
	public Cinema(String name ,int nRooms ) {
		this.name = name;
		this.rooms = new Movie[nRooms];
		this.movies = new ArrayList<Movie>();
		
		for(Movie m : movies) {
			rooms[movies.indexOf(m)] = m;
		}
		
		this.useful = rooms.length;
	}
	
	
	public int roomOfMovie(String name, int duration, int year) {
		Movie other = new Movie(name, duration, year);
		
		for(int i = 0 ; i < rooms.length ; i ++) {
			if(rooms[i].equals(other)) {
				System.out.println("Movie found... ");
				return i + 1;
			}
		}
		System.out.println("movie not found..");
		return -1;
	}
	
	
	//Method addMovie, that receives a Movie and adds it to the first available showroom (in order)
	
	public void addMovie(Movie other) {
		
		for(int i = 0 ; i < this.rooms.length ; i++) {
			if(rooms[i] == null) {
				
				for(Movie m : movies) {
					if(m.equals(other)) {
						System.out.println("the movie is already in the cinema....");
					}
				}
				
				rooms[i] = other;
				movies.add(i, other);
			}
		}
	}
	
	//Method addMovie, that receives a Movie and a room number. It places that movie in the indicated showroom
	
	public void addMovie(Movie other , int Rnum) {
		
		for(int i = 0 ; i < this.rooms.length ; i++) {
			if(i == Rnum && rooms[i] == null) {
				for(Movie m : movies) {
					if(m.equals(other)) {
						System.out.println("the movie is already in the cinema.... at showroom: " + this.roomOfMovie(other.getName(), other.getDuration(), other.getYear()));
					}
				}
				
				rooms[i] = other;
				movies.add(i, other);
			}
			
		}
		
	}
	
	

}
