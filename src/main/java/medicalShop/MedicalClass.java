package medicalShop;

public class  MedicalClass {
	private String name;
	private String email;
	private String password;
	private String contact;
	private int id ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String toString() {
		return "medicaShop [id =" + id + ",name=" + name + ",email=" + email + ",password=" + password + ",contact=" + contact
				+ "]";
	}

		
	
}
