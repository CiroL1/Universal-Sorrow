package package01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);
    Story story = new Story(this, ui, vm);

    String nextPosition1, nextPosition2, nextPosition3, nextPosition4, nextPosition5;

    public static void main(String[] args) {

        new Main();

    }

    public Main() {
        try{
            ui.createUI(cHandler);
            vm.showTitleScreen();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand();
            String dificultadElegida = "";
            switch (yourChoice) {
                case "start":
                    vm.explanation();
                    story.beggining();
                    break;
                case "next":
                    vm.titleToDifficulty();
                    story.beggining();
                    break;
                case "easy":
                    dificultadElegida = "easy"; // Captura la dificultad
                    vm.difToGame();
                    story.difficultyChosen(dificultadElegida); // Pasa la dificultad
                    break;
                case "medium":
                    dificultadElegida = "medium"; // Captura la dificultad
                    vm.difToGame();
                    story.difficultyChosen(dificultadElegida); // Pasa la dificultad
                    break;
                case "hard":
                    dificultadElegida = "hard"; // Captura la dificultad
                    vm.difToGame();
                    story.difficultyChosen(dificultadElegida); // Pasa la dificultad
                    break;
                case "choice1":
                    story.selectPosition(nextPosition1);
                    break;
                case "choice2":
                    story.selectPosition(nextPosition2);
                    break;
                case "choice3":
                    story.selectPosition(nextPosition3);
                    break;
                case "choice4":
                    story.selectPosition(nextPosition4);
                    break;
                case ">":
                    story.selectPosition(nextPosition5);
                    break;
                case "quit":
                    System.exit(0);
                    break;
            }
        }
    }

}