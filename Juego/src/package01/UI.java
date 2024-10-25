package package01;

import javax.swing.*;
import java.awt.*;

public class UI {
    JFrame window;
    JPanel titleNamePanel, startButtonPanel,quitButtonPanel, difficultyPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, sanityLabel, sNumberLabel, moneyLabel, moneyNameLabel, reputationLabel, repNameLabel;
    JButton startButton, quitButton, difEasy, difMedium, difHard, choice1, choice2, choice3, choice4, choice5;
    JTextArea mainTextArea, daysTextArea, difTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);

    private void styleButton(JButton button, Main.ChoiceHandler cHandler, String actionCommand) {
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.setFont(normalFont);
        button.setFocusPainted(false);
        button.setContentAreaFilled(true); // Allow content area to be filled
        button.setOpaque(true); // Ensures background color is displayed
        button.setBorderPainted(true);
        button.addActionListener(cHandler);
        button.setActionCommand(actionCommand);
    }

    public void createUI(Main.ChoiceHandler cHandler){

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //window
        window = new JFrame("Universal Sorrow");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        //title screen
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(75,100,650,500);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Universal Sorrow");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);

        //buttons
        startButton = new JButton("Start");
        styleButton(startButton, cHandler, "start");

        quitButton = new JButton("Quit");
        styleButton(quitButton, cHandler, "quit");

        // Difficulty buttons
        difEasy = new JButton("Marketing");
        styleButton(difEasy, cHandler, "easy");

        difMedium = new JButton("Artes");
        styleButton(difMedium, cHandler, "medium");

        difHard = new JButton("Ingeniería");
        styleButton(difHard, cHandler, "hard");

        // Choice buttons
        choice1 = new JButton("Choice 1");
        styleButton(choice1, cHandler, "choice1");

        choice2 = new JButton("Choice 2");
        styleButton(choice2, cHandler, "choice2");

        choice3 = new JButton("Choice 3");
        styleButton(choice3, cHandler, "choice3");

        choice4 = new JButton("Choice 4");
        styleButton(choice4, cHandler, "choice4");

        choice5 = new JButton(">");
        styleButton(choice5, cHandler, ">");

        //start button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);
        startButtonPanel.add(startButton);
        startButtonPanel.setVisible(true);

        //quit button
        quitButtonPanel = new JPanel();
        quitButtonPanel.setBounds(300, 450, 200, 100);
        quitButtonPanel.setBackground(Color.black);
        quitButtonPanel.add(quitButton);
        quitButtonPanel.setVisible(true);

        window.add(titleNamePanel);
        window.add(startButtonPanel);
        window.add(quitButtonPanel);

        //difficulty screen
        difficultyPanel = new JPanel();
        difficultyPanel.setBounds(250, 200, 300, 150);
        difficultyPanel.setBackground(Color.black);
        difficultyPanel.setLayout(new GridLayout(4,1));
        difficultyPanel.setVisible(false);
        window.add(difficultyPanel);

        //difficulty text
        difTextArea = new JTextArea("Select a difficulty");
        difTextArea.setBackground(Color.black);
        difTextArea.setForeground(Color.white);
        difTextArea.setFont(normalFont);
        difTextArea.setLineWrap(true);
        difTextArea.setWrapStyleWord(true);
        difTextArea.setEditable(false);
        difficultyPanel.add(difTextArea);

        //difficulty buttons

        difficultyPanel.add(difEasy);


        difficultyPanel.add(difMedium);


        difficultyPanel.add(difHard);

        //Game screen
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 200);
        mainTextPanel.setBackground(Color.black);
        mainTextPanel.setVisible(false);
        mainTextPanel.setLayout(new BoxLayout(mainTextPanel, BoxLayout.Y_AXIS)); // Usa BoxLayout
        window.add(mainTextPanel);

        //Days text area
        daysTextArea = new JTextArea("This is the day text area");
        daysTextArea.setBackground(Color.black);
        daysTextArea.setForeground(Color.white);
        daysTextArea.setFont(normalFont);
        daysTextArea.setLineWrap(true);
        daysTextArea.setWrapStyleWord(true);
        daysTextArea.setEditable(false);
        mainTextPanel.add(daysTextArea);

        //Text Area
        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        //Choices
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 300, 300, 200);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(5, 1));
        choiceButtonPanel.setVisible(false);
        window.add(choiceButtonPanel);

        choiceButtonPanel.add(choice1);

        choiceButtonPanel.add(choice2);

        choiceButtonPanel.add(choice3);

        choiceButtonPanel.add(choice4);

        choiceButtonPanel.add(choice5);
        choice5.setVisible(false);

        playerPanel = new JPanel();
        playerPanel.setBounds(40, 15, 800, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 6,0,0));
        //playerPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 0)); si es este y: 30
        window.add(playerPanel);

        //Sanity
        sanityLabel = new JLabel("Sanity: ");
        sanityLabel.setFont(normalFont);
        sanityLabel.setForeground(Color.white);
        playerPanel.add(sanityLabel);

        sNumberLabel = new JLabel();
        sNumberLabel.setForeground(Color.white);
        sNumberLabel.setFont(normalFont);
        playerPanel.add(sNumberLabel);

        //Money
        moneyLabel = new JLabel("Money: ");
        moneyLabel.setForeground(Color.white);
        moneyLabel.setFont(normalFont);
        playerPanel.add(moneyLabel);

        moneyNameLabel = new JLabel();
        moneyNameLabel.setForeground(Color.white);
        moneyNameLabel.setFont(normalFont);
        playerPanel.add(moneyNameLabel);

        //Reputation
        reputationLabel = new JLabel("Reputation: ");
        reputationLabel.setForeground(Color.white);
        reputationLabel.setFont(normalFont);
        playerPanel.add(reputationLabel);

        repNameLabel = new JLabel();
        repNameLabel.setForeground(Color.white);
        repNameLabel.setFont(normalFont);
        playerPanel.add(repNameLabel);

        playerPanel.setVisible(false);

        window.setVisible(true);
    }
}