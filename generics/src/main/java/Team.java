import java.util.ArrayList;

public  class Team<T extends Player> {

    public String name;

    private ArrayList<T> member = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(member.contains(player)){
            System.out.println((player).getName() + " is already on this team");
            return false;
        }else{
            member.add(player);
            System.out.println((player).getName() + "picked for team" + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.member.size();
    }
}
