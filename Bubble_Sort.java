class BubbleSort {

    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length-1; i++) { 
            for (int j = 0; j < arr.length-1-i; j++) {

                //since after one iteration one element will be reaching at the end of the array in sorted way
                // fo that in the j loop we are doing arr.length-i-1 
                
                if (arr[j]>arr[j+1]) {
                  
                    swap(j, j+1, arr);

                    
                }
            }
            
        }
    }

    //to make our code more modular we have created a seprate function for the swap

    public static void swap(int i,int j,int arr[]) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        
        int arr[]={9,8,7,6,5,4,3,2,1};
        bubbleSort(arr);

        for (int i : arr) {
            System.err.print(i+"  ");
            
        }
    }

}