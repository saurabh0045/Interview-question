import java.io.*;
import java.util.*;
class MergeUnsortArr 
{
	public static int[] MergeArr(int[] arrayA, int[] arrayB)
	{
		int[] MergedArray=new int[arrayA.length+arrayB.length];
		int i=0,j=0,k=0;
		while(i<arrayA.length)
		{
			MergedArray[k]=arrayA[i];
			i++;
			k++;
		}
		while(j<arrayB.length)
		{
			MergedArray[k]=arrayB[j];
			j++;
			k++;
		}
		Arrays.sort(MergedArray);
		return MergedArray;

	}
	public static void main(String[] args) 
	{
		int[] arrayA= new int[] {-3,-9,5,8};
		int[] arrayB= new int[] {-4,6,-8,0,5,4,9};
		int[] MergedArray= MergeArr(arrayA, arrayB);
		System.out.println("Array A:" +Arrays.toString(arrayA));
		System.out.println("Array B:" +Arrays.toString(arrayB));
		System.out.println("Merged Array:" +Arrays.toString(MergedArray));
	}
}
