
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MainFrame extends JFrame {

    Dimension tamanhoTela = new Dimension(1000, 1000);

    Image dbImage, background;
    Graphics dbGraphics;

    static ArrayList<Particula> listparticula = new ArrayList<>();
    static int numParticulas;

    public MainFrame() {
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        setTitle("Partículas Livres | feito por: Rafael Cancian e Lucas Heinen");
        setSize(tamanhoTela);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        dbImage = createImage(getWidth(), getHeight());
        dbGraphics = dbImage.getGraphics();
        draw(dbGraphics);
        g.drawImage(dbImage, 0, 0, null);
    }

    public void draw(Graphics g) {
        for (int i = 0; i < numParticulas; i++) {
            Particula p = listparticula.get(i);
            p.draw(g);
        }
        repaint();
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        numParticulas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas particulas você deseja simular? (Minímo: 3 | Máximo: 15)", "Mensagem de confirmação", JOptionPane.QUESTION_MESSAGE));

        if ((numParticulas < 3) || (numParticulas > 15)) {
            System.exit(0);
        }

        new MainFrame().setVisible(true);

        for (int i = 0; i < numParticulas; i++) {
            Random r = new Random();
            int randomX = r.nextInt(1000);
            int randomY = r.nextInt(1000);
            Particula particula = new Particula(randomX, randomY);
            listparticula.add(particula);
            particula.start();
        }

        new Thread() {
            @Override
            public void run() {
                Random r = new Random();
                while (true) {
                    for (int i = 0; i < numParticulas; i++) {
                        for (int j = 0; j < numParticulas; j++) {
                            if (j != i) {
                                if (listparticula.get(i).particula.intersects(listparticula.get(j).particula)) {
                                    listparticula.get(i).estado++;
                                    listparticula.get(j).estado++;

                                    int randomXDir = r.nextInt(2);

                                    if (randomXDir == 0) {
                                        randomXDir = -5;
                                    } else {
                                        randomXDir = 5;
                                    }

                                    int randomYDir = r.nextInt(2);
                                    if (randomYDir == 0) {
                                        randomYDir = -5;
                                    } else {
                                        randomYDir = 5;
                                    }

                                    listparticula.get(i).setDirecaoX(randomXDir);
                                    listparticula.get(i).setDirecaoY(randomYDir);
                                    //listparticula.get(j).setDirecaoX(randomXDir);
                                    //listparticula.get(j).setDirecaoY(randomYDir);
                                }
                            }
                        }
                    }
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
                        JOptionPane.showMessageDialog(null, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }.start();
    }
}
