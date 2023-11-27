public class Triangule implements Figures {

    private int base;
    private int height;

    public Triangule(int b, int h){
        this.base = b;
        this.height = h;
    }

    public void setBase(int b) {
        this.base = b;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return (getBase() * getHeight() ) / 2.0;
    }

}
