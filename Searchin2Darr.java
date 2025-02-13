public class Searchin2Darr {
    public static void main(String[] args) {
        int matrix[][]={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60},
        };
       int row=matrix.length,col=matrix[0].length;
       int r=0,c=col-1,k=16;
       boolean isfound=false;
       while(r<row&&col>=0){
        if(matrix[r][c]==k){
            isfound=true;
            break;
        }else if(matrix[r][c]>k){
            c--;
        }else{
            r++;
        }
       }
        System.out.println("Target found: "+isfound);
    }
}
