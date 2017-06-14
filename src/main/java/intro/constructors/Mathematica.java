package intro.constructors;

public class Mathematica {

    public Mathematica(Num obj){
        System.out.println("Num");
    }
    public Mathematica(Int obj){
        System.out.println("Int");
    }
    public Mathematica(Num obj1, Int obj2){
        System.out.println("Num, Int");
    }
    public Mathematica(Int obj1, Int obj2) {
        System.out.println("Int, Int");
    }

    public static void main(String[] args) {
        Num o1 = new Num();
        Int o2 = new Int();
        LongInt o3 = new LongInt();
        Num o4 = new Int();

        Mathematica m1 = new Mathematica(o1); // Num
        Mathematica m2 = new Mathematica(o2); // Int
        Mathematica m3 = new Mathematica(o3); // Int
        Mathematica m4 = new Mathematica(o4); // Num
        Mathematica m5 = new Mathematica(o1, o2); // Num, Int
        Mathematica m6 = new Mathematica(o3, o2); // Int, Int
//        Mathematica m7 = new Mathematica(o1, o4);//error
//        Mathematica m8 = new Mathematica(o3, o4);//error

    }
}
