package string_Buffer;

public class StrgAppend {
	
    public static void main(String[] args) {
    	
        StringBuffer buffer = new StringBuffer("StringBuffer");
        buffer.append(" is a peer class of String");
        buffer.append(" that provide much of");
        buffer.append(" the functionality of strings");
        System.out.println("");
        System.out.println(buffer);
        
    }
    
}

/* After Execution the output should be like this....
 * 
StringBuffer is a peer class of String that provide much of the functionality of strings
 *
 */