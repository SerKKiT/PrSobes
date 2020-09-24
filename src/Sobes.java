public class Sobes {
    public static int search(int arr[], int elemToFind){
        int leftInd=0;
        int rightInd=arr.length-1;
        while (leftInd<=rightInd){
            int mid=(leftInd+rightInd)/2;
            if (arr[mid]==elemToFind){
                return mid;
            }
        else if (arr[mid]<elemToFind){
                leftInd=mid+1;
            }
        else if (arr[mid]>elemToFind){
            rightInd=mid-1;
            }
        }
        return -1;
    }
}
