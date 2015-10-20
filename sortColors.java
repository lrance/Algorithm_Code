/*Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.
*/

public class sortColors {

	public static void main(String[] args) {
		
		int[] ar = new int[]{2,1,2,1,2,0,1,2,2,1,0};
		getSortColors(ar);
		//System.out.println("this array is:" +getSortColors(ar));
	}

	
	 public static void getSortColors(int[] nums) {
	        
//	        Hashtable<Integer, Integer> htable = new Hashtable<Integer, Integer>();
		 	
		 	StringBuffer sb = new StringBuffer();
		 	StringBuffer sb1 = new StringBuffer();
		 	StringBuffer sb2 = new StringBuffer();
		 	/*
			int[] arr = new int[length];
	        int[] arr1 = new int[length];
	        int[] arr2 = new int [length];
	        int[] arr3 = new int[length];
	        */
	        int a = 0;
            int b = 0; 
            int c = 0;
	        
	        for(int abs : nums){
	            
	            System.out.println("abs: " +abs);
//	            if(htable.containsKey(0)){
	            if(abs == 0){
	                System.out.println("arr1 is :"+sb.append(abs));	                
	            }
//	            if(htable.containsKey(1)){
	            else if(abs == 1){
	                System.out.println("arr2 is :" +sb1.append(abs));
	            }
	            
//	            if(htable.containsKey(2)){
	            else if(abs == 2){
	                System.out.println("arr3 is : "+sb2.append(abs));  
	            }
	            
	        }
	        
	        	System.out.println("new list is: "+sb.append(sb1).append(sb2));
	        }
	   }

