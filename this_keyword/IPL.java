class IPL {

    String name;
    int year;
    double revenue;
    String winner;
    boolean isActive;
    String sponsor;
    int teams;
    String format;
    String country;
    String quality;

    IPL(String name, int year, double revenue, String winner, boolean isActive, String sponsor, int teams, String format, String country, String quality) {

        this.name = name;
        this.year = year;
        this.revenue = revenue;
        this.winner = winner;
        this.isActive = isActive;
        this.sponsor = sponsor;
        this.teams = teams;
        this.format = format;
        this.country = country;
        this.quality = quality;
    }
}