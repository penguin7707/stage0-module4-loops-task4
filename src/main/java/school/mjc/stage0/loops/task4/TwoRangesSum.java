package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(lastInRow<0){
            System.out.println("last number in row is negative");
            return;
        }
        if(lastInRow<numberToSkip){
            System.out.println("number to skip is bugger then the last");
            return;
        }
        int sum1 = 0, sum2=0;
        for(int i=0; i<lastInRow;i++){
            if(i==numberToSkip) continue;
            sum1 = sum1 + i;
        }
        if(lastInRow!=numberToSkip) sum2 =lastInRow + numberToSkip;
        System.out.printf("skipped sum is %d\n",sum2);
        System.out.printf("counted sum is number %d\n",sum1);
    }
}
