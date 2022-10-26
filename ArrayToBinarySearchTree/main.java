package ArrayToBinarySearchTree;

public class main {
    public static void main(String[] args) {
        int [] arr = {-10,-5,-3,0,5,8,9};
        System.out.println(ArrayToTree(arr));

    }

    static Node2 ArrayToTree(int [] arr){
        if (arr.length == 0){
            return null;
        }
        return helper(arr, 0 , arr.length - 1);
    }
    static Node2 helper(int[] arr, int s, int e) {
        if(s>e){
            return null;
        }
        int mid = s + (e - s)/2;
        Node2 root = new Node2(arr[mid]);
        root.left = helper(arr,s,mid-1);
        root.right = helper(arr,mid + 1,e);

        return root;
    }
}
