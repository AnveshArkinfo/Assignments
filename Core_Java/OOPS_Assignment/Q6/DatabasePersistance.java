package Assign2_Q6;

public class DatabasePersistance extends Persistance{
	
    @Override
    public void persist()
    {
        System.out.println("Overiding in FIle persistence");
    }
}