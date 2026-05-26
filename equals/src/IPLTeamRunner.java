public class IPLTeamRunner {
    public static void main(String... values){
        IPLTeam iplTeam1 = new IPLTeam("Royal Challengers Bengaluru", "Rajat Patidar", 1, "M Chinnaswamy Stadium", 25);
        IPLTeam iplTeam2 = new IPLTeam("Gujarat Titans", "Shubman Gill", 1, "Narendra Modi Stadium", 25);
        IPLTeam iplTeam3 = new IPLTeam("Royal Challengers Bengaluru", "Rajat Patidar", 1, "M Chinnaswamy Stadium", 25);
        boolean isSame = iplTeam1.equals(iplTeam2);
        boolean isSame1 = iplTeam1.equals(iplTeam3);
        System.out.println("Is IPL Team same: "+isSame);
        System.out.println("Is IPL Team same: "+isSame1);
    }
}
