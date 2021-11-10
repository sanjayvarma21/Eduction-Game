package au.edu.jcu.cp5307.guessinggame;

import java.util.Random;

public class Game {
    public boolean check(int guessedNum){
        Random random = new Random();
        int randomNum = random.nextInt(11) + 1;
        return guessedNum == randomNum;
    }
}
