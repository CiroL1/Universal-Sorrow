package package01;

public class VisibilityManager {
    UI ui;

    public VisibilityManager(UI userInterface) {
        ui = userInterface;
    }

    public void showTitleScreen(){
        //show title screen
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);
        ui.quitButtonPanel.setVisible(true);
        //hide game screen
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }

    public void titleToGame(){
        //hide title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.quitButtonPanel.setVisible(false);
        //show game screen
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
    }
}
