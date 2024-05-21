import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


        String wordRepl = word;
        for(int i=0;i<str.length;i++){
            if(wordRepl.contains(str[i])){
                wordRepl = wordRepl.replace(str[i], "*");
            }
        }



        System.out.println(wordRepl.length());

    }
}