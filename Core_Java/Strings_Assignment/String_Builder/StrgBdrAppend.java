package string_Builder;

public class StrgBdrAppend {
	
    public static void main(String[] args) {
    	
        StringBuilder builder = new StringBuilder("StringBuilder");
        builder.append(" is a peer class of String");
        builder.append(" that provide much of");
        builder.append(" the functionality of strings");
        System.out.println(builder);
        
    }
    
}


/* After execution the output is like this...
 * 
StringBuilder is a peer class of String that provide much of the functionality of strings
 * 
 */