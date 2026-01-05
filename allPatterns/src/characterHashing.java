import java.util.Scanner;

public class characterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println("character u want to find frequency :");
        char c = sc.next().charAt(0);

        System.out.println(frequency(c,s));



    }
    public static int frequency(char c, String s){
        int count =0;
        int len = s.length();
        for(int i =0; i<len; i++){
            if(s.charAt(i) == c) {

                count++;
            }
        }
        return count;
    }
}
