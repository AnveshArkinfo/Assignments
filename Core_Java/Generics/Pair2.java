import java.util.Date;

public class Pair2 {
    public static void main(String[] args) {
        Date objc=new Date();
        New<String, java.util.Date> object=new New<String,java.util.Date> ("1",objc);
        System.out.println("{"+object.getObj1()+"="+object.getObj2()+"}");
    }
}
class New<A,R>{
    private A obj1;
    private R obj2;

    public New(A obj1,R obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    public A getObj1() {
        return obj1;
    }
    public R getObj2() {
        return obj2;
    }

}