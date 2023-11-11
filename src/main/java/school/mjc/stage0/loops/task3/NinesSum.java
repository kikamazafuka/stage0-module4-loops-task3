package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int res = 0;
        int s = 0;
        while (lengthOfLastNumber>0){
            s = s*10+9;
            res+=s;
            lengthOfLastNumber--;
        }
        System.out.println(res);

    }
}
