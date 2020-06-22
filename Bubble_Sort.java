class BubbleSort {

    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length-1; i++) { 
            for (int j = 0; j < arr.length-1-i; j++) {

                //since after one iteration one element will be reaching at the end of the array in sorted way
                // fo that in the j loop we are doing arr.length-i-1 
                
                if (arr[j]>arr[j+1]) {

                    System.out.println("inside swap");

                    //swap arr[j] with arr[j+1]

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
            
        }
    }

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8};
        bubbleSort(arr);

        for (int i : arr) {
            System.err.print(i+"  ");
            
        }
    }

}