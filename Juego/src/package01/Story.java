package package01;
import Objetos.*;

import java.util.ArrayList;
import java.util.List;

public class Story {
    Main main;
    UI ui;
    VisibilityManager vm;
    private Estudiante estudianteActual;
    private ArrayList<Trabajo> trabajosActual;

    public Story(Main main, UI ui, VisibilityManager vm) {
        this.main = main;
        this.ui = ui;
        this.vm = vm;
    }

    public Estudiante estudianteMarketing() {
        //easy
        ArrayList<Materia> materias = new ArrayList<>();
        materias.add(new Materia("Marketing Digital", 2, 0.85));
        materias.add(new Materia("Estrategias de Precios", 3, 0.65));
        materias.add(new Materia("Ventas y Negociación", 3, 0.75));
        materias.add(new Materia("Ética en el Marketing", 1, 0.95));
        ArrayList<Bono> bonos = new ArrayList<>();
        ArrayList<Trabajo> trabajos = new ArrayList<>();
        Trabajo asistenteMarketing = new Trabajo("Asistente de Marketing", 20, 15000.0);
        Trabajo gestorRedesSociales = new Trabajo("Gestor de Redes Sociales", 15, 12000.0);
        Trabajo analistaMercado = new Trabajo("Analista de Mercado", 25, 18000.0);
        Trabajo creadorContenido = new Trabajo("Creador de Contenido", 10, 8000.0);
        trabajos.add(asistenteMarketing);
        trabajos.add(gestorRedesSociales);
        trabajos.add(analistaMercado);
        trabajos.add(creadorContenido);
        Carrera marketing = new Carrera("Marketing", materias, bonos);
        Estudiante estudiante = new Estudiante("juan", 100, 10000, 10, "jugador", marketing, materias);
        setTrabajos(trabajos);
        return estudiante;
    }

    public Estudiante estudianteArtes() {
        //medium
        ArrayList<Materia> materias = new ArrayList<>();
        materias.add(new Materia("Actuación I", 2, 0.85));
        materias.add(new Materia("Teatro Contemporáneo", 2, 0.75));
        materias.add(new Materia("Danza y Movimiento", 1, 0.90));
        materias.add(new Materia("Dirección Teatral", 3, 0.65));
        ArrayList<Bono> bonos = new ArrayList<>();
        ArrayList<Trabajo> trabajos = new ArrayList<>();
        Trabajo actorTeatro = new Trabajo("Actor en Obras de Teatro", 20, 14000.0);
        Trabajo profesorArte = new Trabajo("Profesor de Clases de Arte", 15, 10000.0);
        Trabajo bailarinFreelance = new Trabajo("Bailarín Freelance", 10, 9000.0);
        Trabajo artistaCallejero = new Trabajo("Artista Callejero", 25, 7000.0);
        trabajos.add(actorTeatro);
        trabajos.add(profesorArte);
        trabajos.add(bailarinFreelance);
        trabajos.add(artistaCallejero);
        Carrera artes = new Carrera("Artes", materias, bonos);
        Estudiante estudiante = new Estudiante("juan", 70, 1000, 20, "jugador", artes, materias);
        setTrabajos(trabajos);
        return estudiante;
    }

    public Estudiante estudianteIngenieria() {
        //hard
        ArrayList<Materia> materias = new ArrayList<>();
        materias.add(new Materia("Matemáticas I", 2, 0.85));
        materias.add(new Materia("Física I", 3, 0.75));
        materias.add(new Materia("Programación I", 1, 0.90));
        materias.add(new Materia("Estadística", 1, 0.85));
        ArrayList<Bono> bonos = new ArrayList<>();
        ArrayList<Trabajo> trabajos = new ArrayList<>();
        Trabajo ingenieroSoftware = new Trabajo("Ingeniero de Software", 40, 60000.0);
        Trabajo ingenieroCivil = new Trabajo("Ingeniero Civil Asistente", 30, 45000.0);
        Trabajo ingenieroElectronico = new Trabajo("Ingeniero Electrónico", 35, 55000.0);
        Trabajo consultorProyectos = new Trabajo("Consultor de Proyectos", 25, 50000.0);
        trabajos.add(ingenieroSoftware);
        trabajos.add(ingenieroCivil);
        trabajos.add(ingenieroElectronico);
        trabajos.add(consultorProyectos);
        Carrera ingenieria = new Carrera("Ingenieria", materias, bonos);
        Estudiante estudiante = new Estudiante("juan", 30, 5000, 100, "jugador", ingenieria, materias);
        setTrabajos(trabajos);
        return estudiante;
    }

