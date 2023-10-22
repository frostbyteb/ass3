public class Programmer implements Loveable{
    private BinaryString lovePower = new BinaryString("");//010101010
    Programmer(String lovePower){
        this.lovePower.setValue(lovePower);
        System.out.println("Hi! I am Programmer and i have this much of love:"+ lovePower +" :)");
    }

    @Override
    public BinaryString getLovePower() {
        return lovePower;
    }
}
