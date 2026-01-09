public class PalindronePatternPyramid {
    public static void main(String[] args) {

        int n =5;
        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
                System.out.print("  ");
            }
            for(int k =i+1; k>=1; k--){
                System.out.print(k + " ");

            }
            for(int l = 2; l<=i+1; l++){
                System.out.print(l + " ");
            }
            System.out.println(" ");
        }
    }
}

/*Output

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 */