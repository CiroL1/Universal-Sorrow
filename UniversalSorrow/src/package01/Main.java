package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);
    Story story = new Story(this, ui, vm);

    public static void main(String[] args) {

        new Main();

    }

    public Main() {
        ui.createUI(cHandler);
        story.defaultSetup();
        vm.showTitleScreen();
    }

    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand();

            switch (yourChoice) {
                case "start": vm.titleToGame(); story.beggining(); break;
                case "choice1": break;
                case "choice2": break;
                case "choice3": break;
                case "choice4": break;
                case "quit": System.exit(0); break;
            }
        }
    }
}