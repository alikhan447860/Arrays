public class FindMajorityEleArr {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,1,1};
        int candidate=0,count=0;
        for(int num:arr){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for(int num:arr){
            if(num==candidate){
                count++;
            }
        }
        if(count>arr.length/2){
            System.out.println("The majority element is "+candidate);
            
        }else{
            System.out.println("No majority element is found");
        }
    }
}
