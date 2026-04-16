class MovieCollectionRunner {

    public static void main(String... values) {

        MovieCollection movieCollection = new MovieCollection();

        Movie movie1  = new Movie("KGF", "Kannada", "Action", "Prashanth Neel", "Yash", "Srinidhi", 155, 9.5, 80, "2018");
        Movie movie2  = new Movie("RRR", "Telugu", "Action", "Rajamouli", "NTR", "Alia", 180, 9.2, 200, "2022");
        Movie movie3  = new Movie("Leo", "Tamil", "Action", "Lokesh", "Vijay", "Trisha", 160, 8.5, 150, "2023");
        Movie movie4  = new Movie("Jawan", "Hindi", "Action", "Atlee", "SRK", "Nayanthara", 170, 8.0, 300, "2023");
        Movie movie5  = new Movie("Pushpa", "Telugu", "Action", "Sukumar", "Allu Arjun", "Rashmika", 165, 9.0, 180, "2021");
        Movie movie6  = new Movie("Bahubali", "Telugu", "Epic", "Rajamouli", "Prabhas", "Anushka", 180, 9.6, 250, "2015");
        Movie movie7  = new Movie("Master", "Tamil", "Action", "Lokesh", "Vijay", "Malavika", 160, 8.3, 135, "2021");
        Movie movie8  = new Movie("Dangal", "Hindi", "Drama", "Nitesh", "Aamir", "Fatima", 160, 9.3, 70, "2016");
        Movie movie9  = new Movie("3 Idiots", "Hindi", "Comedy", "Hirani", "Aamir", "Kareena", 170, 9.4, 55, "2009");
        Movie movie10 = new Movie("Drishyam", "Malayalam", "Thriller", "Jeethu", "Mohanlal", "Meena", 160, 9.2, 40, "2013");
        Movie movie11 = new Movie("Vikram", "Tamil", "Action", "Lokesh", "Kamal", "Gayathrie", 165, 8.8, 120, "2022");
        Movie movie12 = new Movie("KGF 2", "Kannada", "Action", "Prashanth Neel", "Yash", "Srinidhi", 168, 9.4, 100, "2022");
        Movie movie13 = new Movie("Salar", "Telugu", "Action", "Prashanth Neel", "Prabhas", "Shruti", 170, 8.7, 200, "2023");
        Movie movie14 = new Movie("War", "Hindi", "Action", "Siddharth", "Hrithik", "Vaani", 155, 8.2, 170, "2019");
        Movie movie15 = new Movie("Pathaan", "Hindi", "Action", "Siddharth", "SRK", "Deepika", 165, 8.0, 250, "2023");
        Movie movie16 = new Movie("Arjun Reddy", "Telugu", "Drama", "Sandeep", "Vijay", "Shalini", 160, 8.6, 50, "2017");
        Movie movie17 = new Movie("Kabir Singh", "Hindi", "Drama", "Sandeep", "Shahid", "Kiara", 155, 8.1, 60, "2019");
        Movie movie18 = new Movie("Lucifer", "Malayalam", "Action", "Prithviraj", "Mohanlal", "Manju", 170, 8.5, 80, "2019");
        Movie movie19 = new Movie("Kantara", "Kannada", "Drama", "Rishab", "Rishab", "Sapthami", 150, 9.1, 20, "2022");
        Movie movie20 = new Movie("Animal", "Hindi", "Action", "Sandeep", "Ranbir", "Rashmika", 180, 8.4, 200, "2023");

        movieCollection.addMovie(null);
        movieCollection.addMovie(movie1);
        movieCollection.addMovie(movie2);
        movieCollection.addMovie(movie3);
        movieCollection.addMovie(movie4);
        movieCollection.addMovie(movie5);
        movieCollection.addMovie(movie6);
        movieCollection.addMovie(movie7);
        movieCollection.addMovie(movie8);
        movieCollection.addMovie(movie9);
        movieCollection.addMovie(movie10);
        movieCollection.addMovie(movie11);
        movieCollection.addMovie(movie12);
        movieCollection.addMovie(movie13);
        movieCollection.addMovie(movie14);
        movieCollection.addMovie(movie15);
        movieCollection.addMovie(movie16);
        movieCollection.addMovie(movie17);
        movieCollection.addMovie(movie18);
        movieCollection.addMovie(movie19);
        movieCollection.addMovie(movie20);
        movieCollection.displayAll();
    }
}