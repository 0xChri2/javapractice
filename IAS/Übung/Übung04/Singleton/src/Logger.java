import java.util.logging.FileHandler;
import java.io.IOException;
import java.util.logging.Logger;

public class Logger {
    private static Logger instance;

    // Privater Konstruktor
    private Logger() {
        try {
            instance = Logger.getLogger("MyLog"); // Aufruf der statischen getLogger-Methode
            FileHandler fh = new FileHandler("logFile.log");
            instance.addHandler(fh);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
