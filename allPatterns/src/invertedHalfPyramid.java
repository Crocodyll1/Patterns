public class invertedHalfPyramid {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){
            for(int j=0; j<4-i; j++){ // set condition to maxsize(4) - row(i)//
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

}
/* Output

 *  *  *  *
 *  *  *
 *  *
 *
 */