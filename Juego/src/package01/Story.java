package package01;
import Objetos.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Story {
    Main main;
    UI ui;
    VisibilityManager vm;
    private Estudiante estudianteActual;
    private ArrayList<Trabajo> trabajosActual;
    Dia dia;
    private int contadorRepeticiones = 0;
    ArrayList<Dia> dias = new ArrayList<>();
    Random random = new Random();
    int failedExams;

    public Story(Main main, UI ui, VisibilityManager vm) {
        this.main = main;
        this.ui = ui;
        this.vm = vm;

        // Inicializar los días en el ArrayList
        dias.add(new Dia("Domingo", 7, null));
        dias.add(new Dia("Lunes", 7, null));
        dias.add(new Dia("Martes", 7, null));
        dias.add(new Dia("Miércoles", 7, null));
        dias.add(new Dia("Jueves", 7, null));
        dias.add(new Dia("Viernes", 7, null));
        dias.add(new Dia("Sábado", 7, null));

        // Establecer el día inicial como el primer elemento de la lista
        this.dia = dias.get(0);
    }


    public Estudiante estudianteMarketing() {
        //easy
        ArrayList<Materia> materias = new ArrayList<>();
        materias.add(new Materia("Marketing Digital", 2, 0.85));
        materias.add(new Materia("Estrategias de Precios", 3, 0.65));
        materias.add(new Materia("Ventas y Negociación", 3, 0.75));
        materias.add(new Materia("Ética en el Marketing", 1, 0.95));
        ArrayList<Bono> bonos = new ArrayList<>();
        bonos.add(new Bono(1, 0.2d, 9999));
        bonos.add(new Bono(2, 1.0d, 9999));
        bonos.add(new Bono(3, 1.0d, 9999));
        ArrayList<Trabajo> trabajos = new ArrayList<>();
        Trabajo asistenteMarketing = new Trabajo("Asistente de Marketing", 20, 1500.0);
        Trabajo gestorRedesSociales = new Trabajo("Gestor de Redes Sociales", 15, 1200.0);
        Trabajo analistaMercado = new Trabajo("Analista de Mercado", 25, 1800.0);
        Trabajo creadorContenido = new Trabajo("Creador de Contenido", 10, 800.0);
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
        bonos.add(new Bono(1, 0.2d, 9999));
        bonos.add(new Bono(2, 1.0d, 9999));
        bonos.add(new Bono(3, 1.0d, 9999));
        ArrayList<Trabajo> trabajos = new ArrayList<>();
        Trabajo actorTeatro = new Trabajo("Actor en Obras de Teatro", 20, 1.4);
        Trabajo profesorArte = new Trabajo("Profesor de Clases de Arte", 15, 1.0);
        Trabajo bailarinFreelance = new Trabajo("Bailarín Freelance", 10, 9.0);
        Trabajo artistaCallejero = new Trabajo("Artista Callejero", 25, 7.0);
        trabajos.add(actorTeatro);
        trabajos.add(profesorArte);
        trabajos.add(bailarinFreelance);
        trabajos.add(artistaCallejero);
        Carrera artes = new Carrera("Artes", materias, bonos);
        Estudiante estudiante = new Estudiante("juan", 100, 1000, 10, "jugador", artes, materias);
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
        bonos.add(new Bono(1, 0.2d, 9999));
        bonos.add(new Bono(2, 1.0d, 9999));
        bonos.add(new Bono(3, 1.0d, 9999));
        ArrayList<Trabajo> trabajos = new ArrayList<>();
        Trabajo ingenieroSoftware = new Trabajo("Ingeniero de Software", 40, 6.0);
        Trabajo ingenieroCivil = new Trabajo("Ingeniero Civil Asistente", 30, 4.5);
        Trabajo ingenieroElectronico = new Trabajo("Ingeniero Electrónico", 35, 5.5);
        Trabajo consultorProyectos = new Trabajo("Consultor de Proyectos", 25, 5.0);
        trabajos.add(ingenieroSoftware);
        trabajos.add(ingenieroCivil);
        trabajos.add(ingenieroElectronico);
        trabajos.add(consultorProyectos);
        Carrera ingenieria = new Carrera("Ingenieria", materias, bonos);
        Estudiante estudiante = new Estudiante("juan", 100, 5000, 10, "jugador", ingenieria, materias);
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
        ui.sNumberLabel.setText("" + Math.round(estudianteActual.getCordura()));
        ui.moneyNameLabel.setText("" + Math.round(estudianteActual.getPlata()));
        this.dia = dias.get(0); // Inicializa con el primer día de la lista
    }

    public void selectPosition(String nextPosition) {
        switch (nextPosition) {
            case "Study":
                study();
                break;
            case "Sleep":
                sleep();
                dia.setTiempo(dia.getTiempo() - 7);
                break;
            case "Go out":
                goOut();
                dia.setTiempo(dia.getTiempo() - 2);
                break;
            case "Work":
                work();
                break;
            case ">":
                beggining();
                ui.choice5.setVisible(false);
                break;
            case "1":
                estudio("1");
                dia.setTiempo(dia.getTiempo() - 1);
                break;
            case "2":
                estudio("2");
                dia.setTiempo(dia.getTiempo() - 1);
                break;
            case "3":
                estudio("3");
                dia.setTiempo(dia.getTiempo() - 1);
                break;
            case "4":
                estudio("4");
                dia.setTiempo(dia.getTiempo() - 1);
                break;
            case "13":
                Trabajar("13");
                dia.setTiempo(dia.getTiempo() - 3);
                break;
            case "14":
                Trabajar("14");
                dia.setTiempo(dia.getTiempo() - 3);
                break;
            case "15":
                Trabajar("15");
                dia.setTiempo(dia.getTiempo() - 3);
                break;
            case "16":
                Trabajar("16");
                dia.setTiempo(dia.getTiempo() - 3);
                break;
        }

        // Ensure tiempo does not go below zero
        if (dia.getTiempo() < 0) {
            dia.setTiempo(0);
        }

        actualizarDia(dia);

        // Verifica si el tiempo ha llegado a cero y pasa al siguiente día
        if (dia.getTiempo() == 0) {
            int parcial = random.nextInt(2);
            pasarAlSiguienteDia(parcial);
        }
    }

    public void pasarAlSiguienteDia(int parcial) {
        // Encuentra el índice del día actual en el ArrayList
        int indiceActual = dias.indexOf(dia);
        System.out.println(parcial);

        // Comprueba si hay un día siguiente
        if (indiceActual + 1 < dias.size()) {
            dia = dias.get(indiceActual + 1); // Asigna el siguiente día
            dia.setTiempo(7); // Establece el tiempo para el nuevo día, ajusta según sea necesario
            actualizarDia(dia);

            // Comprueba si estamos en la segunda semana
            if (contadorRepeticiones >= 1 && parcial == 1) {
                parciales(); // Solo llama a parciales si estamos en la segunda semana
            } else {
                beggining(); // Muestra la nueva situación
            }
        } else {
            // Se ha alcanzado el final de la lista de días
            if (contadorRepeticiones < 1) { // Comprueba si se ha recorrido una vez completa la lista
                contadorRepeticiones++;
                dia = dias.get(0); // Reinicia al primer día
                dia.setTiempo(7); // Restablece el tiempo
                actualizarDia(dia); // Actualiza la interfaz
                beggining();
            } else {
                // Lógica cuando no hay más días (fin del juego, etc.)
                ui.mainTextArea.setText("No more days left.");
                Endings();
            }
        }
    }


    public void beggining() {
        ui.daysTextArea.setText("Day: " + dia.getDia() + "\nHora: " + dia.getTiempo());
        ui.mainTextArea.setText("The final exams are coming \nWhat are you going to do?");
        ui.choice1.setText("Study");
        ui.choice2.setText("Sleep");
        ui.choice3.setText("Go out");
        ui.choice4.setText("Work");

        // Configura las posiciones de las decisiones
        main.nextPosition1 = "Study";
        main.nextPosition2 = "Sleep";
        main.nextPosition3 = "Go out";
        main.nextPosition4 = "Work";
    }

    public void actualizarDia(Dia dia) {
        ui.daysTextArea.setText("Day: " + dia.getDia() + "\nHora: " + dia.getTiempo());
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

        Dormir();

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
            case "1": ui.mainTextArea.setText("You study " + materias.getFirst().getNombre() + ".\nPassing chances " + materias.getFirst().getProbabilidadDeAprobar() + "%");
                estudianteActual.estudiar(materias.getFirst());
                ui.sNumberLabel.setText("" + Math.round(estudianteActual.getCordura()));
                ui.moneyNameLabel.setText("" + Math.round(estudianteActual.getPlata()));
                break;
            case "2": ui.mainTextArea.setText("You study " + materias.get(1).getNombre() + ".\nPassing chances " + materias.get(1).getProbabilidadDeAprobar() + "%");
                estudianteActual.estudiar(materias.get(1));
                ui.sNumberLabel.setText("" + Math.round(estudianteActual.getCordura()));
                ui.moneyNameLabel.setText("" + Math.round(estudianteActual.getPlata()));
                break;
            case "3": ui.mainTextArea.setText("You study " + materias.get(2).getNombre() + ".\nPassing chances " + materias.get(2).getProbabilidadDeAprobar() + "%");
                estudianteActual.estudiar(materias.get(2));
                ui.sNumberLabel.setText("" + Math.round(estudianteActual.getCordura()));
                ui.moneyNameLabel.setText("" + Math.round(estudianteActual.getPlata()));
                break;
            case "4": ui.mainTextArea.setText("You study " + materias.getLast().getNombre() + ".\nPassing chances " + materias.getLast().getProbabilidadDeAprobar() + "%");
                estudianteActual.estudiar(materias.getLast());
                ui.sNumberLabel.setText("" + Math.round(estudianteActual.getCordura()));
                ui.moneyNameLabel.setText("" + Math.round(estudianteActual.getPlata()));
                break;
        }
    }

    public void Trabajar (String trabajo){
        switch (trabajo){
            case "13": ui.mainTextArea.setText("You work " + trabajosActual.getFirst().getNombre() + ".\nYou gain ");
                estudianteActual.trabajar(trabajosActual.getFirst());
                ui.sNumberLabel.setText("" + Math.round(estudianteActual.getCordura()));
                ui.moneyNameLabel.setText("" + Math.round(estudianteActual.getPlata()));
                break;
            case "14": ui.mainTextArea.setText("You work " + trabajosActual.get(1).getNombre() + ".\nYou gain");
                estudianteActual.trabajar(trabajosActual.get(1));
                ui.sNumberLabel.setText("" + Math.round(estudianteActual.getCordura()));
                ui.moneyNameLabel.setText("" + Math.round(estudianteActual.getPlata()));
                break;
            case "15": ui.mainTextArea.setText("You work " + trabajosActual.get(2).getNombre() + ".\nYou gain");
                estudianteActual.trabajar(trabajosActual.get(2));
                ui.sNumberLabel.setText("" + Math.round(estudianteActual.getCordura()));
                ui.moneyNameLabel.setText("" + Math.round(estudianteActual.getPlata()));
                break;
            case "16": ui.mainTextArea.setText("You work " + trabajosActual.getLast().getNombre() + ".\nYou gain");
                estudianteActual.trabajar(trabajosActual.getLast());
                ui.sNumberLabel.setText("" + Math.round(estudianteActual.getCordura()));
                ui.moneyNameLabel.setText("" + Math.round(estudianteActual.getPlata()));
                break;

        }
    }

    public void Dormir(){
        ui.mainTextArea.setText("You go to sleep " + "\nYou regain sanity");
        estudianteActual.descansar();
        ui.sNumberLabel.setText("" + Math.round(estudianteActual.getCordura()));
        ui.moneyNameLabel.setText("" + Math.round(estudianteActual.getPlata()));
    }

    public void parciales(){
        List<Materia> materias  = estudianteActual.getMaterias();
        int i = random.nextInt(materias.size());
        double resultado = random.nextDouble() * 100;
        double probabilidadAprobarMateria = materias.get(i).getProbabilidadDeAprobar();
        if (resultado < probabilidadAprobarMateria){
            ui.mainTextArea.setText("You did an " + materias.get(i).getNombre() + " exam. \nYou passed.");
            failedExams += 1;
        } else {
            ui.mainTextArea.setText("You did an " + materias.get(i).getNombre() + " exam. \nYou failed.");
        }
    }

    public void Endings(){
        double corduraFinal = estudianteActual.getCordura();
        double plataFinal = estudianteActual.getPlata();
        int capacidadFinal = estudianteActual.getCapacidadDeestudio();

        if (corduraFinal <= 20 && failedExams >= 3){
            ui.mainTextArea.setText("In the quiet, I chose the sea. \nA final exhale, and the waves held me gently, where silence felt like home.");
        } else {
            ui.mainTextArea.setText("In the soft dusk, I chose the light. \nA breath of laughter, and the bottle sighed open—a slow pour of golden hope, filling the night.");
        }

        /*
        Fingers trace old promises, now shadows.
        A final kiss, heavy with silence.
        Sheets tangled, bodies drift apart—
        echoes of love, fading with morning light.
        */
    }
}