package Strings;

public class StrgOperations {
	
    public static void main(String[] args) {
    	
        String str = new String("Java String pool refers to collection of Strings which are stored in heap memory");
        
        // a.Print the String to console in lowercase
        String str1 = str.toLowerCase();
        System.out.println(str1);
        
        // b.Print the String to console in Uppercase
        String str2 = str.toUpperCase();
        System.out.println(str2);
        
        // c.Replace all 'a' characters in the string with $ sign
        String str3 = str.replace('a','$');
        System.out.println(str3);
        
        // d.check if original Strings contains the word "collection"
        if (str.contains("collection"))
        {
            System.out.println("The original Strings contains the word 'collection'");
        }
        
        // e.check if the following string Java String pool refers to collection of Strings which are stored in heap memory
        String str4 = new String("Java String pool refers to collection of Strings which are stored in heap memory");
        if (str == str4)
        {
            System.out.println("str equals to str4");
        }
        else
        {
            System.out.println("Str not equals to str4");
        }
        if (str.equals(str4))
        {
            System.out.println("str equals to str4");
        }
        else
        {
            System.out.println("Str not equals to str4");
        }
        
    }
}

/*
* After Execution the output Should be like this
* 
java string pool refers to collection of strings which are stored in heap memory
JAVA STRING POOL REFERS TO COLLECTION OF STRINGS WHICH ARE STORED IN HEAP MEMORY
J$v$ String pool refers to collection of Strings which $re stored in he$p memory
The original Strings contains the word 'collection'
Str not equals to str4
str equals to str4

*/
