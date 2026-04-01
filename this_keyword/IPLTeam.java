class IPLTeam {

    String name;
    int players;
    double budget;
    String captain;
    boolean isChampion;
    String coach;
    int wins;
    String homeGround;
    String country;
    String quality;

    IPLTeam(String name, int players, double budget, String captain, boolean isChampion, String coach, int wins, String homeGround, String country, String quality) {

        this.name = name;
        this.players = players;
        this.budget = budget;
        this.captain = captain;
        this.isChampion = isChampion;
        this.coach = coach;
        this.wins = wins;
        this.homeGround = homeGround;
        this.country = country;
        this.quality = quality;
    }
}