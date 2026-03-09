package Movies;

import UD6SET2.Console;

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
        ArrayList<Integer> free = new ArrayList<Integer>();

        for (int i = 0; i < this.rooms.length; i++) {
            if (rooms[i] == null){
                free.add(i);
            }
        }
        return free;

    }

    //Method changeRoom, that receives a movie. If the movie is found, the method displays in which room it
    //is, and asks the user to which other room he wants to change it (must validate this until the user provide
    //a free and existent room). The film is finally moved to another room.

    public void changeRoom(Movie other){
        Movie toChange = new Movie();
        for (int i = 0; i < this.rooms.length; i++) {
            if(this.rooms[i].equals(other)){
                toChange = rooms[i];
                break;
            }
        }

        System.out.println("The movie inputted is in room: " + this.roomOfMovie(toChange.getName(), toChange.getDuration(), toChange.getYear()));

        System.out.println("to what room ---> ");
        int room = Console.readInt();
        ArrayList<Integer> freeR = this.freeRooms();

        while (!freeR.contains(room) || rooms[room] != null){
            System.out.println("Input an existing and free room: ");
            room = Console.readInt();
        }

        rooms[room] = other;
        System.out.println("Done....");




    }

    public void resetCinema(){
        this.movies.clear();
        this.rooms = new Movie[this.rooms.length];
    }

	
	//Method moviesShorterThan, that returns an arrayList made up by names of films lasting less than the duration received as an argument (minutes)

}
