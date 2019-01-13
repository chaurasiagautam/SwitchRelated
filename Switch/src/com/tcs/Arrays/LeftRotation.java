package com.tcs.Arrays;

public class LeftRotation {

	public static void main(String[] args) {

		LeftRotation lf = new LeftRotation();
		int[] arr = {3,4,6,7,2,8};
		lf.enhancedMethod(1, arr);
	}
	
	public void leftRotation(int numOfRot,int[] arr){
		
		int varAtIndex = 0;
		
		while(numOfRot>0){
			for(int i=0;i<arr.length;i++){
				if(i==0){
					varAtIndex = arr[i];
					System.out.println(varAtIndex);
					continue;
				}
				else if(i<arr.length-1) {
					System.out.println("i-1 "+arr[i-1]+" i"+arr[i]);
					arr[i-1] = arr[i];
					System.out.println(i);
					System.out.println("i-1 "+arr[i-1]+" i"+arr[i]);
				}
				else{
					arr[i-1] = arr[i];
					arr[i] = varAtIndex;
				}
			}
			numOfRot -= 1;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

	public void enhancedMethod(int d,int[] arr){
		 int n = arr.length;
	        
	        // Create new array for rotated elements:
	        int[] rotated = new int[n]; 
	        
	        // Copy segments of shifted elements to rotated array:
	        System.arraycopy(arr, d, rotated, 0, n - d);
	        System.arraycopy(arr, 0, rotated, n - d, d);
			for(int i=0;i<rotated.length;i++){
				System.out.print(rotated[i]+" ");
			}
	}
}
