package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(lastInRow<0){
            System.out.println("last number in row is negative");
            return;
        }
        if(lastInRow<numberToSkip){
            System.out.println("number to skip is bigger then the last");
            return;
        }
        int sum1 = 0, sum2=0;
        for(int i=0; i<=lastInRow;i++){
            if(i<=numberToSkip) {
                sum2 = sum2 +i;
                continue;
            }
            sum1 = sum1 + i;
        }
        System.out.printf("skipped sum is %d\n",sum2);
        System.out.printf("counted sum is %d\n",sum1);
    }
}
