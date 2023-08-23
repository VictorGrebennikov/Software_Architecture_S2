public class GoldGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        System.out.println("CreateBoxWithGOLD");
        return new GoldReward();
    }
}