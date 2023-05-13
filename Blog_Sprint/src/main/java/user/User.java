package user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    private String email;

    // standard constructors / setters / getters / toString
    
    public User() {
		// TODO Auto-generated constructor stub
	}
    
    public User(Integer id, @NotBlank(message = "Name is mandatory") String name,
			@NotBlank(message = "Email is mandatory") String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	    
    public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return " Id: " + this.id + " Name: "+this.name;
    }
}
