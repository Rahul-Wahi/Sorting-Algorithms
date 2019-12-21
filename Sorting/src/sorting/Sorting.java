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
	
	public void mergeSort(int[] arr, int l, int r)
	{
		if( l < r )
		{
			int m = (l+r)/2 ;
			
			mergeSort( arr, l , m ) ;
			mergeSort(arr , m+1 , r) ;
			
			merge(arr, l,m,r) ;
		}
		
	}
	
	public void merge( int[] arr , int l , int m , int r)
	{
		int n1 = m - l + 1 , n2 = r - m ;
		
		int[] L = new int[n1] ;
		int[] R =  new int[n2] ;
		
		for( int i = 0 ; i < n1 ; i++)
		{
			L[i] = arr[l+i] ;
		}
		
		for( int i = 0 ; i < n2 ; i++)
		{
			R[i] = arr[m+i] ;
		}
		
		int i =0 , j = 0 ;
		int k = l ;
		
		while( k <= r && i < n1 && j < n2)
		{
			if( L[i] <= R[j] )
			{
				arr[k] = L[i] ;
				i++ ;
			}
			else
			{
				arr[k] = R[j] ;
				j++ ;
			}
			
			k++;
		}
		
		while( i < n1 )
		{
			arr[k] = L[i] ;
			k++;
			i++;
		}
		
		while( j < n2 )
		{
			arr[k] = R[j] ;
			k++ ;
			j++ ;
		}
	}
}
