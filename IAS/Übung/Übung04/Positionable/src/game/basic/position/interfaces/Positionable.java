package game.basic.position.interfaces;
public interface Positionable {

    public int _x = 0;
    public int _y = 0;
    public int getX(); // Lese die x-Koordinate

    public int getY(); // Lese die y-Koordinate

    public void move(Positionable shift); // Verschiebe die Position um shift

    public void moveTo(Positionable pos); // Setze die Position auf pos

    public void scale(int factor); // Skaliere das Objekt (x- und y-Koordinate) um den Faktor factor

    public void scale(int factorX, int factorY); // Skaliere das Objekt (x- und y-Koordinate) um die jeweiligen Faktoren factorX bzw. factorY

    // Zusätzliche sinnvolle Methoden für Positionen
    public int distanceTo(Positionable other); // Berechne die Entfernung zu einem anderen Positionable-Objekt

    public double angleTo(Positionable other); // Berechne den Winkel
}