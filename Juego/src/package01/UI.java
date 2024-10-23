package package01;

import javax.swing.*;
import java.awt.*;

public class UI {
    JFrame window;
    JPanel titleNamePanel, startButtonPanel,quitButtonPanel, difficultyPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, sanityLabel, sNumberLabel, moneyLabel, moneyNameLabel, passChanceLabel, pcNameLabel;
    JButton startButton, quitButton, difEasy, difMedium, difHard, choice1, choice2, choice3, choice4, choice5;
    JTextArea mainTextArea, daysTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);

    public void createUI(Main.ChoiceHandler cHandler){

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

        //start button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);
        startButton = new JButton("Start");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("start");
        startButtonPanel.add(startButton);
        startButtonPanel.setVisible(true);

        //quit button
        quitButtonPanel = new JPanel();
        quitButtonPanel.setBounds(300, 450, 200, 100);
        quitButtonPanel.setBackground(Color.black);
        quitButton = new JButton("Quit");
        quitButton.setBackground(Color.black);
        quitButton.setForeground(Color.white);
        quitButton.setFont(normalFont);
        quitButton.setFocusPainted(false);
        quitButton.addActionListener(cHandler);
        quitButton.setActionCommand("quit");
        quitButtonPanel.add(quitButton);
        quitButtonPanel.setVisible(true);

        window.add(titleNamePanel);
        window.add(startButtonPanel);
        window.add(quitButtonPanel);

        //difficulty screen
        difficultyPanel = new JPanel();
        difficultyPanel.setBounds(300, 200, 200, 150);
        difficultyPanel.setBackground(Color.black);
        difficultyPanel.setLayout(new GridLayout(3,1));
        difficultyPanel.setVisible(false);
        window.add(difficultyPanel);

        //difficulty buttons
        difEasy = new JButton("Marketing");
        difEasy.setBackground(Color.black);
        difEasy.setForeground(Color.white);
        difEasy.setFont(normalFont);
        difEasy.setFocusPainted(false);
        difEasy.addActionListener(cHandler);
        difEasy.setActionCommand("easy");
        difficultyPanel.add(difEasy);

        difMedium = new JButton("Artes");
        difMedium.setBackground(Color.black);
        difMedium.setForeground(Color.white);
        difMedium.setFont(normalFont);
        difMedium.setFocusPainted(false);
        difMedium.addActionListener(cHandler);
        difMedium.setActionCommand("medium");
        difficultyPanel.add(difMedium);

        difHard = new JButton("Ingeniería");
        difHard.setBackground(Color.black);
        difHard.setForeground(Color.white);
        difHard.setFont(normalFont);
        difHard.setFocusPainted(false);
        difHard.addActionListener(cHandler);
        difHard.setActionCommand("hard");
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

        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("choice1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("choice2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("choice3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(cHandler);
        choice4.setActionCommand("choice4");
        choiceButtonPanel.add(choice4);

        choice5 = new JButton(">");
        choice5.setBackground(Color.black);
        choice5.setForeground(Color.white);
        choice5.setFont(normalFont);
        choice5.setFocusPainted(false);
        choice5.addActionListener(cHandler);
        choice5.setActionCommand(">");
        choiceButtonPanel.add(choice5);
        choice5.setVisible(false);

        playerPanel = new JPanel();
        playerPanel.setBounds(90, 15, 650, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 4));
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

        playerPanel.setVisible(false);

        window.setVisible(true);
    }
}
