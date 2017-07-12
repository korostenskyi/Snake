package korostenskyjhub.snakegame.objects;
        import korostenskyjhub.snakegame.main;

/**
 * Created by Roman Korostenskyj on 29.10.2016.
 */
public class Apple {

    public int posX;
    public int posY;


    public Apple(int startX, int startY){
        posX = startX;
        posY = startY;
    }

    @SuppressWarnings("static-access")
    public void setRandomPosition(){
        posX = (int) (Math.random()* main.WIDTH);
        posY = (int) (Math.random()*main.HEIGHT);
    }
}