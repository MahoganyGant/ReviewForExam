package reviewOOP;

public class Zoo {

    public static void main(String[] args) {
//commented out because going into abstraction

        //TypeOfThing refrenceVariableName = new ClassName();
       // Animal animal1 = new Animal("Cow","Grass");
        //refrenceVariableName.propertyName;

        //animal1.age = 7;
       // System.out.println(animal1);

        //Animal animal2 = new Animal("Dog","Steaks");

       // animal2.setAge(-99); //error message should come back
        //animal2.age = -99;
       // System.out.println(animal2.getAge());
      //  System.out.println(animal2.getName());

        //new example working with inheritance

        Cat cat = new Cat("Mason","Milk");
        //cat.scratch();
        cat.setAge(4);
       // System.out.println(cat);
       // System.out.println(cat.getId());

        Dog dog = new Dog("Bingo","Steaks");

       // Animal dogToCat = new Dog("Doja Cat", "noodles"); //upcasted
      // dogToCat.eat();
       // System.out.println(dogToCat instanceof Dog);

       // ((Dog)dogToCat).fetch(); //downcasted
        Animal dogToCat = new Cat("Kitty", "Salmon");
       // ((Cat)dogToCat).scratch();

       // dog.fetch();
        dog.setAge(67);
        dog.sex = 'M';
      //  System.out.println(dog);

        Wolf wolf = new Wolf("ralph","deer");
       // System.out.println(wolf);

        Tiger tiger = new Tiger("Jessy","aligators");
       // System.out.println(tiger);
       // System.out.println(tiger.getId()); //currently only printing one because im not sharing the variable as I should
       RoboticDog roboDog = new RoboticDog();

        Animal[] animals = {dog,cat,wolf,tiger};
        IPet[] pets = {roboDog,dog,cat};



        for(Animal animal : animals){
          // animal.eat();
        }

       // System.out.println("Total animals created");
       // System.out.println(Animal.getAnimalCount());


      //  Animal.printUniqueAnimalMethod(dog);
        IPet.printPetGreetings(pets);
    }
}
