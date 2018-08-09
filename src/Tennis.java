public class Tennis {

    Player a = new Player('A');
    Player b  = new Player('B');
    char advantage;
    public void calulateScore(String s){
        advantage='-';
        for(char c : s.toCharArray()){
            if(c==a.getName())
                incrementPointsAndCompare(a,b);
            else
                incrementPointsAndCompare(b,a);


        }

    }
    public void printScoreBoard(){
        System.out.println("Player\t\tSets\t\tGames\t\tPoints");
        a.print();
        b.print();
        if(a.getPoints()==40&&b.getPoints()==40 && advantage!='-')
            System.out.println("Advantage "+advantage);

    }
    public void incrementPointsAndCompare(Player x,Player y){

        if((y.getGames()>=2 && x.getGames()>=2) && (x.getGames()-y.getGames()<2))
        {
            x.incrementGames();
            if(x.games-y.games ==2)
            { x.incrementSet();

                x.setGames(0);
                y.setGames(0);




            }


            return;

        }
        if(x.getPoints()==40 && y.getPoints()==40){
            if(advantage=='-')
                advantage = x.name;
            else if (advantage==y.name)
                advantage ='-';
            else
            {
                increamentGameAndClear(x,y);
            }
        }
        else
        {
            if(x.getPoints()==40)
            {
                increamentGameAndClear(x,y);

            }
            else
                x.incrementPoints();

        }
        if(x.getGames()>=6)
            incrementSets(x,y);

    }



    public void increamentGameAndClear(Player x,Player y){
        x.incrementGames();
        x.setPoints(0);
        y.setPoints(0);
    }
    public void incrementSets(Player x,Player y){




        if(y.getGames()-x.getGames()>1)
        {
            y.incrementSet();
            y.setGames(0);
            x.setGames(0);

        }
        else if(x.getGames()-y.getGames()>1)
        {
            x.incrementSet();
            y.setGames(0);
            x.setGames(0);
        }

    }
}