
/* Singleton class supports single object only
*/

public class CreateSingleton {
    public static void main(String args[]) {
    	Hello object = Hello.return_obj();
    }
}

class Hello{
    static Hello obj= new Hello();
    private Hello(){

    }
    public static Hello return_obj(){
        return obj;
    }
}
