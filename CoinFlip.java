import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        Random r=new Random();
        int count_a =0;
        int count_b =0;
        int count_ab=0;
        int totalsteps_a=0;
        int totalsteps_b=0;
        boolean current_a=r.nextBoolean();
        boolean current_b=r.nextBoolean();
        boolean win_a=false;
        boolean win_b=false;
        int round=1;
        while (true) {
            round++;
        boolean next_a=r.nextBoolean();
        boolean next_b=r.nextBoolean();
            if (current_a && next_a) {
                win_a=true;
            }
            if (current_b && !next_b) {
                win_b=true;   
            }
            if (win_a && win_b) {
                System.out.println("Both Win!-round:"+round);
                count_ab++;
                totalsteps_a+=round;
                totalsteps_b+=round;
                break;
            }
            if (win_a && !win_b) {
                System.out.println("A win-round:"+round);
                count_a++;
                totalsteps_a+=round;
                break;
            }
            if (!win_a && win_b) {
                System.out.println("B win-round:"+round);
                count_b++;
                totalsteps_b+=round;
                break;
            }
        }
    }
}
