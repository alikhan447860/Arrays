public class Searchin2Darr {
    public static void main(String[] args) {
        int matrix[][]={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60},
        };
        int row=matrix.length;
        int col=matrix[0].length;
        int r=0,c=col-1,target=16;
        boolean found=false;
        while (r<row&&col>=0) {
            if(matrix[r][c]==target){
                found=true;
                break;
            }else if(matrix[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        System.out.println("Target found: "+found);
    }
}
