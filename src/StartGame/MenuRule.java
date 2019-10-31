package StartGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuRule extends JFrame{
    public MenuRule(JFrame frameOld) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1400, 750);
        frame.setLocation(50, 50);
        frame.setResizable(false);

        frame.setLayout(new FlowLayout());
        frame.setTitle("Game of Power");

        ImageIcon icon = new ImageIcon("\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\perchament.jpg");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().add(new JLabel(icon));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.setLayout(null);
        JButton button = new JButton("Назад");
        button.setLocation(1140, 650);
        frame.add(button).setSize(150, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                frameOld.setVisible(true);
            }
        });
    }
}