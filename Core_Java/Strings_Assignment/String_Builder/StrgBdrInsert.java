package string_Builder;

public class StrgBdrInsert {
	
    public static void main(String[] args) {
    	
        StringBuilder str = new StringBuilder("It is used to at the specified index position");
        str.insert(14,"insert text ");
        System.out.println(str);
        
    }
}

/* After execution the output is like this...
 * 
It is used to insert text at the specified index position
 * 
 */