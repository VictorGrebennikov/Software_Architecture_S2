import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ItemFabric goldGenerator = new GoldGenerator();
        goldGenerator.openReward();

        ItemFabric gemGenerator = new GemGenerator();
        gemGenerator.openReward();

        ItemFabric emptyChestGenerator = new EmptyBoxGenerator();
        emptyChestGenerator.openReward();

        Random rnd = ThreadLocalRandom.current();

        List<ItemFabric> fabricList = new ArrayList<>();
        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new EmptyBoxGenerator());

        for (int i = 0; i < 20; i++) {
            int index = rnd.nextInt(fabricList.size());
            ItemFabric fabric = fabricList.get(index);

            fabric.openReward();
        }
    }
}