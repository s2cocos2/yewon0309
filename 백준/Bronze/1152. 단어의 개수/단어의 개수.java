import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String str2 = str.trim();
        
        if(str2.isEmpty()){
            System.out.println(0);
        } else {
            String[] arr = str2.split(" +");
            System.out.println(arr.length);
        }
        
        

    }
}