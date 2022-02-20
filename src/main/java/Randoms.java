import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private Random random = new Random();
    private List<Integer> listRandom = new ArrayList<>();
    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int nextIndex = 0;

            @Override
            public boolean hasNext() {
                if (nextIndex <= listRandom.size()) {
                    int diff = max - min;
                    int i = random.nextInt(diff + 1);
                    i += min;
                    listRandom.add(i);
                    nextIndex++;
                }
                return true;
            }

            @Override
            public Integer next() {
                return listRandom.get(nextIndex - 1);

            }
        };
    }
}
