public class MyTool {

    public static void main(String[] args){
        int[] arr = {4,2,36,1,8,5,7};
        quickSort(arr);
        print(arr);
    }

    public static void quickSort(int[] arr){
        sortFunc(arr,0,arr.length-1);
    }

    private static void sortFunc(int[] arr, int low, int high){
        if(low<high){
            int i = low;
            int j = high;
            int x = arr[i];
            if (i<j){
                while(i<j && arr[j]>x){
                    j--;
                }
                if(i<j){
                    swap(arr,i,j);
                    i++;
                }
                while(i<j && arr[i]<x){
                    i++;
                }
                if(i<j){
                    swap(arr,i,j);
                    j--;
                }
            }
            sortFunc(arr,low,i-1);
            sortFunc(arr,i+1,high);
        }
    }

    private static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static void print(int[] arr){
        for(int x:arr){
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
    }

}
