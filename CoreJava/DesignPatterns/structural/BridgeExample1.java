package Design_pattern.structural;
import java.io.*;
//Base classes

class BaseEntiy{
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
	this.id = id;
	}
}
class Student1 extends BaseEntiy{
	private String name;
	public String getName() {
	return name; 
	}
	public void setName(String name) {
	this.name = name;
	}
}
//Implementation
interface StorageRepository{
    public void store(BaseEntiy entiy);
}

class FileRepository implements StorageRepository{
	public void store(BaseEntiy entiy){
	try {
	
		FileOutputStream fileOut = new FileOutputStream("filePath");
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		objectOut.writeObject(entiy);
		objectOut.close();
	
		} catch (IOException e) {
	
			e.printStackTrace();}
	}
}

class DataBaseRepository implements StorageRepository{
	public void store(BaseEntiy entiy){
	
	System.out.println("Save in Database");
	}

}

//Abstarction
interface BaseRepository{
    public Student1 save(Student1 entiy);
    public StorageRepository getRepository();
} 

class StudentRepository implements BaseRepository {

    private StorageRepository repository;
    public StudentRepository(StorageRepository repository){
        this.repository=repository;
    }
	public StorageRepository getRepository(){
		return repository;
	}

     public Student1 save(Student1 student) {

    	 if (student == null || student.getName() == null) {
	            return null;
	        }
	        student.setId(23L);
	        repository.store(student);
	        return student;
    }
	
}
public class BridgeExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// code to store in file 
	     StudentRepository fileRepositroy = new StudentRepository (new FileRepository());
	     fileRepositroy.save(new Student1() );
	 
	     // code to store in DataBase 
	     StudentRepository dbRepositroy = new StudentRepository(new DataBaseRepository());
	     dbRepositroy.save(new Student1() );

	}

}
