import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongGame extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int PADDLE_WIDTH = 20;
    private static final int PADDLE_HEIGHT = 100;
    private static final int BALL_SIZE = 20;

    private int paddle1Y = HEIGHT / 2 - PADDLE_HEIGHT / 2;
    private int paddle2Y = HEIGHT / 2 - PADDLE_HEIGHT / 2;
    private int ballX = WIDTH / 2 - BALL_SIZE / 2;
    private int ballY = HEIGHT / 2 - BALL_SIZE / 2;
    private int ballSpeedX = 5;
    private int ballSpeedY = 5;

    public PongGame() {
        setTitle("Pong Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
                repaint();
            }
        });
        timer.start();

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                handleKeyPress(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        setFocusable(true);
        requestFocus();
    }

    private void update() {
        // Bewegung der Bälle und Kollisionserkennung
        ballX += ballSpeedX;
        ballY += ballSpeedY;

        // Kollision mit den Wänden
        if (ballY <= 0 || ballY + BALL_SIZE >= HEIGHT) {
            ballSpeedY = -ballSpeedY;
        }

        // Kollision mit den Schlägern
        if (ballX <= PADDLE_WIDTH && ballY + BALL_SIZE >= paddle1Y && ballY <= paddle1Y + PADDLE_HEIGHT) {
            ballSpeedX = -ballSpeedX;
        } else if (ballX + BALL_SIZE >= WIDTH - PADDLE_WIDTH && ballY + BALL_SIZE >= paddle2Y && ballY <= paddle2Y + PADDLE_HEIGHT) {
            ballSpeedX = -ballSpeedX;
        }

        // Bewegung der Schläger
        if (paddle1Y >= 0 && paddle1Y + PADDLE_HEIGHT <= HEIGHT) {
            paddle1Y += 0; // Hier kannst du die Geschwindigkeit des linken Schlägers einstellen
        }
        if (paddle2Y >= 0 && paddle2Y + PADDLE_HEIGHT <= HEIGHT) {
            paddle2Y += 0; // Hier kannst du die Geschwindigkeit des rechten Schlägers einstellen
        }
    }

    private void handleKeyPress(KeyEvent e) {
        // Steuerung der linken Schläger mit W und S
        if (e.getKeyCode() == KeyEvent.VK_W && paddle1Y > 0) {
            paddle1Y -= 10; // Hier kannst du die Geschwindigkeit des linken Schlägers einstellen
        } else if (e.getKeyCode() == KeyEvent.VK_S && paddle1Y + PADDLE_HEIGHT < HEIGHT) {
            paddle1Y += 10; // Hier kannst du die Geschwindigkeit des linken Schlägers einstellen
        }

        // Steuerung der rechten Schläger mit den Pfeiltasten
        if (e.getKeyCode() == KeyEvent.VK_UP && paddle2Y > 0) {
            paddle2Y -= 10; // Hier kannst du die Geschwindigkeit des rechten Schlägers einstellen
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && paddle2Y + PADDLE_HEIGHT < HEIGHT) {
            paddle2Y += 10; // Hier kannst du die Geschwindigkeit des rechten Schlägers einstellen
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
    }

    private void draw(Graphics g) {
        // Hintergrund
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // Schläger
        g.setColor(Color.WHITE);
        g.fillRect(0, paddle1Y, PADDLE_WIDTH, PADDLE_HEIGHT);
        g.fillRect(WIDTH - PADDLE_WIDTH, paddle2Y, PADDLE_WIDTH, PADDLE_HEIGHT);

        // Ball
        g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PongGame().setVisible(true);
            }
        });
    }
}
