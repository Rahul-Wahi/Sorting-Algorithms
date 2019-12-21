package sorting;

public class Sorting {

	public void bubbleSort( int[] arr)
	{
		int n = arr.length ;
		for( int i = 1 ; i < n ; i++)
	      {
	          for(int j = 1 ; j < n - i + 1 ; j++ )
	          {
	              if(arr[j] < arr[j-1])
	              {
	                  int tmp = arr[j] ;
	                  arr[j] = arr[j-1] ;
	                  arr[j-1] = tmp ;
	              }
	          }
	      }
	}
	
	//insertion sort
	public void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;

				} else {
					break;
				}
			}
		}
	}
	
	
	public void selectionSort(int[] arr)
	{
		int min_idx , n = arr.length ;
		for( int i = 0 ; i < n -1 ; i++ )
		{
			min_idx = i ;
			for( int j = i + 1 ; j < n ; j++  )
			{
				if( arr[j] < arr[min_idx] )
				{
					min_idx = j ;
				}
			}
			
			int tmp = arr[i] ;
			arr[i] = arr[min_idx] ;
			arr[min_idx] = tmp ;
		}
	}
}
