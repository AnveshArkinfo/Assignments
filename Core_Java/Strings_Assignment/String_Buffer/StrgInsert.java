package string_Buffer;

public class StrgInsert {
	
    public static void main(String[] args) {
    	
        StringBuffer str = new StringBuffer("It is used to at the specified index position");
        str.insert(14,"insert text ");
        System.out.println("");
        System.out.println(str);
   
    }
    
}

/* After Execution the output should be like this....
 * 
It is used to insert text at the specified index position
 *
 */