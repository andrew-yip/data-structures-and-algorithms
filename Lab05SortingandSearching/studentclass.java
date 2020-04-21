package HW05SortingandSearching;
import java.util.*;

public class Student { // blueprint of student
	
	private String name;
	private String major;
	
	public Student (String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	public String toString () { // over riding to string method
		return name + ": " + major;
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
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * @return the arr
	 */


}
