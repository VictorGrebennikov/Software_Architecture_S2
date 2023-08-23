public class EmptyBoxGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        System.out.println("CreateEmptyBox");
        return new EmptyBox();
    }
}
