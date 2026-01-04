public class squareFrame {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(i== 0 || i==3 || j==0 || j==3){//rows and columns to print//
                    System.out.print("*");
                }else{
                    System.out.print(" ");//space printed //
                }
            }
            System.out.println();
        }

    }
}

/* points to remember-
1.See this as a Matrix.
2.Find the common elements.
3.Loops starts from 1-4 but index starts from 0-3.
4.Print space in unwanted location
 */

/* Output
 ****
 *  *
 *  *
 ****
 */