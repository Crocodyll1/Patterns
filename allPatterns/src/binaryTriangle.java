public class binaryTriangle {
    public static void main(String[] args) {

        int n= 5;
        int x= 1;
        for(int i = 0; i<n; i++){
            for(int j =1; j<=i+1; j++){
                if(x%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
                x++;
            }
            System.out.println();
        }
    }
}

/*Output

1
01
010
1010
10101
 */