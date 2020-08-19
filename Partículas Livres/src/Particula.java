
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JOptionPane;

public class Particula extends Thread {

    int x, y, direcaoX, direcaoY;

    Rectangle particula;

    int estado = 0;

    public Particula(int x, int y) {
        this.x = x;
        this.y = y;

        Random r = new Random();
        int randomXDir = r.nextInt(2);

        if (randomXDir == 0) {
            randomXDir = -1;
        } else {
            randomXDir = 1;
        }
        setDirecaoX(randomXDir);

        int randomYDir = r.nextInt(2);
        if (randomYDir == 0) {
            randomYDir = -1;
        } else {
            randomYDir = 1;
        }
        setDirecaoY(randomYDir);

        particula = new Rectangle(this.x, this.y, 25, 25);
    }

    public void setDirecaoX(int xDir) {
        direcaoX = xDir;
    }

    public void setDirecaoY(int yDir) {
        direcaoY = yDir;
    }

    public void draw(Graphics g) {
        if (estado > 0 && estado < 25) {
            g.setColor(Color.YELLOW);
            g.fillRect(particula.x, particula.y, particula.width, particula.height);
        } else if (estado > 25 && estado < 50) {
            g.setColor(Color.ORANGE);
            g.fillRect(particula.x, particula.y, particula.width, particula.height);
        } else if (estado > 50 && estado < 75) {
            g.setColor(Color.GREEN);
            g.fillRect(particula.x, particula.y, particula.width, particula.height);
        } else if (estado > 75 && estado < 100) {
            g.setColor(Color.RED);
            g.fillRect(particula.x, particula.y, particula.width, particula.height);
        } else if (estado > 100 && estado < 125) {
            g.setColor(Color.MAGENTA);
            g.fillRect(particula.x, particula.y, particula.width, particula.height);
        } else if (estado > 125 && estado < 150) {
            g.setColor(Color.PINK);
            g.fillRect(particula.x, particula.y, particula.width, particula.height);
        } else if (estado > 150) {
            g.setColor(Color.BLACK);
            g.fillRect(particula.x, particula.y, particula.width, particula.height);
        } else if (estado == 0) {
            g.setColor(Color.WHITE);
            g.fillRect(particula.x, particula.y, particula.width, particula.height);
        }
    }

    public void mover() {
        particula.x = particula.x + direcaoX;
        particula.y = particula.y + direcaoY;

        if (particula.x <= 1) {
            setDirecaoX(+1);
        }
        if (particula.x >= 975) {
            setDirecaoX(-1);
        }

        if (particula.y <= 30) {
            setDirecaoY(+1);
        }
        if (particula.y >= 975) {
            setDirecaoY(-1);
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                mover();
                Thread.sleep(5);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
