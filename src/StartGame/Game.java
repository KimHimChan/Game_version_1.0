package StartGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {

    private boolean persRound = false;

    private int[] hp = {100, 100};
    private int[] mana = {0, 0};
    private int[] uron = {0, 0};

    private int[] bonus_hp = {0, 0};
    private int[] bonus_mana = {0, 0};
    private int[] bonus_uron = {0, 0};

    private int round = 1;
    private int[] hod_player = {0, 0};
    private int[] hod_vost = {0, 0};

    //private int time = 10;


    public void NewGame(int[] arrayCardPlayer1, int[] arrayCardPlayer2, int firstPlayer, int secondPlayer, String namefirstPlayer, String namesecondPlayer) {
        System.out.println("first:");
        for (int i = 0; i < arrayCardPlayer1.length; i++) {
            System.out.println(arrayCardPlayer1[i]);
        }

        System.out.println("second:");
        for (int i = 0; i < arrayCardPlayer2.length; i++) {
            System.out.println(arrayCardPlayer2[i]);
        }

        String way = "C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\";
        String classPl0 = "";
        String classPl1 = "";

        if (firstPlayer == 0) classPl0 = "dd";
        else if (firstPlayer == 1) classPl0 = "magician";
        else classPl0 = "tank";

        if (secondPlayer == 0) classPl1 = "dd";
        else if (secondPlayer == 1) classPl1 = "magician";
        else classPl1 = "tank";

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1400, 750);
        frame.setLocation(50, 50);
        frame.setResizable(false);

        frame.setLayout(new FlowLayout());
        frame.setTitle("Game of Power");

        ImageIcon icon = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\die.jpg");
        frame.setIconImage(icon.getImage());
        JLabel label = new JLabel(icon);
        frame.getContentPane().add(label);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        ImageIcon imageIconClass0 = new ImageIcon(way + classPl0 + ".jpg");
        JLabel classlabel0 = new JLabel(imageIconClass0);
        classlabel0.setLocation(100, 100);
        label.add(classlabel0).setSize(250, 400);

        ImageIcon imageIconClass1 = new ImageIcon(way + classPl1 + ".jpg");
        JLabel classlabel1 = new JLabel(imageIconClass1);
        classlabel1.setLocation(1100, 200);
        label.add(classlabel1).setSize(250, 400);
        classlabel1.setEnabled(false);

        JLabel roundLabel = new JLabel("Раунд: " + round);
        roundLabel.setLocation(700, 10);
        roundLabel.setFont(new Font("Serif", Font.BOLD, 20));
        roundLabel.setForeground(Color.WHITE);
        label.add(roundLabel).setSize(200, 30);

        JLabel namePers = new JLabel("Игрок: " + namefirstPlayer);
        namePers.setLocation(600, 30);
        namePers.setFont(new Font("Serif", Font.BOLD, 30));
        namePers.setForeground(Color.WHITE);
        label.add(namePers).setSize(600, 50);


        JLabel hpLabel = new JLabel("Здоровье: " + hp[0]);
        hpLabel.setLocation(750, 150);
        hpLabel.setFont(new Font("Serif", Font.BOLD, 20));
        hpLabel.setForeground(Color.WHITE);
        label.add(hpLabel).setSize(200, 30);

        JLabel manaLabel = new JLabel("Мана: " + mana[0]);
        manaLabel.setLocation(750, 180);
        manaLabel.setFont(new Font("Serif", Font.BOLD, 20));
        manaLabel.setForeground(Color.WHITE);
        label.add(manaLabel).setSize(200, 30);

        JLabel hpLabel1 = new JLabel("Здоровье: " + hp[1]);
        hpLabel1.setLocation(550, 470);
        hpLabel1.setFont(new Font("Serif", Font.BOLD, 20));
        hpLabel1.setForeground(Color.WHITE);
        label.add(hpLabel1).setSize(200, 30);

        JLabel manaLabel1 = new JLabel("Мана: " + mana[1]);
        manaLabel1.setLocation(550, 500);
        manaLabel1.setFont(new Font("Serif", Font.BOLD, 20));
        manaLabel1.setForeground(Color.WHITE);
        label.add(manaLabel1).setSize(200, 30);


        JButton button1 = new JButton();
        button1.setLocation(400, 100);
        button1.setIcon(new ImageIcon(way + classPl0 + ReturnType(arrayCardPlayer1[0])));
        label.add(button1).setSize(120, 165);

        JButton button2 = new JButton();
        button2.setLocation(450, 100);
        button2.setIcon(new ImageIcon(way + classPl0 + ReturnType(arrayCardPlayer1[1])));
        label.add(button2).setSize(120, 165);

        JButton button3 = new JButton();
        button3.setLocation(500, 100);
        button3.setIcon(new ImageIcon(way + classPl0 + ReturnType(arrayCardPlayer1[2])));
        label.add(button3).setSize(120, 165);

        JButton button4 = new JButton();
        button4.setLocation(550, 100);
        button4.setIcon(new ImageIcon(way + classPl0 + ReturnType(arrayCardPlayer1[3])));
        label.add(button4).setSize(120, 165);

        JButton button5 = new JButton();
        button5.setLocation(600, 100);
        button5.setIcon(new ImageIcon(way + classPl0 + ReturnType(arrayCardPlayer1[4])));
        label.add(button5).setSize(120, 165);


        JButton button6 = new JButton();
        button6.setLocation(700, 435);
        button6.setIcon(new ImageIcon(way + classPl1 + ReturnType(arrayCardPlayer2[0])));
        button6.setEnabled(false);
        label.add(button6).setSize(120, 168);

        JButton button7 = new JButton();
        button7.setLocation(750, 435);
        button7.setIcon(new ImageIcon(way + classPl1 + ReturnType(arrayCardPlayer2[1])));
        button7.setEnabled(false);
        label.add(button7).setSize(120, 168);

        JButton button8 = new JButton();
        button8.setLocation(800, 435);
        button8.setIcon(new ImageIcon(way + classPl1 + ReturnType(arrayCardPlayer2[2])));
        button8.setEnabled(false);
        label.add(button8).setSize(120, 168);

        JButton button9 = new JButton();
        button9.setLocation(850, 435);
        button9.setIcon(new ImageIcon(way + classPl1 + ReturnType(arrayCardPlayer2[3])));
        button9.setEnabled(false);
        label.add(button9).setSize(120, 168);

        JButton button10 = new JButton();
        button10.setLocation(900, 435);
        button10.setIcon(new ImageIcon(way + classPl1 + ReturnType(arrayCardPlayer2[4])));
        button10.setEnabled(false);
        label.add(button10).setSize(120, 168);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //класс, игрок, противникб карта, кнопки для блока после хода
                if (Card(firstPlayer, 0, 1, arrayCardPlayer1[0], roundLabel, hpLabel, manaLabel, hpLabel1, manaLabel1,
                        button1, button2, button3, button4, button5, classlabel0, namefirstPlayer, namesecondPlayer, frame)){
                    UnBlock(button6, button7, button8, button9, button10, classlabel1, namePers, namesecondPlayer);
                }

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Card(firstPlayer, 0, 1, arrayCardPlayer1[1], roundLabel, hpLabel, manaLabel, hpLabel1, manaLabel1,
                        button1, button2, button3, button4, button5, classlabel0, namefirstPlayer, namesecondPlayer, frame)){
                    UnBlock(button6, button7, button8, button9, button10, classlabel1, namePers, namesecondPlayer);
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Card(firstPlayer, 0, 1, arrayCardPlayer1[2], roundLabel, hpLabel, manaLabel, hpLabel1, manaLabel1,
                        button1, button2, button3, button4, button5, classlabel0, namefirstPlayer, namesecondPlayer, frame)){
                    UnBlock(button6, button7, button8, button9, button10, classlabel1, namePers, namesecondPlayer);
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Card(firstPlayer, 0, 1, arrayCardPlayer1[3], roundLabel, hpLabel, manaLabel, hpLabel1, manaLabel1,
                        button1, button2, button3, button4, button5, classlabel0, namefirstPlayer, namesecondPlayer, frame)){
                    UnBlock(button6, button7, button8, button9, button10, classlabel1, namePers, namesecondPlayer);
                }
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Card(firstPlayer, 0, 1, arrayCardPlayer1[4], roundLabel, hpLabel, manaLabel, hpLabel1, manaLabel1,
                        button1, button2, button3, button4, button5, classlabel0, namefirstPlayer, namesecondPlayer, frame)){
                    UnBlock(button6, button7, button8, button9, button10, classlabel1, namePers, namesecondPlayer);
                }
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Card(firstPlayer, 1, 0, arrayCardPlayer2[0], roundLabel, hpLabel1, manaLabel1, hpLabel, manaLabel,
                        button6, button7, button8, button9, button10, classlabel1, namefirstPlayer, namesecondPlayer, frame)){
                    UnBlock(button1, button2, button3, button4, button5, classlabel0, namePers, namefirstPlayer);
                }
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Card(firstPlayer, 1, 0, arrayCardPlayer2[1], roundLabel, hpLabel1, manaLabel1, hpLabel, manaLabel,
                        button6, button7, button8, button9, button10, classlabel1, namefirstPlayer, namesecondPlayer, frame)){
                    UnBlock(button1, button2, button3, button4, button5, classlabel0, namePers, namefirstPlayer);
                }
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Card(firstPlayer, 1, 0, arrayCardPlayer2[2], roundLabel, hpLabel1, manaLabel1, hpLabel, manaLabel,
                        button6, button7, button8, button9, button10, classlabel1, namefirstPlayer, namesecondPlayer, frame)){
                    UnBlock(button1, button2, button3, button4, button5, classlabel0, namePers, namefirstPlayer);
                }
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Card(firstPlayer, 1, 0, arrayCardPlayer2[3], roundLabel, hpLabel1, manaLabel1, hpLabel, manaLabel,
                        button6, button7, button8, button9, button10, classlabel1, namefirstPlayer, namesecondPlayer, frame)){
                    UnBlock(button1, button2, button3, button4, button5, classlabel0, namePers, namefirstPlayer);
                }
            }
        });

        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Card(firstPlayer, 1, 0, arrayCardPlayer2[4], roundLabel, hpLabel1, manaLabel1, hpLabel, manaLabel,
                        button6, button7, button8, button9, button10, classlabel1, namefirstPlayer, namesecondPlayer, frame)){
                    UnBlock(button1, button2, button3, button4, button5, classlabel0, namePers, namefirstPlayer);
                }
            }
        });
    }

    private String ReturnType(int arrayCardPlayer) {
        String CardType = "";
        if (arrayCardPlayer < 8) CardType = "\\attack\\" + arrayCardPlayer + ".jpg";
        else if (arrayCardPlayer == 8) CardType = "\\healing\\" + arrayCardPlayer + ".jpg";
        else if (arrayCardPlayer < 11 && arrayCardPlayer > 8) CardType = "\\protection\\" + arrayCardPlayer + ".jpg";
        else CardType = "\\recovery\\" + arrayCardPlayer + ".jpg";

        return CardType;
    }

    private void UnBlock(JButton button1, JButton button2, JButton button3, JButton button4, JButton button5, JLabel classlabel, JLabel namepers, String name) {
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        classlabel.setEnabled(true);
        namepers.setText(String.valueOf(name));
    }

    private boolean Card(int classPlayer, int player, int enemy, int card, JLabel roundLabel, JLabel hpLabel, JLabel manaLabel, JLabel hpLabel1, JLabel manaLabel1,
                      JButton button1, JButton button2, JButton button3, JButton button4, JButton button5, JLabel classlabel,
                         String namefirstPlayer, String namesecondPlayer, JFrame frame) {
        // player - какой игрок сейчас ходит
        // enemy - противник игрока

        boolean playerHod = false;

        if (hp[player] > 0 && hp[enemy] > 0) {


            if (hod_vost[player] != 0) hod_vost[player] --;
            if (hod_player[player] != 0) hod_player[player] --;

            if (classPlayer == 0) {
                if (card == 1) {
                    uron[player] = 5;
                    hp[player] += bonus_hp[player];
                    mana[player] += bonus_mana[player];
                    if (hod_player[player] != 0) uron[player] += bonus_uron[player];

                    mana[player] += 10;
                    hp[enemy] -= uron[player];
                    playerHod = true;
                }
                else if (card == 2) {
                    hp[player] += bonus_hp[player];
                    mana[player] += bonus_mana[player];
                    if (hod_player[player] != 0) uron[player] += bonus_uron[player];

                    mana[player] += 10; mana[enemy] -= 10;
                    hp[player] += 10; hp[enemy] -= 10;
                    playerHod = true;
                }
                else if (card == 3){
                    if (mana[player] >= 70){
                        uron[player] = 40;
                        hp[player] += bonus_hp[player];
                        mana[player] += bonus_mana[player];
                        if (hod_player[player] != 0) uron[player] += bonus_uron[player];

                        hp[enemy] -= uron[player];
                        mana[player] -= 70;
                        playerHod = true;
                    }
                }
                else if (card == 4){
                    if (mana[player] >=20){
                        uron[player] = 10;
                        bonus_uron[player] = 5;
                        hp[player] += bonus_hp[player];
                        mana[player] += bonus_mana[player];
                        if (hod_player[player] != 0) uron[player] += bonus_uron[player];

                        hp[enemy] -= 10;
                        hod_player[player] = 3;
                        mana[player] -= 20;
                        System.out.print(hod_player[player] + "     " + hod_player[enemy]);
                        playerHod = true;
                    }
                }
                else if (card == 5){
                    if (mana[player] >= 100){
                        uron[player] = 50;
                        hp[player] += bonus_hp[player];
                        mana[player] += bonus_mana[player];
                        if (hod_player[player] != 0) uron[player] += bonus_uron[player];

                        hp[enemy] -= uron[player];
                        mana[player] -= 100;
                        playerHod = true;
                    }
                }
                else if (card == 6){
                    //card number six
                    playerHod = true;
                }
                else if (card == 7){
                    if (mana[player] >= 10){
                        bonus_uron[player] = 10;
                        hp[player] += bonus_hp[player];
                        mana[player] += bonus_mana[player];
                        hod_player[player] += 3;
                        if (hod_player[player] != 0) uron[player] += bonus_uron[player];

                        mana[player] -= 10;
                        playerHod = true;
                    }
                }
                else if (card == 8){
                    if (mana[player] >= 20){
                        hp[player] += 50;
                        hp[player] += bonus_hp[player];
                        mana[player] += bonus_mana[player];

                        mana[player] -= 20;
                        playerHod = true;
                    }
                }
                else if (card == 9){
                    //card number nine
                    playerHod = true;
                }
                else if(card == 10){
                    //card number ten
                }
                else if (card == 11){
                    mana[player] += 40;
                    hp[player] += 20;

                    mana[player] += bonus_mana[player];
                    hp[player] += bonus_hp[player];
                    playerHod = true;
                }
                else {
                    bonus_hp[player] = 10;
                    bonus_mana[player] = 10;
                    hod_vost[player] = 3;
                    playerHod = true;
                }
            }
            else if (classPlayer == 1) {
                //
            }
            else {
                //
            }
            if (playerHod){
                roundLabel.setText(String.valueOf(round));
                hpLabel.setText("Здоровье: " + String.valueOf(hp[player]));
                hpLabel1.setText("Здоровье: " + String.valueOf(hp[enemy]));
                manaLabel.setText("Мана: " + String.valueOf(mana[player]));
                manaLabel1.setText("Мана: " + String.valueOf(mana[enemy]));

                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                classlabel.setEnabled(false);
            }
        }
        else {
            Winner winner = new Winner();
            if (hp[0] > hp[1]) winner.WinnerPlayer(namefirstPlayer);
            else winner.WinnerPlayer(namesecondPlayer);
            frame.dispose();
        }
        return playerHod;
    }
}