public class shape {
    float pi=3.14f;
    int side;
    int lenght;
    int breadth;
    int radius;
    void calsquare(int side){
        this.side=side;
        System.out.println("The area of the sqaure is:"+(side*side));
    }
    void calRec(int length,int breadth){
        this.lenght=length;
        this.breadth=breadth;
        System.out.println("The area of the rectangle is:"+(length*breadth));
    }
    void caltri(int length,int breadth){
        this.lenght=length;
        this.breadth=breadth;
        System.out.println("The area of the triangle is:"+((length*breadth)/2));
    }
    void calCircle(int radius){
        this.radius=radius;
        System.out.println("The area of the circle is :"+(pi*radius*radius));
    }
    public static void main(String[] args) {
        int side=Integer.parseInt(args[0]);
        int lenght=Integer.parseInt(args[1]);
        int breadth=Integer.parseInt(args[2]);
        int radius=Integer.parseInt(args[3]);
        shape s=new shape();
        s.calsquare(side);
        s.calRec(lenght, breadth);
        s.caltri(lenght, breadth);
        s.calCircle(radius);
    }
}
