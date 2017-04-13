package viv.home;

/**
 * Created by viv on 13.04.2017.
 */
public class Tetris {

    private  Field field;
    private Figure figure;
    public static Tetris game;

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }



    public void run(){}
    public void step(){}

    public static void main(String[] args) {
        game=new Tetris();
        game.run();

    }



}
