package business.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author peterjohnson - pmjohnson5
 * CIS175-Fall 2022
 * October 14, 2022
 */

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String phone;
	private String position;
	private int yearsEmployed;
	
	public Employee() {
		super();
	}
	
	public Employee (String name) {
		super();
		this.name = name;
	}
	
	public Employee (String name, String phone, String position) {
		super();
		this.name = name;
		this.phone = phone;
		this.position = position;
	}
	
	public Employee (String name, String phone, String position, int yearsEmployed) {
		super();
		this.name = name;
		this.phone = phone;
		this.position = position;
		this.yearsEmployed = yearsEmployed;
	}
	
	public Employee (int id, String name, String phone, String position) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.position = position;
	}
	
	public Employee (int id, String name, String phone, String position, int yearsEmployed) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.position = position;
		this.yearsEmployed = yearsEmployed;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	/**
	 * @return the yearsEmployed
	 */
	public int getYearsEmployed() {
		return yearsEmployed;
	}

	/**
	 * @param yearsEmployed the yearsEmployed to set
	 */
	public void setYearsEmployed(int yearsEmployed) {
		this.yearsEmployed = yearsEmployed;
	}

	@Override
	public String toString() {
		return "Employee [id = " + id + ", name= " + name + ", phone = " + phone + ", position = " + position + ", years_employed = " + yearsEmployed + "]";
	}
	
}





















