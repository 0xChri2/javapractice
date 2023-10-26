public class Position implements Positionable{
    public int _x;
    public int _y;

    Position(int x, int y){
        _x = x;
        _y = y;
    }
    @Override
    public int getX(){
        return _x;
    }
    @Override
    public int getY(){
        return _y;
    }
    @Override
    public void move(Positionable shift){
        _y = _y + shift._y;
        _x = _x + shift._x;
    }

    @Override
    public void moveTo(Positionable pos) {
        _y = pos._y;
        _x = pos._x;
    }

    @Override
    public void scale(int factor) {

    }

    @Override
    public void scale(int factorX, int factorY) {

    }

    @Override
    public int distanceTo(Positionable other) {
        return 0;
    }

    @Override
    public double angleTo(Positionable other) {
        return 0;
    }
}
