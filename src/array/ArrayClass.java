package array;

public class ArrayClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here we are declaring an array of type integer of length ten
		int[]myArray= new int[]{1,2,3,4,5,6,7,8,9,10};
		
		 for(int i=0;i<myArray.length;i++){
			 
		 /*Here we are using modulus operator to check  the number is even or odd
		  * if the number when divided by 2 gives reminder zero it is even number otherwise it is odd
		  */
			 
		  if(myArray[i]%2==0)
				System.out.println(myArray[i]+" is even number");
		  else
			  System.out.println(myArray[i]+"is odd number");
		 }
	}

}
