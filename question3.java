
public class question3 {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 100,50,100,0,-1,9,9};  
        System.out.println("Duplicate elements in given array: ");  
        
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  

	}

}
