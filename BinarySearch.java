import java.util.*;

public class BinarySearch
{	
	public static void main(String args[])
	{
		int arr[] = {11,22,33,44,55,66,77,88,99};
		
		System.out.print("Enter number to search :");
		int search = new Scanner(System.in).nextInt();

		int index = -1;

		int low = 0;
		int high = arr.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;

			if(search<arr[mid])
			{
				high=mid-1;
			}
			else if(search>arr[mid])
			{
				low=mid=+1;
			}
			else
			{	index=mid;
				break;
			}
		}
		if(index == -1)
			System.out.println("Not available");
		else
			System.out.println("Found at index :"+index);
	}
}