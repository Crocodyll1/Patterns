import java.util.Scanner;

public class characterHashingUArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s= sc.nextLine();

//        pre compute
        int[] hash = new int[26];
        for(int i =0; i<s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        System.out.println("Enter the number of Alphabet u want to know frequency : ");
        int x = sc.nextInt();
        while(x-- >0){
            System.out.println("Enter the Alphabet");
            char c = sc.next().charAt(0);
            System.out.println(hash[c-'a']);
        }



    }

    }