    public Estudiante difficultyChosen(String dificultad) {
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
        defaultSetup(estudiante);
        return estudiante;
    }

    public void setTrabajos(ArrayList<Trabajo> trabajos){
        this.trabajosActual = trabajos;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudianteActual = estudiante; //Método para establecer el estudiante
    }

    public void defaultSetup(Estudiante estudiante){
        ui.sNumberLabel.setText("" + estudiante.getCordura());
        ui.moneyNameLabel.setText("" + estudiante.getPlata());
        ui.pcNameLabel.setText("" + estudiante.getCapacidadDeestudio());
    }

    public void selectPosition(String nextPosition){
        switch(nextPosition){
            case "Study": study(); break;
            case "Sleep": sleep(); break;
            case "Go out": goOut(); break;
            case "Work": work(); break;
            case ">": beggining(); ui.choice5.setVisible(false); break;
            case "1": estudio("1"); break;
            case "2": estudio("2"); break;
            case "3": estudio("3"); break;
            case "4": estudio("4"); break;
            case "13": Trabajar("13"); break;
            case "14": Trabajar("14"); break;
            case "15": Trabajar("15"); break;
            case "16": Trabajar("16"); break;
        }
    }

    public void beggining(){
        ui.mainTextArea.setText("The final exams are coming \nWhat are you going to do?");
        ui.choice1.setText("Study");
        ui.choice2.setText("Sleep");
        ui.choice3.setText("Go out");
        ui.choice4.setText("Work");

        main.nextPosition1 = "Study";
        main.nextPosition2 = "Sleep";
        main.nextPosition3 = "Go out";
        main.nextPosition4 = "Work";
    }

    public void study(){
        ui.mainTextArea.setText("You decide to prepare yourself and study. \nChoose which one to begin with");
        List<Materia> materias  = estudianteActual.getMaterias();
        ui.choice1.setText("" + materias.getFirst().getNombre());
        ui.choice2.setText("" + materias.get(1).getNombre());
        ui.choice3.setText("" + materias.get(2).getNombre());
        ui.choice4.setText("" + materias.getLast().getNombre());
        ui.choice5.setVisible(true);

        main.nextPosition1 = "1";
        main.nextPosition2 = "2";
        main.nextPosition3 = "3";
        main.nextPosition4 = "4";
        main.nextPosition5 = ">";
    }
    public void sleep(){
        ui.mainTextArea.setText("You decide to sleep through the day. \nYour chances of passing decrease and you feel guilty");
        ui.choice1.setText("");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setVisible(true);

        main.nextPosition1 = "5";
        main.nextPosition2 = "6";
        main.nextPosition3 = "7";
        main.nextPosition4 = "8";
        main.nextPosition5 = ">";

    }
    public void goOut(){
        ui.mainTextArea.setText("You decide to go out with friends and enjoy the day. \nYour chances of passing decrease. \nYou lose money");
        /*List<Materia> materias  = estudianteActual.getMaterias();
        ui.choice1.setText("" + materias.getFirst().getNombre());
        ui.choice2.setText("" + materias.get(1).getNombre());
        ui.choice3.setText("" + materias.get(2).getNombre());
        ui.choice4.setText("" + materias.getLast().getNombre());*/
        ui.choice1.setText("");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        ui.choice5.setVisible(true);

        main.nextPosition1 = "9";
        main.nextPosition2 = "10";
        main.nextPosition3 = "11";
        main.nextPosition4 = "12";
        main.nextPosition5 = ">";
    }

