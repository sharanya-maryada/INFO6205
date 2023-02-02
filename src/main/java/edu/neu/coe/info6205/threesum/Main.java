package edu.neu.coe.info6205.threesum;

import edu.neu.coe.info6205.util.Stopwatch;
import org.apache.commons.math3.random.RandomDataGenerator;

public class Main {

    public static void main(String[] args) {
        for (String s : args[0].split(",")) {
            int m = Integer.parseInt(s);
            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
                int randomWithRandomDataGenerator = randomDataGenerator.nextInt(0, 10000);
                a[i] = randomWithRandomDataGenerator;
            }
            Stopwatch stopwatch = new Stopwatch();
            ThreeSum threeSum = new ThreeSumCubic(a);
            threeSum.getTriples();
            long time = stopwatch.lap();
            System.out.println(" Cubic Elapsed time: " + time + " msecs for number of elements :"+ m);
            stopwatch.close();
            stopwatch = new Stopwatch();
            threeSum=new ThreeSumQuadratic(a);
            threeSum.getTriples();
            time = stopwatch.lap();
            System.out.println(" quadratic Elapsed time: " + time + " msecs for number of elements :"+ m);
            stopwatch.close();
        }

    }
}
