
// //-12, 11, -13, -5, 6, -7, 5, -3, -6//
import java.util.Scanner;

// class RearrangePosistiveNegative{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
        
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }

//         arr = rearrange(arr);

//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
        



//     }

//     public static int[] rearrange(int array[]){
//         int n=array.length;
//         int resultArray[] = new int[n];
//         int resultpositive [] = new int[n];
//         int j=0,i=0;

//         int k=0;
//         for(i=0;i<n;i++){
            
//             if(array[i] < 0){
//                 resultArray[j] = array[i];
//                 j++;
//             }
//             else{
//                 resultpositive[k] = array[i];
//                 k++;
//             }

//         }

//         for(k=0 ;j<n;j++,k++){
            
//             resultArray[j] = resultpositive[k];
//         }

//         return resultArray;


//     }

// }

// W/o using other structures

class RearrangePosistiveNegative{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        arr = rearrange(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    
    }

    public static int[] rearrange(int arr[]){
        int n=arr.length;
        int temp=0;

        int i=0,j=0;
        for(;i<n;i++){
            if(arr[i] >= 0){
                for(j=i;j<n;j++){
                    if(arr[j] < 0){
                        temp = arr[j];
                        while(j != i){
                            arr[j] = arr[j-1];
                            j--; 
                        }
                        arr[i] = temp;
                        break;                       
                    }
                    // System.out.print("i"+i +" j"+j );
                }
                // System.out.println();

                 
               
            }
        }
        return arr;
    }
}