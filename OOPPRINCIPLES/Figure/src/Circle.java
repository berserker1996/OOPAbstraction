public class Circle implements Figures{
    private double radius;

    public Circle(int r){
        this.radius = r;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double area(){
        return (Math.PI * Math.sqrt(getRadius()));
    }
}
