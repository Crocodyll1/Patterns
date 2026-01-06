public class numberPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n; i++){
            for(int j =1; j<=i+1 ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*Output

1
12
123
1234
12345

 */