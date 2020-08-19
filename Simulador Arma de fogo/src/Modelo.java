
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Modelo extends javax.swing.JFrame {

    Dimension tamanhoTela = new Dimension(500, 500);

    Image dbImage, background;
    Graphics dbGraphics;

    public Modelo() {
        initComponents();
        setSize(tamanhoTela);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        dbImage = createImage(getWidth(), getHeight());
        dbGraphics = dbImage.getGraphics();
        draw(dbGraphics);
        g.drawImage(dbImage, 0, 0, this);
    }

    public void draw(Graphics g) {
        background = Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/modelo.png"));
        g.drawImage(background, 0, 0, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Simulador - Modelo");
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 839, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
