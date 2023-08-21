package com.benjieok.learningspringframework;

import com.benjieok.learningspringframework.game.GameRunner;
import com.benjieok.learningspringframework.game.MarioGame;

public class App01GamingBasic {
    public static void main(String[] args) {

        var game = new MarioGame();
//        var game = new SuperContraGame();
//        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
