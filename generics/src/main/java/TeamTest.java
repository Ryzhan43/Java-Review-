public class TeamTest {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("joe");
        BasketballPlayer brad = new BasketballPlayer("Brad");
        FootballPlayer Beckham = new FootballPlayer("Beckham");

//        Team Heat = new Team("Heat");
        Team<BasketballPlayer> heat = new Team<>("Miami Heat");

//        Team<String> brkTeam = new Team<>("not work");

        heat.addPlayer(brad);

        System.out.println(heat.toString());

    }
}
