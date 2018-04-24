package yat;
import java.util.Scanner;
public class Cattest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		Cat[] catlist =new Cat[3];
		
		 for (int i=0; i<catlist.length; i++)
	            
	        {
	            
				System.out.println("What is the breed of your cat number at index "+i+"?");
	            String breed=scan.nextLine();
	            
	            System.out.println("What is the name of your cat number at index "+i+"?");
	            String name=scan.nextLine();
	            
	            catlist [i] = new Cat(name, breed);
	            
	            

	        }
		 
		 
		 System.out.println(catlist[1].Name + catlist[1].Breed);
		 
	    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	}


