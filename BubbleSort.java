public class BubbleSort
{
	public static void main(String args[])
	{	
		int arr[]={33,55,11,77,99,66,44,22,88};         //i=row;j=col
		
		for(int i= 0; i<arr.length-1;i++)
		{
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array :");
		for(int x: arr)
		{System.out.println(x);
		}
	}
}