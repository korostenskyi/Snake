package korostenskyjhub.snakegame.objects;

/**
 * Created by Roman Korostenskyj on 29.10.2016.
 */
public class Snake {

     korostenskyjhub.snakegame.main main;

    public int direction = 0;   //Movement direction (0 - right, 1 - down, 2 - left, 3 - up)
    public int length = 2;  //Start length

    @SuppressWarnings("static-access")
    public int snakeX[] = new int[main.WIDTH*main.HEIGHT];
    public int snakeY[] = new int[main.WIDTH*main.HEIGHT];
    public Snake(int x0,int y0,int x1,int y1){
        snakeX[0] = x0;
        snakeY[0] = y0;
        snakeX[1] = x1;
        snakeY[1] = y1;
    }
    @SuppressWarnings("static-access")
    public void move(){
        for(int d = length; d > 0; d--){
            snakeX[d] = snakeX[d-1];
            snakeY[d] = snakeY[d-1];
        }

        if(direction == 0) snakeX[0]++;
        if(direction == 1) snakeY[0]++;
        if(direction == 2) snakeX[0]--;
        if(direction == 3) snakeY[0]--;

        for(int d = length; d > 0; d--){
            if((snakeX[0] == snakeX[d]) & (snakeY[0] == snakeY[d])) length = d-2;
        }
        //Minimum length
        if(length < 2) length = 2;

        if(snakeX[0] > main.WIDTH-1) snakeX[0] = 0;
        if(snakeX[0] < 0) snakeX[0] = main.WIDTH-1;
        if(snakeY[0] > main.HEIGHT-1) snakeY[0] = 0;
        if(snakeY[0] < 0) snakeY[0] = main.HEIGHT-1;
    }
}
