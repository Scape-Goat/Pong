/* NOTES FOR STUDENTS:
        Nothing too fancy here, but notice how everything is STATIC. This will allow us to use this class and
        all its methods without needing to create an instance of this class.
 */

public class GAMESTATES {

    private static boolean isPlay = false;
    private static boolean isTwoPlay = false;
    private static boolean isPause = false;
    private static boolean isMenu = true;
    private static boolean isEnd = false;
    private static Integer cScore = new Integer(0);
    private static Integer pScore = new Integer(0);
    private static String gameType = "Player VS AI";

    /*
     *METHODS FOR SETTING AND RETURNING THE SCORES
     * FOR COMPUTER AND PLAYER
     */
    public static Integer getcScore() {return cScore; }

    public static Integer getpScore(){
        return pScore;
    }

    public static void increaseCScore(){
        cScore++;
    }

    public static void increasePScore(){
        pScore++;
    }

    public static void setCScore(int a){
        cScore = a;
    }
    public static void setPScore(int a){
        pScore = a;
    }

    public static String getGameType() {
        return gameType;
    }

    /* GETTERS AND SETTERS FOR THE GAME CONTROLLERS

    */

    public static boolean isPlay(){
        return isPlay;
    }
    public static boolean isTwoPlay() {return isTwoPlay;}
    public static boolean isPause(){
        return isPause;
    }
    public static boolean isMenu(){
        return isMenu;
    }
    public static boolean isEnd(){
        return isEnd;
    }
    public static void startPlay(){
        isPlay = true;
    }
    public static void stopPlay(){
        isPlay = false;
    }
    public static void startMenu(){
        isMenu = true;
    }
    public static void stopMenu(){
        isMenu = false;
    }
    public static void startPause(){
        isPause = true;
    }
    public static void stopPause(){
        isPause = false;
    }
    public static void endGame(){
        isEnd = true;
    }
    public static void startGame(){
        isEnd = false;
    }

    /* METHODS FOR TOGGLING BETWEEN GAMESTATES

     */
    public static void togglePlay(){isPlay = !isPlay;}
    public static void toggleTwoPlay(){isTwoPlay = !isTwoPlay;}
    public static void togglePause(){isPause = !isPause;}
    public static void toggleMenu(){isMenu = !isMenu;}

    public static void toggleGameType(){
        if(gameType.equals("Player VS AI"))
            gameType = "Player VS Player";
        else
            gameType = "Player VS AI";
        toggleTwoPlay();


    }



}
