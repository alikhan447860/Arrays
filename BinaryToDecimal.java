public class BinaryToDecimal {
    public static void main(String[] args) {
        int decimal=22;
        String binary="";
        while(decimal>0){
     int remainder=decimal%2;
     binary=remainder+binary;
     decimal=decimal/2;
        }
        System.out.println("The binary conversion of decimal is "+binary);
    }
}
