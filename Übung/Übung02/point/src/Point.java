public class Point {
    public double _x;
    public double _y;
    public Point() {
        _x = 0;
        _y = 0;
    }
    public Point(int x, int y) {
        _x = x;
        _y = y;
    }

    public String toString(){
        return "( " + _x + " ) ( " + _y + " ) ";
    }

    public Point move(Point shift){
        this._x = shift._x + this._x;
        this._y = shift._y + this._y;
        return this;
    }
    public Point moveTo(Point newPos){
        this._x = newPos._x;
        this._y = newPos._y;
        return this;
    }
    public Point scale(double factor){
        _x = _x * factor;
        _y = _y * factor;
        return this;
    }
    public double distance(){
        return Math.sqrt(_x * _x + _y * _y);
    }
    public double distance(Point other){
        return Math.sqrt((_x - other._x) * (_x - other._x) + (_y - other._y) * (_y - other._y));
    }
    public boolean equals(Point other){
        if(_x == other._x &&  _y == other._y){
            return true;
        } else {
            return false;
        }
    }
}