package reviewOOP;

public interface IPet {
    //abstract method
    public abstract void greetOwner();

    //after java eight they introduced something called a default method
//default method
   default void printPetClassName(){ //the benefit of it being default is you aren't forced to implement it
       System.out.println(this.getClass().getSimpleName());
   }

   //interfaces can also have static method
    static void printPetGreetings(IPet[] pets){
        for(IPet pet : pets){
            pet.printPetClassName();
        }
    }
}
