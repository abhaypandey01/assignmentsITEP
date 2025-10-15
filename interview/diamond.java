interface i1{
    default void m1(){
        System.out.println("m1");
    }
}

interface i2 {
    default void m1(){
        System.out.println("m2");
    }
}

// interface i3 extends i1, i2{
//     default void m1(){
//         System.out.println("m3");
//     }
// }

class M1 implements i1, i2{

}

class Test{
    public static void main(String args[]){
        M1 i = new M1();
        i.m1();
    }
}