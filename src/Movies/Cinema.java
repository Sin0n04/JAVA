package Movies;

import java.util.ArrayList;
import java.util.Iterator;

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
        useful = 0;
        for(Movie m : rooms ){
            if(m == null){
                useful++;
            }
        }
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
        if(movies.contains(other)){
            System.out.println("this movie already exists... at room: " + this.roomOfMovie(other.getName(), other.getDuration(), other.getYear()));
        }
		
		for(int i = 0 ; i < this.rooms.length ; i++) {
			if(rooms[i] == null) {
				rooms[i] = other;
				movies.add(i, other);
                System.out.println("movie added...");
			}
		}
        System.out.println("no room available");
	}
	
	//Method addMovie, that receives a Movie and a room number. It places that movie in the indicated showroom
	
	public void addMovie(Movie other , int Rnum) {
        if(movies.contains(other)){
            System.out.println("this movie already exists... at room: " + this.roomOfMovie(other.getName(), other.getDuration(), other.getYear()));
        }

		for(int i = 0 ; i < this.rooms.length ; i++) {
			if(i == Rnum && rooms[i] == null) {
				rooms[i] = other;
				movies.add(i, other);
                System.out.println("movie added...");
                //gotta check for indexoutof    bounds for the array...
                useful++;
			}
            else
                System.out.println("showroom occupied...");
			
		}
        System.out.println("no rooms available to add another movie");
		
	}

    //Method view: that displays the cinema’s name and all its movies, with the room at which they are
    //being projected, ordered by room (Does not display any information concerning empty
    //rooms/rooms with no film)

    public void view(){
        Iterator<Movie> it = movies.iterator();
        while(it.hasNext()){
            Movie m = it.next();
            if (m != null){
                System.out.println(m.toString() + " | ");
            }
            else
                System.out.println("No Movie Showing..." + " | ");
        }
    }

    //Method removeMovie: receives a String and removes all the movies of the cinema whose name
    //starts by that String
    public void removeMovie(String toRemove){
        Iterator <Movie> it = movies.iterator();
        while(it.hasNext()){
            Movie z = it.next();
            String x = z.getName();

            if(x.startsWith(toRemove)){
                int i = movies.indexOf(z);
                rooms[i] = null;
                it.remove();
                this.useful--;
            }
        }



    }

    //Method freeRooms, that returns an ArrayList with the Numbers of the cinema’s free rooms
    public ArrayList<Integer> freeRooms(){


    }

	
	

}
