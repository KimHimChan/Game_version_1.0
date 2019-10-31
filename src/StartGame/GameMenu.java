package StartGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMenu extends JFrame{

    public GameMenu() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1400,750);
        frame.setLocation(50,50);
        frame.setResizable(false);

        frame.setLayout(new FlowLayout());
        frame.setTitle("Game of Power");

        ImageIcon icon = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\die.jpg");
        frame.setIconImage(icon.getImage());
        JLabel label = new JLabel(icon);
        frame.getContentPane().add(label);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JButton button0 = new JButton("Новая игра");
        button0.setLocation(1200,150);
        //button0.setIcon(new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\btn1.jpg"));
        label.add(button0).setSize(150,40);
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                ClassPersonage classPersonage = new ClassPersonage();
            }
        });

        JButton button1 = new JButton("Правила игры");
        button1.setLocation(1200,200);
        label.add(button1).setSize(150,40);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                MenuRule menuRule = new MenuRule(frame);
            }
        });

        JButton button2 = new JButton("Просмотр карт");
        button2.setLocation(1200,250);
        label.add(button2).setSize(150,40);

        JButton button3 = new JButton("Выход");
        button3.setLocation(1200,400);
        label.add(button3).setSize(150,40);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main (String[] args){
        GameMenu gameMenu = new GameMenu();
    }
}