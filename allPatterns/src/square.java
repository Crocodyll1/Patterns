
public class square {
    public static void main(String[] args){
        for(int i=0; i<4; i++ ) {    //this loop create number of rows//
            for (int j = 0; j < 4; j++) {//this loop fill number of rows with *//
                System.out.print(" * ");
            }
            System.out.println(); //this nextline command send the print to next line after successful row//
        }
    }
}

/* output
 *  *  *  *
 *  *  *  *
 *  *  *  *
 *  *  *  *                                                        */
