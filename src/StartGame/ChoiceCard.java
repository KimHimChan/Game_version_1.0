package StartGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceCard extends JFrame {

    private String way = "C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\";
    private String classPersFirst = "";
    private String classPersSecond = "";
    private int player = 0;
    private String Player = "";
    private int len = 5;
    private int arrayCardPlayer1[] = new int[5];
    private int arrayCardPlayer2[] = new int[5];

    public void ChoiceCard(int firstPlayer, int secondPlayer, String nameFirstPlayer, String nameSecongPlayer){
        System.out.println("ok");
        System.out.println(nameFirstPlayer);
        System.out.println(nameSecongPlayer);
        System.out.println(firstPlayer);
        System.out.println(secondPlayer);

        if (firstPlayer == 0) classPersFirst = "dd\\";
        else if (firstPlayer == 1) classPersFirst = "magician\\";
        else classPersFirst = "tank\\";

        if (secondPlayer == 0) classPersSecond = "dd\\";
        else if (secondPlayer == 1) classPersSecond = "magician\\";
        else classPersSecond = "tank\\";

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1400,750);
        frame.setLocation(50,50);
        frame.setResizable(false);

        frame.setLayout(new FlowLayout());
        ImageIcon icon = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\die.jpg");
        frame.setIconImage(icon.getImage());
        JLabel label = new JLabel(icon);
        frame.getContentPane().add(label);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.setTitle("Power Of Game");

        ImageIcon iconatk = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\card_tip_atk.jpg");
        JLabel labelTxt2 = new JLabel(iconatk);
        labelTxt2.setLocation(10,70);
        label.add(labelTxt2).setSize(250,70);

        ImageIcon iconisc = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\card_tip_isc.jpg");
        JLabel labelTxt3 = new JLabel(iconisc);
        labelTxt3.setLocation(10,235);
        label.add(labelTxt3).setSize(250,70);

        ImageIcon iconzasch = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\card_tip_zasch.jpg");
        JLabel labelTxt4 = new JLabel(iconzasch);
        labelTxt4.setLocation(10, 410);
        label.add(labelTxt4).setSize(250,70);

        ImageIcon iconvos = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\card_tip_vos.jpg");
        JLabel labelTxt5 = new JLabel(iconvos);
        labelTxt5.setLocation(10, 585);
        label.add(labelTxt5).setSize(250,70);

        JLabel scoreTXT = new JLabel("Осталось карт:");
        scoreTXT.setLocation(1230,500);
        scoreTXT.setFont(new Font("Serif", Font.BOLD, 20));
        scoreTXT.setForeground(Color.WHITE);
        label.add(scoreTXT).setSize(150,30);

        JLabel score = new JLabel(String.valueOf(len));
        score.setLocation(1290,510);
        score.setFont(new Font("Serif", Font.BOLD, 40));
        score.setForeground(Color.WHITE);
        label.add(score).setSize(100,100);


        JButton button1 = new JButton();
        button1.setLocation(280,20);
        button1.setIcon(new ImageIcon(way + classPersFirst + "attack\\1.jpg"));
        label.add(button1).setSize(120,165);

        JButton button2 = new JButton();
        button2.setLocation(405,20);
        button2.setIcon(new ImageIcon(way + classPersFirst + "attack\\2.jpg"));
        label.add(button2).setSize(120,165);

        JButton button3 = new JButton();
        button3.setLocation(530,20);
        button3.setIcon(new ImageIcon(way + classPersFirst + "attack\\3.jpg"));
        label.add(button3).setSize(120,165);

        JButton button4 = new JButton();
        button4.setLocation(655,20);
        button4.setIcon(new ImageIcon(way + classPersFirst + "attack\\4.jpg"));
        label.add(button4).setSize(120,165);

        JButton button5 = new JButton();
        button5.setLocation(780,20);
        button5.setIcon(new ImageIcon(way + classPersFirst + "attack\\5.jpg"));
        label.add(button5).setSize(120,165);

        JButton button6 = new JButton();
        button6.setLocation(905,20);
        button6.setIcon(new ImageIcon(way + classPersFirst + "attack\\6.jpg"));
        label.add(button6).setSize(120,165);

        JButton button7 = new JButton();
        button7.setLocation(1030,20);
        button7.setIcon(new ImageIcon(way + classPersFirst + "attack\\7.jpg"));
        label.add(button7).setSize(120,165);

        JButton button8 = new JButton();
        button8.setLocation(280,190);
        button8.setIcon(new ImageIcon(way + classPersFirst + "healing\\8.jpg"));
        label.add(button8).setSize(120,165);

        JButton button9 = new JButton();
        button9.setLocation(280,360);
        button9.setIcon(new ImageIcon(way + classPersFirst + "protection\\9.jpg"));
        label.add(button9).setSize(120,165);

        JButton button10 = new JButton();
        button10.setLocation(405,360);
        button10.setIcon(new ImageIcon(way + classPersFirst + "protection\\10.jpg"));
        label.add(button10).setSize(120,165);

        JButton button11 = new JButton();
        button11.setLocation(280,530);
        button11.setIcon(new ImageIcon(way + classPersFirst + "recovery\\11.jpg"));
        label.add(button11).setSize(120,165);

        JButton button12 = new JButton();
        button12.setLocation(405,530);
        button12.setIcon(new ImageIcon(way + classPersFirst + "recovery\\12.jpg"));
        label.add(button12).setSize(120,165);


        JButton buttonNext = new JButton("Далее");
        buttonNext.setLocation(1230, 620);
        label.add(buttonNext).setSize(150,30);
        buttonNext.setEnabled(false);

        JButton buttonCancel = new JButton("Отменить выбор");
        buttonCancel.setLocation(1230,660);
        label.add(buttonCancel).setSize(150,30);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayMassive(1, score, button1, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayMassive(2, score, button2, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayMassive(3, score, button3, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayMassive(4, score, button4, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayMassive(5, score, button5, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayMassive(6, score, button6, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayMassive(7, score, button7, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayMassive(8, score, button8, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayMassive(8, score, button9, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayMassive(10, score, button10, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayMassive(11, score, button11, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayMassive(12, score, button12, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonNext.setText("Закончить выбор");
                len = 5;
                player = 1;
                ButtonUnBlock(score, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
                buttonNext.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Game game = new Game();
                        game.NewGame(arrayCardPlayer1, arrayCardPlayer2, firstPlayer, secondPlayer, nameFirstPlayer, nameSecongPlayer);
                        frame.dispose();
                    }
                });
            }
        });
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ButtonCancel(player, score, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonNext);
            }
        });
    }

    private void ArrayMassive(int card, JLabel score, JButton button, JButton button1, JButton button2, JButton button3, JButton button4, JButton button5, JButton button6, JButton button7, JButton button8, JButton button9, JButton button10, JButton button11, JButton button12, JButton buttonNext){
        boolean end = false;
        if (player == 0){
            for (int i = 0; i < arrayCardPlayer1.length; i++){
                if (arrayCardPlayer1[i] == 0) {
                    arrayCardPlayer1[i] = card; end = true; button.setEnabled(false);
                    score.setText(String.valueOf(--len)); break;}
            }
        }
        else {
            for (int i = 0; i < arrayCardPlayer2.length; i++){
                if (arrayCardPlayer2[i] == 0) {
                    arrayCardPlayer2[i] = card; end = true; button.setEnabled(false);
                    score.setText(String.valueOf(--len)); break;}
            }
        }
        if (!end){
            score.setText(String.valueOf(0));
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            buttonNext.setEnabled(true);
        }
    }

    private void ButtonCancel(int player, JLabel score, JButton button1, JButton button2, JButton button3, JButton button4, JButton button5, JButton button6, JButton button7, JButton button8, JButton button9, JButton button10, JButton button11, JButton button12, JButton buttonNext){
        if (player == 0) {
            for (int i = 0; i < arrayCardPlayer1.length; i++){
                arrayCardPlayer1[i] = 0;
                len = 5;
            }
        }
        else {
            for (int i = 0; i < arrayCardPlayer2.length; i++){
                arrayCardPlayer2[i] = 0;
                len = 5;
            }
        }
        score.setText(String.valueOf(len));
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button10.setEnabled(true);
        button11.setEnabled(true);
        button12.setEnabled(true);
        buttonNext.setEnabled(false);
    }

    private void ButtonUnBlock(JLabel score, JButton button1, JButton button2, JButton button3, JButton button4, JButton button5, JButton button6, JButton button7, JButton button8, JButton button9, JButton button10, JButton button11, JButton button12, JButton buttonNext){
        score.setText(String.valueOf(5));
        button1.setEnabled(true);
        button1.setIcon(new ImageIcon(way + classPersSecond + "attack\\1.jpg"));
        button2.setEnabled(true);
        button2.setIcon(new ImageIcon(way + classPersSecond + "attack\\2.jpg"));
        button3.setEnabled(true);
        button3.setIcon(new ImageIcon(way + classPersSecond + "attack\\3.jpg"));
        button4.setEnabled(true);
        button4.setIcon(new ImageIcon(way + classPersSecond + "attack\\4.jpg"));
        button5.setEnabled(true);
        button5.setIcon(new ImageIcon(way + classPersSecond + "attack\\5.jpg"));
        button6.setEnabled(true);
        button6.setIcon(new ImageIcon(way + classPersSecond + "attack\\6.jpg"));
        button7.setEnabled(true);
        button7.setIcon(new ImageIcon(way + classPersSecond + "attack\\7.jpg"));
        button8.setEnabled(true);
        button8.setIcon(new ImageIcon(way + classPersSecond + "healing\\8.jpg"));
        button9.setEnabled(true);
        button9.setIcon(new ImageIcon(way + classPersSecond + "protection\\9.jpg"));
        button10.setEnabled(true);
        button10.setIcon(new ImageIcon(way + classPersSecond + "protection\\10.jpg"));
        button11.setEnabled(true);
        button11.setIcon(new ImageIcon(way + classPersSecond + "recovery\\11.jpg"));
        button12.setEnabled(true);
        button12.setIcon(new ImageIcon(way + classPersSecond + "recovery\\12.jpg"));
        buttonNext.setEnabled(false);
    }
}