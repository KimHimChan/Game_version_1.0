package StartGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassPersonage extends JFrame {

    private boolean flag_transition = false;
    private int array[] = new int[2];
    private String[] array_char = new String[2];

    public ClassPersonage() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1400, 750);
        frame.setLocation(50, 50);
        frame.setResizable(false);

        frame.setLayout(new FlowLayout());
        ImageIcon icon = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\die.jpg");
        frame.setIconImage(icon.getImage());
        JLabel labelDie = new JLabel(icon);
        frame.getContentPane().add(labelDie);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());
        frame.setTitle("Game of Power");

        ImageIcon iconLabel = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\pers_txt.jpg");
        JLabel label = new JLabel(iconLabel);
        label.setLocation(300,10);
        labelDie.add(label).setSize(850,70);

        ImageIcon iconLabel1 = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\dd.jpg");
        JLabel label1 = new JLabel(iconLabel1);
        label1.setLocation(300,100);
        labelDie.add(label1).setSize(250,400);

        ImageIcon iconLabel2 = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\magician.jpg");
        JLabel label2 = new JLabel(iconLabel2);
        label2.setLocation(600,100);
        labelDie.add(label2).setSize(250,400);

        ImageIcon iconLabel3 = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\tank.jpg");
        JLabel label3 = new JLabel(iconLabel3);
        label3.setLocation(900,100);
        labelDie.add(label3).setSize(250,400);

        JButton button1 = new JButton();
        button1.setLocation(300,510);
        button1.setIcon(new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\dd_txt.jpg"));
        labelDie.add(button1).setSize(240,70);

        JButton button2 = new JButton();
        button2.setLocation(600,510);
        button2.setIcon(new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\magical_txt.jpg"));
        labelDie.add(button2).setSize(240,70);

        JButton button3 = new JButton();
        button3.setLocation(900,510);
        button3.setIcon(new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\tank_txt.jpg"));
        labelDie.add(button3).setSize(240,70);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!flag_transition) array[0] = 0;
                else array[1] = 0;
                button1.setEnabled(false);
                button2.setEnabled(true);
                button3.setEnabled(true);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!flag_transition) array[0] = 1;
                else array[1] = 1;
                button1.setEnabled(true);
                button2.setEnabled(false);
                button3.setEnabled(true);
            }

        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!flag_transition) array[0] = 2;
                else array[1] = 2;
                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(false);
            }
        });

        JLabel nameLabel = new JLabel("Введите имя персонажа:");
        nameLabel.setLocation(300,620);
        nameLabel.setFont(new Font("Serif", Font.BOLD,20));
        nameLabel.setForeground(Color.WHITE);
        labelDie.add(nameLabel).setSize(250,30);

        JTextField namePers = new JTextField();
        namePers.setLocation(550,620);
        labelDie.add(namePers).setSize(600,30);

        JButton buttonNext = new JButton("Далее");
        buttonNext.setLocation(1230,620);
        labelDie.add(buttonNext).setSize(150,30);
        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);

                flag_transition = true;
                if (namePers.getText().isEmpty()) array_char[0] = "FirstPlayer";
                else array_char[0] = namePers.getText();
                namePers.setText("");
                buttonNext.setText("Закончить выбор");
                buttonNext.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (namePers.getText().isEmpty()) array_char[1] = "SecondPlayer";
                        else array_char[1] = namePers.getText();
                        ChoiceCard choiceCard = new ChoiceCard();
                        choiceCard.ChoiceCard(array[0], array[1], array_char[0], array_char[1]);
                        frame.dispose();
                    }
                });
            }
        });

        JButton buttonCancel = new JButton("Отменить выбор");
        buttonCancel.setLocation(1230,660);
        labelDie.add(buttonCancel).setSize(150,30);
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
            }
        });
    }
}