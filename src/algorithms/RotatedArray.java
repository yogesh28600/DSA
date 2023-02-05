package algorithms;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        System.out.println(pivot(arr));
        System.out.println(search(arr,0));
    }

    static int search(int[]arr,int target) {
        int piv = pivot(arr);

        if (piv == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        int left = binarySearch(arr, target, 0, piv);
        if(left>=0){
            return left;
        }else{
            return binarySearch(arr, target, piv + 1, arr.length - 1);
        }

    }

    static int binarySearch(int[]arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target==arr[mid]){
                return mid;
            }
        }
        return -1;
    }
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<arr[start]){
                end=mid-1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }
}
