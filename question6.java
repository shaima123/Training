
public class question6 {

	public static void main(String[] args) {
		 int n = 98765, rev = 0;

		  
		    while(n != 0) {
		    
		      
		      int rem = n % 10;
		      rev = rev * 10 + rem;

		      n =n/10;
		    }

		    System.out.println("Reversed Number: " + rev);

	}

}
