import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class AutoRunnerGameSwing extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 600;
    private static final int PLAYER_SIZE = 30;
    private static final int OBSTACLE_SIZE = 20;
    private static final int POINTS_PER_SECOND = 1;
    private static final int POINTS_PER_COLLISION = 20;

    private int score = 0;

    private List<Obstacle> obstacles = new ArrayList<>();
    private Player player;

    public AutoRunnerGameSwing() {
        setTitle("Auto Runner Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        player = new Player(WIDTH / 2 - PLAYER_SIZE / 2, HEIGHT - PLAYER_SIZE - 10, PLAYER_SIZE, PLAYER_SIZE);

        JPanel gamePanel = new GamePanel();
        gamePanel.setFocusable(true);

        gamePanel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    player.moveLeft();
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    player.moveRight();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        add(gamePanel);

        // Start the game loop
        Timer gameTimer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
                repaint();
            }
        });

        gameTimer.start();

        // Start the points thread
        Timer pointsTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateScore(POINTS_PER_SECOND);
            }
        });

        pointsTimer.start();
    }

    private void update() {
        player.update();

        // Update obstacles
        for (Obstacle obstacle : new ArrayList<>(obstacles)) {
            obstacle.update();
            if (obstacle.isOutOfScreen()) {
                obstacles.remove(obstacle);
                updateScore(-POINTS_PER_COLLISION);
            }
        }

        // Generate new obstacles randomly
        if (Math.random() < 0.02) {
            obstacles.add(new Obstacle(Math.random() * (WIDTH - OBSTACLE_SIZE), 0, OBSTACLE_SIZE, OBSTACLE_SIZE));
        }

        // Check for collisions
        for (Obstacle obstacle : obstacles) {
            if (player.intersects(obstacle)) {
                obstacles.remove(obstacle);
                updateScore(-POINTS_PER_COLLISION);
            }
        }
    }

    private void updateScore(int points) {
        score += points;
        if (score <= 0) {
            // Game over
            System.out.println("Game Over! Your final score: " + score);
            System.exit(0);
        }
    }

    private class GamePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            // Draw player
            player.render(g2d);

            // Draw obstacles
            for (Obstacle obstacle : obstacles) {
                obstacle.render(g2d);
            }

            // Draw score
            g2d.setColor(Color.BLACK);
            g2d.drawString("Score: " + score, 10, 20);
        }
    }

    private class Player {
        private double x, y, width, height;
        private double speed = 5;

        public Player(double x, double y, double width, double height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public void moveLeft() {
            x -= speed;
            if (x < 0) {
                x = 0;
            }
        }

        public void moveRight() {
            x += speed;
            if (x + width > WIDTH) {
                x = WIDTH - width;
            }
        }

        public void update() {
            // Player logic can be added here
        }

        public void render(Graphics2D g2d) {
            g2d.setColor(Color.BLUE);
            g2d.fillRect((int) x, (int) y, (int) width, (int) height);
        }

        public boolean intersects(Obstacle obstacle) {
            return x < obstacle.x + obstacle.width &&
                    x + width > obstacle.x &&
                    y < obstacle.y + obstacle.height &&
                    y + height > obstacle.y;
        }
    }

    private class Obstacle {
        private double x, y, width, height;
        private double speed = 2;

        public Obstacle(double x, double y, double width, double height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public void update() {
            y += speed;
        }

        public void render(Graphics2D g2d) {
            g2d.setColor(Color.RED);
            g2d.fillRect((int) x, (int) y, (int) width, (int) height);
        }

        public boolean isOutOfScreen() {
            return y > HEIGHT;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AutoRunnerGameSwing().setVisible(true));
    }
}
