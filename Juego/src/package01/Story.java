package package01;
import Objetos.*;

import java.awt.*;
import java.io.*;
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
        this.dia = dias.getFirst();
    }


    public Estudiante estudianteMarketing() {
        //easy
        String userName = ui.getName();
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
        Estudiante estudiante = new Estudiante(userName, 100, 10000, 10, 100.0d,"jugador", marketing, materias);
        setTrabajos(trabajos);
        return estudiante;
    }

    public Estudiante estudianteArtes() {
        //medium
        String userName = ui.getName();
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
        Estudiante estudiante = new Estudiante(userName, 100, 1000, 10, 100.0d,"jugador", artes, materias);
        setTrabajos(trabajos);
        return estudiante;
    }

    public Estudiante estudianteIngenieria() {
        //hard
        String userName = ui.getName();
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
        Estudiante estudiante = new Estudiante(userName, 100, 5000, 10, 100.0d,"jugador", ingenieria, materias);
        setTrabajos(trabajos);
        return estudiante;
    }

    public void difficultyChosen(String dificultad) {
        Estudiante estudiante = switch (dificultad) {
            case "easy" -> estudianteMarketing(); // Genera estudiante de Marketing
            case "medium" -> estudianteArtes(); // Genera estudiante de Artes
            case "hard" -> estudianteIngenieria(); // Genera estudiante de Ingeniería
            default -> null; // Inicializa el estudiante
        };

        setEstudiante(estudiante);
        defaultSetup();
    }

    public void setTrabajos(ArrayList<Trabajo> trabajos){
        this.trabajosActual = trabajos;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudianteActual = estudiante; //Método para establecer el estudiante
    }

    public void defaultSetup(){
        ui.sNumberLabel.setText("" + Math.round(estudianteActual.getCordura()));
        ui.moneyNameLabel.setText("" + Math.round(estudianteActual.getPlata()));
        ui.repNameLabel.setText("" + Math.round(estudianteActual.getReputacion()));
        this.dia = dias.getFirst(); // Inicializa con el primer día de la lista
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
                updateTexts();
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

        // Comprueba si hay un día siguiente
        if (indiceActual + 1 < dias.size()) {
            dia = dias.get(indiceActual + 1); // Asigna el siguiente día
            dia.setTiempo(7); // Establece el tiempo para el nuevo día, ajusta según sea necesario
            actualizarDia(dia);

            // Comprueba si estamos en la segunda semana
            if (contadorRepeticiones >= 1 && indiceActual != 1 && indiceActual != 7 && parcial == 1) {
                parciales(); // Solo llama a parciales si estamos en la segunda semana
            } else {
                beggining(); // Muestra la nueva situación
                updateTexts();
            }
        } else {
            // Se ha alcanzado el final de la lista de días
            if (contadorRepeticiones < 1) { // Comprueba si se ha recorrido una vez completa la lista
                contadorRepeticiones++;
                dia = dias.getFirst(); // Reinicia al primer día
                dia.setTiempo(7); // Restablece el tiempo
                actualizarDia(dia); // Actualiza la interfaz
                beggining();
                updateTexts();
            } else {
                // Lógica cuando no hay más días (fin del juego, etc.)
                ui.mainTextArea.setText("No more days left.");
                Endings();
            }
        }
    }

    public void updateTexts(){
        ui.sNumberLabel.setText("" + Math.round(estudianteActual.getCordura()));
        ui.moneyNameLabel.setText("" + Math.round(estudianteActual.getPlata()));
        ui.repNameLabel.setText("" + Math.round(estudianteActual.getReputacion()));
    }

    public void beggining() {
        ui.daysTextArea.setText("Day: " + dia.getDia() + "\nHora: " + dia.getTiempo());
        ui.mainTextArea.setText("2 weeks before final exams \nWhat are you going to do?");
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
        ui.choice1.setText(materias.getFirst().getNombre());
        ui.choice2.setText(materias.get(1).getNombre());
        ui.choice3.setText(materias.get(2).getNombre());
        ui.choice4.setText(materias.getLast().getNombre());
        ui.choice5.setVisible(true);

        main.nextPosition1 = "1";
        main.nextPosition2 = "2";
        main.nextPosition3 = "3";
        main.nextPosition4 = "4";
        main.nextPosition5 = ">";
    }
    public void sleep(){
        ui.mainTextArea.setText("You decide to sleep through the day. \nYour chances of passing decrease and you feel guilty");

        Dormir();
    }
    public void goOut(){
        ui.mainTextArea.setText("You decide to go out with friends and enjoy the day. \nYour chances of passing decrease. \nYour reputation goes way up.");

        estudianteActual.setReputacion(estudianteActual.getReputacion()*1.5);

        updateTexts();
    }

    public void work(){
        ui.mainTextArea.setText("You decide to work. \nYour chances of passing decrease and you feel guilty. You earn money");
        ui.choice1.setText(trabajosActual.getFirst().getNombre());
        ui.choice2.setText(trabajosActual.get(1).getNombre());
        ui.choice3.setText(trabajosActual.get(2).getNombre());
        ui.choice4.setText(trabajosActual.getLast().getNombre());
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
                updateTexts();
                break;
            case "2": ui.mainTextArea.setText("You study " + materias.get(1).getNombre() + ".\nPassing chances " + materias.get(1).getProbabilidadDeAprobar() + "%");
                estudianteActual.estudiar(materias.get(1));
                updateTexts();
                break;
            case "3": ui.mainTextArea.setText("You study " + materias.get(2).getNombre() + ".\nPassing chances " + materias.get(2).getProbabilidadDeAprobar() + "%");
                estudianteActual.estudiar(materias.get(2));
                updateTexts();
                break;
            case "4": ui.mainTextArea.setText("You study " + materias.getLast().getNombre() + ".\nPassing chances " + materias.getLast().getProbabilidadDeAprobar() + "%");
                estudianteActual.estudiar(materias.getLast());
                updateTexts();
                break;
        }
    }

    public void Trabajar (String trabajo){
        switch (trabajo){
            case "13": ui.mainTextArea.setText("You work " + trabajosActual.getFirst().getNombre() + ".\nYou gain ");
                estudianteActual.trabajar(trabajosActual.getFirst());
                updateTexts();
                break;
            case "14": ui.mainTextArea.setText("You work " + trabajosActual.get(1).getNombre() + ".\nYou gain");
                estudianteActual.trabajar(trabajosActual.get(1));
                updateTexts();
                break;
            case "15": ui.mainTextArea.setText("You work " + trabajosActual.get(2).getNombre() + ".\nYou gain");
                estudianteActual.trabajar(trabajosActual.get(2));
                updateTexts();
                break;
            case "16": ui.mainTextArea.setText("You work " + trabajosActual.getLast().getNombre() + ".\nYou gain");
                estudianteActual.trabajar(trabajosActual.getLast());
                updateTexts();
                break;

        }
    }

    public void Dormir(){
        ui.mainTextArea.setText("You go to sleep " + "\nYou regain sanity");
        estudianteActual.descansar();
        updateTexts();
    }

    public void parciales(){
        List<Materia> materias  = estudianteActual.getMaterias();
        int i = random.nextInt(materias.size());
        double resultado = random.nextDouble() * 100;
        double probabilidadAprobarMateria = materias.get(i).getProbabilidadDeAprobar();
        if (resultado < probabilidadAprobarMateria){
            ui.mainTextArea.setText("You did an " + materias.get(i).getNombre() + " exam. \nYou passed.");
        } else {
            ui.mainTextArea.setText("You did an " + materias.get(i).getNombre() + " exam. \nYou failed.");
            failedExams += 1;
        }
    }

    public void Endings(){
        vm.ending();
        double corduraFinal = estudianteActual.getCordura();
        double plataFinal = estudianteActual.getPlata();
        double reputacionFinal = estudianteActual.getReputacion();

        if (corduraFinal <= 0 && failedExams > 3) {
            ui.mainTextArea.setText("In the quiet, I chose the sea. \nA final exhale, and the waves held me gently, where silence felt like home.");
        } else if (failedExams > 3 && reputacionFinal < 30) {
            ui.mainTextArea.setText("""
                    Fingers trace the edge of emptiness, \s
                    laughter swallowed by shadows. \s
                    Solitude wraps tight, \s
                    dreams slipping into darkness.""");
        } else if (corduraFinal < 30 && failedExams <= 3) {
            ui.mainTextArea.setText("to be set");
        } else if (corduraFinal >= 30 && failedExams <= 2) {
            ui.mainTextArea.setText("to be set");
        } else if (corduraFinal >= 70 && reputacionFinal >= 70 && failedExams <= 1) {
            ui.mainTextArea.setText("""
                    Fingers trace old promises, now shadows.\s
                    A final kiss, heavy with silence.\s
                    Sheets tangled, bodies drift apart—\s
                    echoes of love, fading with morning light.""");
        } else if (corduraFinal >= 90 && reputacionFinal >= 90 && plataFinal >= 50 && failedExams == 0) {
            ui.mainTextArea.setText("""
                In the soft dusk, I chose the light. \s
                A breath of laughter, and the bottle sighed open—a slow pour of golden hope, filling the night.""");
        } else {
            ui.mainTextArea.setText("to be set");
        }
        gameResume();
    }

    public void interaccionesNPC(){

    }

    public void gameResume(){
        List<Materia> materias  = estudianteActual.getMaterias();
        File archivo = new File("resumen_de_juego.txt");
        try (FileWriter writer = new FileWriter(archivo)) {
            // Escribir los datos de cada persona en el archivo
            writer.write("Nombre del estudiante: " + estudianteActual.getNombre() + "\n");
            writer.write("Cordura final: " + estudianteActual.getCordura() + "\n");
            writer.write("Plata final: " + estudianteActual.getPlata() + "\n");
            writer.write(materias.getFirst().getNombre() + " " + materias.getFirst().getProbabilidadDeAprobar() +"%"+ "\n");
            writer.write(materias.get(1).getNombre() + " " + materias.get(1).getProbabilidadDeAprobar() +"%"+ "\n");
            writer.write(materias.get(2).getNombre() + " " + materias.get(2).getProbabilidadDeAprobar() +"%"+ "\n");
            writer.write(materias.getLast().getNombre() + " " + materias.getLast().getProbabilidadDeAprobar() +"%"+ "\n");
            writer.write("Reputacion final: " + estudianteActual.getReputacion() + "\n");
            System.out.println("Datos escritos en el archivo.");

            // Intentar abrir el archivo automáticamente
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (archivo.exists()) {
                    desktop.open(archivo);
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}