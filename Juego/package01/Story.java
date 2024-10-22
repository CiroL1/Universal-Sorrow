package package01;
import Objetos.*;

import java.util.ArrayList;
import java.util.List;

public class Story {

    Main main;
    UI ui;
    VisibilityManager vm;

    public Story(Main main, UI ui, VisibilityManager vm) {
        this.main = main;
        this.ui = ui;
        this.vm = vm;
    }

    public Estudiante estudianteMarketing(){
        //easy
        ArrayList<Materia> materias = new ArrayList<>();
        ArrayList<Bono> bonos = new ArrayList<>();
        Carrera marketing = new Carrera("Marketing", materias, bonos);
        Estudiante estudiante = new Estudiante("juan", 100, 10000, 100, "jugador", marketing, materias);
        return estudiante;
    }

    public Estudiante estudianteArtes(){
        //medium
        ArrayList<Materia> materias = new ArrayList<>();
        ArrayList<Bono> bonos = new ArrayList<>();
        Carrera artes = new Carrera("Artes", materias, bonos);
        Estudiante estudiante = new Estudiante("juan", 100, 10000, 100, "jugador", artes, materias);
        return estudiante;
    }

    public Estudiante estudianteIngenieria(){
        //hard
        ArrayList<Materia> materias = new ArrayList<>();
        ArrayList<Bono> bonos = new ArrayList<>();
        Carrera ingenieria = new Carrera("Ingenieria", materias, bonos);
        Estudiante estudiante = new Estudiante("juan", 100, 10000, 100, "jugador", ingenieria, materias);
        return estudiante;
    }

    public Estudiante difficultyChosen(String dificultad){
        Estudiante estudiante = null; // Inicializa el estudiante

        switch (dificultad) {
            case "easy":
                estudiante = estudianteMarketing(); // Genera estudiante de Marketing
                break;
            case "medium":
                estudiante = estudianteArtes(); // Genera estudiante de Artes
                break;
            case "hard":
                estudiante = estudianteIngenieria(); // Genera estudiante de Ingeniería
                break;
        }
        setEstudiante(estudiante);
        return estudiante;
    }

    private Estudiante estudianteActual; // Campo para almacenar el estudiante

    // Otros métodos y atributos de la clase

    public void setEstudiante(Estudiante estudiante) {
        this.estudianteActual = estudiante; // Método para establecer el estudiante
    }

    public Estudiante getEstudiante() {
        return this.estudianteActual; // Método para obtener el estudiante actual
    }

    Estudiante estudiante = getEstudiante();

    public void defaultSetup(){
        double estudianteCordura = estudiante.getCordura();
        double estudiantePlata = estudiante.getPlata();
        int estudianteCapacidadEstudio = estudiante.getCapacidadDeestudio();
        ui.sNumberLabel.setText("" + estudianteCordura);
        ui.moneyNameLabel.setText("" + estudiantePlata);
        ui.pcNameLabel.setText("" + estudianteCapacidadEstudio);
    }

    public void selectPosition(String nextPosition){
        switch(nextPosition){
            case "default": beggining(); break;
            case "Study": study(); break;
            case "Sleep": sleep(); break;
            case "Go out": goOut(); break;
            case "Play videogames": playVideoGames(); break;
        }
    }

    public void beggining(){
        ui.mainTextArea.setText("The final exams are coming \nWhat are you going to do?");
        ui.choice1.setText("Study");
        ui.choice2.setText("Sleep");
        ui.choice3.setText("Go out");
        ui.choice4.setText("Play videogames");

        main.nextPosition1 = "Study";
        main.nextPosition2 = "Sleep";
        main.nextPosition3 = "Go out";
        main.nextPosition4 = "Play videogames";
    }

    public void study(){
        ui.mainTextArea.setText("You decide to prepare yourself and study. \nYour chances of passing increase by 10%. \nYou feel proud about yourself (+10 sanity)");
        //ui.pcNameLabel.setText("" + estudiante.probabilidadAprobar);
        //ui.sNumberLabel.setText("" + estudiante.cordura);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        main.nextPosition1 = "default";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";
    }
    public void sleep(){
        ui.mainTextArea.setText("You decide to sleep through the day. \nYour chances of passing decrease by 10% and you feel guilty (-15 of sanity)");
       // ui.pcNameLabel.setText("" + estudiante.probabilidadAprobar);
       // ui.sNumberLabel.setText("" + estudiante.cordura);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        main.nextPosition1 = "default";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";

    }
    public void goOut(){
        ui.mainTextArea.setText("You decide to go out with friends and enjoy the day. \nYour chances of passing decrease by 15%. (-$1500)");
       // ui.moneyNameLabel.setText("" + estudiante.plata);
       // ui.pcNameLabel.setText("" + estudiante.probabilidadAprobar);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        main.nextPosition1 = "default";
        main.nextPosition2 = "";
        main.nextPosition3 = "";
        main.nextPosition4 = "";
    }
    public void playVideoGames(){

    }
}
