package package01;

import javax.swing.*;
import java.awt.*;

public class UI {
    JFrame window;
    JPanel titleNamePanel, startButtonPanel,quitButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, sanityLabel, sNumberLabel, moneyLabel, moneyNameLabel, passChanceLabel, pcNameLabel;
    JButton startButton, quitButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);

    public void createUI(Main.ChoiceHandler cHandler){

        //window
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        //title screen
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(80,100,650,500);
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

        window.add(titleNamePanel);
        window.add(startButtonPanel);
        window.add(quitButtonPanel);

        //Game screen
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        //Text Area
        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        //Choices
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
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

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
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

        //Chances of passing
        passChanceLabel = new JLabel("Passing: ");
        passChanceLabel.setForeground(Color.white);
        passChanceLabel.setFont(normalFont);
        playerPanel.add(passChanceLabel);

        pcNameLabel = new JLabel();
        pcNameLabel.setForeground(Color.white);
        pcNameLabel.setFont(normalFont);
        playerPanel.add(pcNameLabel);

        window.setVisible(true);
    }
}
