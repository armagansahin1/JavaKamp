package entities.concretes;
import entities.abstracts.Entity;
public class User implements Entity{
	public int id;
	public String firstName;
	public String lastName;
	public String email;
	public String password;
	public User(int id, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	
}
