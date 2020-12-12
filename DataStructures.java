import java.util.Arrays;
public class DataStructures {	
	public static void toPower(int size, int power) {
		int[ ] powerArray = new int[size];
		for (int i = 0; i < size; i++) {
			powerArray[i] = (int) Math.pow(i,power);
		}
		System.out.println(Arrays.toString(powerArray));
	}
	public static void main(String[] args) {
		double[ ] exampleArray = {1,5,6,5,4,1};
        int sum = 0;
        for (int i = 0; i < exampleArray.length; i++) {
        	sum += exampleArray[i];
        }
        System.out.println("The sum of the array is "+sum);
        //Calling the toPower method three times with different arguments
        toPower(4,2);
        toPower(5,3);
        toPower(6,4);
	}
}
