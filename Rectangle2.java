public class Rectangle2 {
    int length;
    int breadth;
    public void getData(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int rectArea(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        int length1=Integer.parseInt(args[0]);
        int breadth1=Integer.parseInt(args[1]);
        int length2=Integer.parseInt(args[2]);
        int breadth2=Integer.parseInt(args[3]);
        Rectangle2 r1=new Rectangle2();
        r1.getData(length1, breadth1);
        System.out.println("The area of the 1st rectangle is :"+r1.rectArea(length1, breadth1));
        Rectangle2 r2=new Rectangle2();
        r2.getData(length2, breadth2);
        System.out.println("The area of the rectangle 2 is :"+r2.rectArea(length2, breadth2));
        
    }
}
