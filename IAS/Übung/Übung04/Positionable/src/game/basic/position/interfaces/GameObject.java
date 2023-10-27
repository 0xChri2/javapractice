package game.basic.position.interfaces;

public interface GameObject {
    boolean isLeftOf(GameObject other);
    boolean isRightOf(GameObject other);
    boolean isAbove(GameObject other);
    boolean isBelow(GameObject other);
    boolean touches(GameObject other);
}
