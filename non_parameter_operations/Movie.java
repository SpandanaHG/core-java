class Movie {

    String name;
    String language;
    String genre;
    String director;
    String hero;
    String heroine;
    int duration;
    double rating;
    double budget;
    String releaseYear;

    Movie(String name, String language, String genre, String director,
          String hero, String heroine, int duration,
          double rating, double budget, String releaseYear) {

        this.name = name;
        this.language = language;
        this.genre = genre;
        this.director = director;
        this.hero = hero;
        this.heroine = heroine;
        this.duration = duration;
        this.rating = rating;
        this.budget = budget;
        this.releaseYear = releaseYear;
    }

    void display() {
        System.out.println("Running display in Movie");
        System.out.println("Name: " + this.name);
        System.out.println("Language: " + this.language);
        System.out.println("Genre: " + this.genre);
        System.out.println("Director: " + this.director);
        System.out.println("Hero: " + this.hero);
        System.out.println("Heroine: " + this.heroine);
        System.out.println("Duration: " + this.duration);
        System.out.println("Rating: " + this.rating);
        System.out.println("Budget: " + this.budget);
        System.out.println("Release Year: " + this.releaseYear);
    }
}