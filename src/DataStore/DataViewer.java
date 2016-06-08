/**
 * 
 */
package DataStore;

/**
 * @author Thilini
 *
 */
public class DataViewer extends RegDetails{

	public void view() {
		
		System.out.println("Name " + getName());
		System.out.println("DOB " + getDOB());
		System.out.println("Address "+ getAddress());

	}

}
