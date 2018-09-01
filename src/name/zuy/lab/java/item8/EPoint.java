package name.zuy.lab.java.item8;

public class EPoint extends Point {

    public EPoint(float x, float y) {
        super(x, y);
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 17;
        result = 31 * result + Float.floatToIntBits(getX());
        result = 31 * result + Float.floatToIntBits(getY());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(!(obj instanceof EPoint))
            return false;
        EPoint pobj = (EPoint) obj;
        return pobj.getX() == this.getX() && pobj.getY() == this.getY();
    }
}
