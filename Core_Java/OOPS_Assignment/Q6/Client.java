package Assign2_Q6;

public class Client{
	
    public static void main(String[] args) {
    	
        Persistance persistence = new Persistance() {
        	
            @Override
            public void persist() {
                System.out.println(" 1.The client created the object of Persistance which is abstract class. ");

                System.out.println(" 2.And then clients is doing following invocation of abstract method. ");

                System.out.println(" 3.The client is invoking the persist method without knowing that data is saved in file and database. ");
            }
        };
        persistence.persist();
    }
}

/* After Compilation the output should be like this
 * 
1.The client created the object of Persistence which is abstract class. 
2.And then clients is doing following invocation of abstract method. 
3.The client is invoking the persist method without knowing that data is saved in file and database. 
 * 
 */
