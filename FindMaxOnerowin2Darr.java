public class FindMaxOnerowin2Darr{
    public static void main(String[] args) {
        int arr[][]={{0,1,1,1},
                     {1,1,1,1},
                     {0,0,0,1},
                     {1,1,0,0}    
    };
int rowIndex=-1;
int maxones=0;
for(int i=0;i<arr.length;i++){
    int count=0;
    for(int j=0;j<arr[i].length;j++){
        if(arr[i][j]==1){
            count++;
        }
        if(count>maxones){
            maxones=count;
            rowIndex=i;
        }
    }
   
}
System.out.println("Row with maximum 1's is "+rowIndex);
}
    }
