package BoxClass;

class Box {
    double width, height, depth;
    
    void setDim(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    } 

    double getVolume() {
        return width * height * depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        double vol;

        vol = myBox1.getVolume();
        System.out.println("Box1 volume = " + vol);
        vol = myBox2.getVolume();
        System.out.println("Box2 volume = " + vol);
    }
}
