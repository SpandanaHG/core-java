public class IPLTeam {

    private String teamName;
    private String captain;
    private int trophies;
    private String homeGround;
    private int players;

    public IPLTeam() {
    }

    public IPLTeam(String teamName, String captain, int trophies, String homeGround, int players) {
        this.teamName = teamName;
        this.captain = captain;
        this.trophies = trophies;
        this.homeGround = homeGround;
        this.players = players;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null)
        {
            IPLTeam iplTeam1 = this;
            if(obj instanceof IPLTeam)
            {
                IPLTeam iplTeam2 = (IPLTeam) obj;
                if(iplTeam1.teamName.equals(iplTeam2.teamName) && iplTeam1.homeGround.equals(iplTeam2.homeGround))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public String getHomeGround() {
        return homeGround;
    }

    public void setHomeGround(String homeGround) {
        this.homeGround = homeGround;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }
}
