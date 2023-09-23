import java.util.*;
import java.io.*;
class Merge 
{
	public static int[] MergeArr(int[] arrayA, int[] arrayB)
	{
		int[] MergedArray= new int[arrayA.length+arrayB.length];
		int i=0,j=0,k=0;
		while (i<arrayA.length)
		{
			MergedArray[k]=arrayA[i];
			i++;
			k++;
		}
		while (j<arrayB.length)
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
		int[] arrayA=new int[] {-6,-5,8,9};
		int[] arrayB=new int[] {7,8,1,0,9};
		int[] MergedArray=MergeArr(arrayA, arrayB);
		System.out.println("Array A"+Arrays.toString(arrayA));
		System.out.println("Array B"+Arrays.toString(arrayB));
		System.out.println("Merged Array"+Arrays.toString(MergedArray));
	}
}
