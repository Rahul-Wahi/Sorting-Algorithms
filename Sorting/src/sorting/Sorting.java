package sorting;

import java.util.Random;

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
			L[i] = arr[l+i ] ;
		}
		
		for( int i = 0 ; i < n2 ; i++)
		{
			R[i] = arr[m+ i + 1] ;
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
	
	public int getRandom(int low , int high )
	{
		Random rand = new Random();
		int rnd = rand.nextInt(high-low) + low ;
		return rnd ;
	}
	
	public void swap( int[] arr, int i , int j )
	{
		int tmp = arr[i] ;
		arr[i] = arr[j] ;
		arr[j] = tmp ;
	}
	
	public int partition(int[] arr, int low, int high)
	{
		int pivotIndex = getRandom(low, high) ;
		
		int pivot = arr[pivotIndex] ; 
		
		swap(arr , high , pivotIndex) ;
		int smallIndex = low ;
		
		for( int i =  low ; i < high ; i++)
		{
			if( arr[i] < pivot)
			{
				swap( arr , smallIndex , i ) ;
				smallIndex++;
			}
		}
		
		swap( arr , smallIndex , high ) ;
		
		return pivotIndex ;
		
	}
	public void quickSort(int[] arr , int low , int high )
	{
		if( low < high )
		{
			int pivotIndex = partition( arr, low , high ) ;
			
			quickSort( arr , low , pivotIndex -1 ) ; // Before pivotIndex
			quickSort( arr , pivotIndex + 1, high ) ; // After pivotIndex
		}
	}
}
