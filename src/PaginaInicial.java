import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
public class PaginaInicial {
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Unhealh Zombie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        //Create the menu bar.  Make it have a green background.
        JMenuBar greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setBackground(new Color(154, 165, 127));
        greenMenuBar.setPreferredSize(new Dimension(200, 20));

        //Create a yellow label to put in the content pane.
        JLabel yellowLabel = new JLabel();
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(248, 213, 131));
        yellowLabel.setPreferredSize(new Dimension(200, 180));

        //Imagem do zombie
        ImageIcon wPic = new ImageIcon("/home/beatriz/IdeaProjects/Begin/zombie1.jpg");
        Image sc = wPic.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon icon = new ImageIcon(sc);
        JLabel imagi = new JLabel(icon);

        ActionListener actionListener = new AnActionListener();


        //Bottao
        JButton button = new JButton("CLIQUE AQUI PARA SALVAR O ZOMBIE");
        button.setPreferredSize(new Dimension(50,50));
        button.addActionListener(actionListener);

        //Set the menu bar and add the label to the content pane.
        frame.setJMenuBar(greenMenuBar);
        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
        frame.getContentPane().add(imagi);
        frame.getContentPane().add(button, BorderLayout.PAGE_END);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                createAndShowGUI();
            }
        });
    }


}

