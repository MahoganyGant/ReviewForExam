package reviewOOP;
//A dog is a Animal, dog is a subclass of animal the super class
public class Dog extends Canine implements IPet{
    //this allows us to create more concrete properties for this specific animal

//inherited from parent class
    public Dog() {
    }
    public Dog(String name) {
        super(name);
    }
    public Dog(String name, String food) {
        super(name, food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof Woof");
    }

    public void fetch(){
        System.out.println("fetch a toy ball like a " + sex);
    }
    @Override
    //because the java developers already wrote it we have to override it to make it do what I want it to do
    public String toString(){
        return " -> Name: " + this.getName() +
                " -> Food: " + this.getFood() + " sex " + sex;
    }

    @Override
    public void greetOwner() {
        System.out.println("Wag tail and lick feet");
    }
}
