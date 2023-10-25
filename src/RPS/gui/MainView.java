package RPS.gui;
import RPS.model.RPSModel;
import RPS.model.RPSObject;

import javax.swing.*;
import java.awt.*;

public class MainView extends JPanel {
    private RPSModel model;
    public MainFrame mainFrame;
    RPSObject tmp;
    public MainView(MainFrame mainFrame) {
        model = new RPSModel(this,getGraphics());
        System.out.println(getGraphics());
        this.mainFrame = mainFrame;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
         for(int i = 0; i < model.rpsObjects.size();i++ ){
             tmp = model.rpsObjects.get(i);
             if (tmp.getType() == 1) {
                 g.fillRect(tmp.x, tmp.y, 10,10);
                 g.drawImage(tmp.rockIcon.getImage(), tmp.x, tmp.y, 10, 10, this);
             } else if (tmp.getType() == 2) {
                 g.drawRect(tmp.x, tmp.y, 10,10);
                 g.drawImage(tmp.paperIcon.getImage(), tmp.x, tmp.y, 10, 10, this);
             } else if (tmp.getType() == 3) {
                 g.drawLine(tmp.x-5, tmp.y-5, tmp.x+5, tmp.y+5);
                 g.drawLine(tmp.x+5, tmp.y-5, tmp.x-5, tmp.y+5);
                 g.drawImage(tmp.scissorsIcon.getImage(), tmp.x, tmp.y, 10, 10, this);
             }
         }
    }
    public RPSModel getModel() {
        return model;
    }
}
