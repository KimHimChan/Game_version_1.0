package StartGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Winner extends JFrame {
    public void WinnerPlayer(String Player){
        System.out.println(Player);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1400,750);
        frame.setLocation(50,50);
        frame.setResizable(true);

        frame.setTitle("Game of Power");
        frame.setLayout(new FlowLayout());

        ImageIcon icon = new ImageIcon("C:\\MyProgramm\\Java\\ProjectGame_intellij\\game_java\\src\\img\\die.jpg");
        frame.setIconImage(icon.getImage());
        JLabel label = new JLabel(icon);
        frame.getContentPane().add(label);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JLabel labelWinner = new JLabel();
        labelWinner.setText("Winner is " + Player);
        labelWinner.setFont(new Font("Serif", Font.BOLD, 40));
        labelWinner.setLocation(350, 250);
        labelWinner.setForeground(Color.WHITE);
        label.add(labelWinner).setSize(700,300);

        JButton button = new JButton("В главное меню");
        button.setLocation(1140, 650);
        label.add(button).setSize(150,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameMenu menu = new GameMenu();
                frame.dispose();
            }
        });
    }
}
