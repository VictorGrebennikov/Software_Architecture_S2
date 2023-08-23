public class GemGenerator extends ItemFabric {
    @Override
    public  iGameItem createItem(){
        System.out.println("CreateBoxWithGEM");
        return new GemReward();
    }
}