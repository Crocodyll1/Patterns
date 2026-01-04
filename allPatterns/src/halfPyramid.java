public class halfPyramid {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){ // set number of rows//
            for(int j=0; j<=i; j++){ // fill column (*) same no. as row, like row 1 = *, 2nd row with * * and same for rest
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}


/* Output
 *
 *  *
 *  *  *
 *  *  *  *
 */