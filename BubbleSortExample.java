Public class BubbleSortExample{
    static void bubbleSort(int[]arr){
        int n = arr.length;
        int temp = 0;
        for (int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main (String[]args){
        int arr[]={5,98,58,65,78,2,46};
        System.out.println("Array befaore sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");

        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Array after sort");
        
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]+""); 
        }
    }
}