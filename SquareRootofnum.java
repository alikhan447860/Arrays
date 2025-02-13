public class SquareRootofnum {
    public static void main(String[] args) {
        int n=36;
int start=0,end=n,ans=0;
while(start<=end){
    int mid=(start+end)/2;
    if(mid*mid==n){
        ans=mid;
        break;
    }else if(mid*mid<n){
        ans=mid;
        start=mid+1;
    }else{
        end=mid-1;
    }
}        
        System.out.println("Square root of "+n+" is :"+ans);
    }
}