    public void work(){
        ui.mainTextArea.setText("You decide to work. \nYour chances of passing decrease and you feel guilty. You earn money");
        ui.choice1.setText("" + trabajosActual.getFirst().getNombre());
        ui.choice2.setText("" + trabajosActual.get(1).getNombre());
        ui.choice3.setText("" + trabajosActual.get(2).getNombre());
        ui.choice4.setText("" + trabajosActual.getLast().getNombre());
        ui.choice5.setVisible(true);

        main.nextPosition1 = "13";
        main.nextPosition2 = "14";
        main.nextPosition3 = "15";
        main.nextPosition4 = "16";
        main.nextPosition5 = ">";
    }

    public void estudio(String materia){
        List<Materia> materias  = estudianteActual.getMaterias();
        switch (materia){
            case "1": ui.mainTextArea.setText("You study " + materias.getFirst().getNombre() + ".\nYou gain ");
                estudianteActual.estudiar(materias.getFirst());
                ui.sNumberLabel.setText("" + estudianteActual.getCordura());
                ui.moneyNameLabel.setText("" + estudianteActual.getPlata());
                ui.pcNameLabel.setText("" + estudianteActual.getCapacidadDeestudio());
            break;
            case "2": ui.mainTextArea.setText("You study " + materias.get(1).getNombre() + ".\nYou gain");
                estudianteActual.estudiar(materias.get(1));
                ui.sNumberLabel.setText("" + estudianteActual.getCordura());
                ui.moneyNameLabel.setText("" + estudianteActual.getPlata());
                ui.pcNameLabel.setText("" + estudianteActual.getCapacidadDeestudio());
            break;
            case "3": ui.mainTextArea.setText("You study " + materias.get(2).getNombre() + ".\nYou gain");
                estudianteActual.estudiar(materias.get(2));
                ui.sNumberLabel.setText("" + estudianteActual.getCordura());
                ui.moneyNameLabel.setText("" + estudianteActual.getPlata());
                ui.pcNameLabel.setText("" + estudianteActual.getCapacidadDeestudio());
            break;
            case "4": ui.mainTextArea.setText("You study " + materias.getLast().getNombre() + ".\nYou gain");
                estudianteActual.estudiar(materias.getLast());
                ui.sNumberLabel.setText("" + estudianteActual.getCordura());
                ui.moneyNameLabel.setText("" + estudianteActual.getPlata());
                ui.pcNameLabel.setText("" + estudianteActual.getCapacidadDeestudio());
            break;
        }
    }

    public void Trabajar (String trabajo){
        switch (trabajo){
            case "13": ui.mainTextArea.setText("You work " + trabajosActual.getFirst().getNombre() + ".\nYou gain ");
                estudianteActual.trabajar(trabajosActual.getFirst());
                ui.sNumberLabel.setText("" + estudianteActual.getCordura());
                ui.moneyNameLabel.setText("" + estudianteActual.getPlata());
                ui.pcNameLabel.setText("" + estudianteActual.getCapacidadDeestudio());
                break;
            case "14": ui.mainTextArea.setText("You work " + trabajosActual.get(1).getNombre() + ".\nYou gain");
                estudianteActual.trabajar(trabajosActual.get(1));
                ui.sNumberLabel.setText("" + estudianteActual.getCordura());
                ui.moneyNameLabel.setText("" + estudianteActual.getPlata());
                ui.pcNameLabel.setText("" + estudianteActual.getCapacidadDeestudio());
                break;
            case "15": ui.mainTextArea.setText("You work " + trabajosActual.get(2).getNombre() + ".\nYou gain");
                estudianteActual.trabajar(trabajosActual.get(2));
                ui.sNumberLabel.setText("" + estudianteActual.getCordura());
                ui.moneyNameLabel.setText("" + estudianteActual.getPlata());
                ui.pcNameLabel.setText("" + estudianteActual.getCapacidadDeestudio());
                break;
            case "16": ui.mainTextArea.setText("You work " + trabajosActual.getLast().getNombre() + ".\nYou gain");
                estudianteActual.trabajar(trabajosActual.getLast());
                ui.sNumberLabel.setText("" + estudianteActual.getCordura());
                ui.moneyNameLabel.setText("" + estudianteActual.getPlata());
                ui.pcNameLabel.setText("" + estudianteActual.getCapacidadDeestudio());
                break;

        }
    }
}
