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
        ui.nameButtonPanel.setVisible(false);
        //hide difficulty screen
        ui.difficultyPanel.setVisible(false);
        //hide name screen
        ui.namePanel.setVisible(false);
        //hide game screen
        ui.daysTextArea.setVisible(false);
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }

    public void titleToDifficulty(){
        //hide title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.quitButtonPanel.setVisible(false);
        ui.nameButtonPanel.setVisible(false);
        //show difficulty screen
        ui.difficultyPanel.setVisible(true);
        //hide name screen
        ui.namePanel.setVisible(false);
        //hide game screen
        ui.daysTextArea.setVisible(false);
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }

    public void explanation(){
        //hide title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.quitButtonPanel.setVisible(false);
        ui.nameButtonPanel.setVisible(true);
        //hide difficulty screen
        ui.difficultyPanel.setVisible(false);
        //hide name screen
        ui.namePanel.setVisible(true);
        //hide game screen
        ui.daysTextArea.setVisible(false);
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
    }

    public void difToGame(){
        //hide title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.quitButtonPanel.setVisible(false);
        ui.nameButtonPanel.setVisible(false);
        //hide difficulty screen
        ui.difficultyPanel.setVisible(false);
        //hide name screen
        ui.namePanel.setVisible(false);
        //show game screen
        ui.daysTextArea.setVisible(true);
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
    }


    public void ending(){
        //hide title screen
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        ui.quitButtonPanel.setVisible(false);
        ui.nameButtonPanel.setVisible(false);
        //hide difficulty screen
        ui.difficultyPanel.setVisible(false);
        //hide how to play the game screen
        ui.namePanel.setVisible(false);
        //show game screen except choices
        ui.daysTextArea.setVisible(true);
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(true);
    }
}
