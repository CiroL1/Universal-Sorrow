package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);
    Story story = new Story(this, ui, vm);

    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

    public static void main(String[] args) {

        new Main();

    }

    public Main() {
        ui.createUI(cHandler);
        vm.showTitleScreen();
        //story.defaultSetup();
    }

    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand();
            String dificultadElegida = "";
            switch (yourChoice) {
                case "start":
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
                case "quit":
                    System.exit(0);
                    break;
            }
        }
    }
}
