package RPS.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
    private MainFrame mainFrame = this;
    private StratDialog stratDialog;
    private ResultDialog resultDialog;
    private MainView mainView;
    int screenHeight;
    int screenWidth;
    int frameHeight;
    int frameWidth;
    public MainFrame() {
        this.setVisible(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        screenHeight = d.height;
        screenWidth = d.width;
        frameHeight = screenHeight - screenHeight / 4;
        frameWidth = screenWidth/2;
        setSize(frameWidth, frameHeight);
        setLocation((screenWidth - frameWidth) / 2, (screenHeight - frameHeight) / 2);
        setTitle("RPS");

        stratDialog = new StratDialog(mainFrame);
        stratDialog.setVisible(true);

        mainView = new MainView();
        add(mainView);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void setNumberOfRPSObject(int numOfRock, int numOfPaper, int numOfScissors){
        mainView.rpsModel.setNumberRPSObject(numOfRock,numOfPaper,numOfScissors);
    }
}
