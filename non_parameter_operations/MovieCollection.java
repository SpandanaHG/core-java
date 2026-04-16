class MovieCollection {

    Movie[] movies = new Movie[20];
    int index = 0;

    void addMovie(Movie movie) {

        System.out.println("Running addMovie in MovieCollection");

        if (movie != null) {
            if (this.index < this.movies.length) {
                this.movies[this.index] = movie;
                System.out.println("Movie added at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Collection is full");
            }
        } else {
            System.out.println("Movie cannot be null");
        }
    }

    void displayAll() {

        System.out.println("Displaying all Movies");

        for (Movie movie : movies) {
            if (movie != null) {
                movie.display();
            }
			else{
				System.out.println("Movie is null , there is nothing to display");
			}
        }
    }
}