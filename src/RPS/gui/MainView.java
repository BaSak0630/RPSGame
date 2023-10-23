package RPS.gui;
import RPS.model.RPSModel;

import javax.swing.JPanel;
import javax.swing.plaf.PanelUI;
import java.awt.*;

public class MainView extends JPanel {
    public RPSModel rpsModel;

    public MainView() {
        rpsModel = new RPSModel(this);

        this.repaint();
     /*   while (rpsModel.overCheck()) {
            this.repaint();
        }*/
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        rpsModel.paintRPS(g);
    }
}
