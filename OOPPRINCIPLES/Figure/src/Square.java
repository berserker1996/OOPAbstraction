public class Square implements Figures {
    private int side1;
    private int side2;

    public Square(int s1, int s2){
        this.side1 = s1;
        this.side2 = s2;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2){
        this.side2 = side2;
    }

    public int getSide1(){
        return side1;
    }

    public int getSide2(){
        return side2;
    }


    @Override
    public double area(){
        return (getSide1() * getSide2());
    }

    public void output(){
        System.out.println("The area of your square is: " + area());
    }
}
