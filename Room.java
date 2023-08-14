public class Room {
    int length;
    int breadth;
    Room(int lenght,int breadth){
        this.length=lenght;
        this.breadth=breadth;
    }
    Room(int lenght){
        this.length=this.breadth=lenght;
    }
    int area(){
        return length*breadth;
    }
    public static void main(String[] args) {
        int length1=Integer.parseInt(args[0]);
        int breadth1=Integer.parseInt(args[1]);
        Room r1=new Room(length1, breadth1);
        System.out.println(r1.area());
        int length2=Integer.parseInt(args[2]);
        int breadth2=Integer.parseInt(args[3]);
        Room r2=new Room(length2, breadth2);
        System.out.println(r2.area());
        
    }
}
