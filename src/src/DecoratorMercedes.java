public class DecoratorMercedes implements MercedesInterface{

    private MercedesInterface mercedes;

    public DecoratorMercedes(MercedesInterface mercedes){
        super();
        this.mercedes = mercedes;
    }

    @Override
    public void ChooseMercedes() {
        mercedes.ChooseMercedes();
    }
}
