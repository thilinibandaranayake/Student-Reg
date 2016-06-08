/**
 * 
 */
package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import DataStore.DataViewer;

/**
 * @author Thilini
 *
 */
public class Readme extends DataViewer {

	
	public void readText(String id) {
		
		BufferedReader br = null;
		
		try {
			String sCurerntLine;
			
			br = new BufferedReader(new FileReader(".//textfield.txt"));
			
			while ((sCurerntLine = br.readLine() )!= null) {
				String [] data=sCurerntLine.split(" ");
				if(data[0].equals(id)){
					setName(data[1]);
					setDOB(data[2]);
					setAddress(data[3]);
				}
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (br != null)
				br.close();
				
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
view();
	}

}

