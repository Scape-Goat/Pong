import java.awt.*;

public class Paddle {
    //variables to determine the coordinates of the paddle
    private int x, y;
    //variable to determine the size of the paddle
    private final int WIDTH = 6, HEIGHT = 100;
    //creates local variables for the board, game and ball instances
    Board board;
    Game game;
    Ball ball;

    //constructor which takes as parameters the current instances of board, game and ball
    public Paddle(Board board, Game game, Ball ball){
        //initial coordinates of the paddle
        x = 0;
        y = 0;
        //reference the current instances of the objects and assigns it to local variable
        this.board = board;
        this.game = game;
        this.ball = ball;
    }
    public void move(){
        //if the W key is pressed move paddle up
        if(game.isWPressed()){
            if(y > 0){
                y -= 5;
            }
        }
        //if the down key is pressed move the paddle down
        if(game.isSPressed()){
            if(y + HEIGHT < board.getHeight()){
                y += 5;
            }
        }
    }

    public Rectangle getBounds(){
        return new Rectangle(x , y, WIDTH, HEIGHT);
    }

    //CREATES AI MOVEMENT
    public void moveAI(boolean isTwoPlay){
        //if it is not two players
        if(!isTwoPlay) {
            //start moving once the ball crosses halfway point
            if (ball.getX() + ball.getDiam() > board.getWidth() / 2) {
                //if the ball is above the center of the paddle
                if (ball.getY() > y + HEIGHT/2) {
                    y += 3.25;
                }
                //if the ball is below the center of the paddle
                if (ball.getY() < y+HEIGHT/2) {
                    y -= 3.25;
                }
            }
        }
        else{
            //if the up key is pressed move paddle up
            if(game.isUpPressed()){
                if(y > 0){
                    y -= 5;
                }
            }
            //if the down key is pressed move the paddle down
            if(game.isDownPressed()){
                if(y + HEIGHT < board.getHeight()){
                    y += 5;
                }
            }
        }
    }

    public void setPosition(int x, int y){
        //sets the position of the paddle based on the MIDDLE of the paddle
        this.x = x - WIDTH/2;
        this.y = y - HEIGHT/2;
    }

    public void paint(Graphics g){
        //renders the graphcis for the paddle
        g.fillRect(x, y, WIDTH, HEIGHT);
    }

}
