import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();

    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            int newRandom;

            @Override
            public boolean hasNext() {
                int diff = max - min;
                newRandom = random.nextInt(diff + 1);
                newRandom += min;
                return true;
            }

            @Override
            public Integer next() {
                return newRandom;
            }
        };
    }
}
