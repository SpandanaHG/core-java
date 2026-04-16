class Cricket {

    String type;
    String ballType;
    int players;
    String format;
    String ground;
    String country;
    double duration;
    String equipment;
    String level;
    String origin;

    Cricket(String type, String ballType, int players, String format,
            String ground, String country, double duration,
            String equipment, String level, String origin) {

        this.type = type;
        this.ballType = ballType;
        this.players = players;
        this.format = format;
        this.ground = ground;
        this.country = country;
        this.duration = duration;
        this.equipment = equipment;
        this.level = level;
        this.origin = origin;
    }

    void display() {
        System.out.println("Running display in Cricket");
        System.out.println("Type: " + this.type);
        System.out.println("Ball Type: " + this.ballType);
        System.out.println("Players: " + this.players);
        System.out.println("Format: " + this.format);
        System.out.println("Ground: " + this.ground);
        System.out.println("Country: " + this.country);
        System.out.println("Duration: " + this.duration);
        System.out.println("Equipment: " + this.equipment);
        System.out.println("Level: " + this.level);
        System.out.println("Origin: " + this.origin);
    }
}