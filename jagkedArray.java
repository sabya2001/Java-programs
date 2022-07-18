public class jagkedArray {
    public static void main(String[] args) {
        int row = 5,count=1;
        int arr[][] = new int[row][];
        for(int i=0;i<arr.length;i++){
            arr[i] = new int[i+1];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = count+1;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
