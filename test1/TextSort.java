class  TextSort
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

	public static void selectionSort(int[] array){
		int i,j,min;
		for(i =0; i<array.length-1; i++){
			min = i;
			for(j =i+1; j<array.length; j++){
				if( array[j] < array[min]){
					min = j;
				}
			}
			int tmp = array[min];
			array[min] = array[i];
			array[i] = tmp;
		}
	}

	public static void insertionSort(int[] array){
		int i ,j;
		for(i=1;i<array.length; i++){
			int tmp =array[i];
			for(j=i-1; j>=0 && tmp<array[j]; j--){
				array[j+1] = array[j];
			}
			array[j+1] = tmp;
		}
	}

	public static void shellSort(int[] array){
		int i ,j,increment;
		while(increment>1){
			increment = increment/3 + 1;
			for(i=increment;i<array.length; i++){
				int tmp = array[i];
				for(j=i-increment; j>0 && tmp<array[j]; j-=increment){
					ayyay[j-increment] = array[j];
				}
				array[j+increment] = tmp;
			}
			
		}
		
	}
