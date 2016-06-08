/**
 * 
 */
package Main;

import java.io.File;
import java.util.Scanner;

import FileReader.Readme;


public class Student {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      
	          System.out.println("Enter ID");
	          String ID =sc.next();
	          sc.close();
	          Readme readme=new Readme();
	          readme.readText(ID);
	      }
	}


