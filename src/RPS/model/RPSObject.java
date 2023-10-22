package RPS.model;

import javax.swing.*;
import java.awt.*;

public class RPSObject {
    static final int ROCK = 1;
    static final int PAPER = 2;
    static final int SCISSORS = 3;

    RPSThread thread;
    int type;
    ImageIcon rockIcon = new ImageIcon("paper.RPS.png");
    ImageIcon paperIcon = new ImageIcon("rock.RPS.png");
    ImageIcon scissorsIcon = new ImageIcon("scissors.RPS.png");
    Image img;
    public RPSObject(String type) {
        if(type.equals("rock")){
            this.type = ROCK;
        } else if (type.equals("paper")) {
            this.type = PAPER;
        } else if (type.equals("scissors")) {
            this.type = SCISSORS;
        }
        thread= new RPSThread();
    }
}
