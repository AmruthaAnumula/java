public class Bubble
{  
    static void bubbleSort(int[] arr)
     {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(arr[j-1] > arr[j])
                          {  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    } 
    public static void main(String[] args) {  
        int arr[] ={15,2,8,1,6,5,7,4};  
         
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

}  
}
OUTPUT-
15 2 8 1 6 5 7 4 
Array After Bubble Sort
1 2 4 5 6 7 8 15