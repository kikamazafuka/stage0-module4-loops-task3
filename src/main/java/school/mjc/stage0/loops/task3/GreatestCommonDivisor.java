package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 0;
        for(int i = 1; i<(Math.min(first, second)); i++){
            if(first%i==0 && second%i==0){
                gcd=i;
            }
        }
        if (first==second){
            System.out.println(first);
        } else if (first==0 || second==0){
            System.out.println(Math.max(first,second));
        } else System.out.println(gcd);
    }
}
