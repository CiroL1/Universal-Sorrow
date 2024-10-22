package package01;

import package02.Weapon_Knife;

public class Story {

    Main main;
    UI ui;
    VisibilityManager vm;
    Estudiante estudiante = new Estudiante();

    public Story(Main main, UI ui, VisibilityManager vm) {
        this.main = main;
        this.ui = ui;
        this.vm = vm;
    }

    public void defaultSetup(){
        estudiante.cordura = 100;
        estudiante.plata = 10000;
        estudiante.probabilidadAprobar = 100;
        ui.sNumberLabel.setText("" + estudiante.cordura);
        ui.moneyNameLabel.setText("" + estudiante.plata);
        ui.pcNameLabel.setText("" + estudiante.probabilidadAprobar);
    }

    public void beggining(){
        ui.mainTextArea.setText("The final exams are coming \nWhat are you going to do?");
        ui.choice1.setText("Study");
        ui.choice2.setText("Sleep");
        ui.choice3.setText("Go out");
        ui.choice4.setText("Play videogames");
    }
}
