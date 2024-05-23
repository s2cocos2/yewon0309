import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double sum = 0;
        for(int i=0;i<20;i++){
            String subject = sc.next();
            double score = sc.nextDouble();
            String grade = sc.next();

            if(!grade.equals("P")){
                sum += score;
            }

            if(grade.equals("A+")){
                total += (4.5 * score);
            } else if(grade.equals("A0")){
                total += (4.0 * score);
            } else if(grade.equals("B+")){
                total += (3.5 * score);
            } else if(grade.equals("B0")){
                total += (3.0 * score);
            } else if(grade.equals("C+")){
                total += (2.5 * score);
            } else if(grade.equals("C0")){
                total += (2.0 * score);
            } else if(grade.equals("D+")){
                total += (1.5 * score);
            } else if(grade.equals("D0")){
                total += (1.0 * score);
            } else {
                total += 0;
            }
        }

        double answer = total / sum;
        System.out.println(answer);




        }
}