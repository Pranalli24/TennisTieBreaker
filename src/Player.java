import java.util.*;

public class Player {
    char name;
    int points;
    int games;
    int sets;
    ArrayList<Integer> standardPoints = new ArrayList<Integer>(Arrays.asList(0,15,30,40,40));
    public Player(char name) {
        this.name = name;
        this.points = 0;
        this.games = 0;
        this.sets = 0;
    }

    public void incrementPoints(){
        points=standardPoints.get(standardPoints.indexOf(points)+1);
    }
    public void incrementGames(){
        games++;
    }
    public void incrementSet(){
        sets++;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public char getName() {
        return name;
    }

    public void print(){
        System.out.println(name + "\t\t" + sets + "\t\t" + games + "\t\t" + points);
    }

}