package reviewOOP;
// every object has three things, the ID, the State, and the Behavior
//the attributes are the states of the object

public abstract class Animal {

    //when you're creating your attributes think of what every instance of this object will have
    private int id; //these need to be different because so each animal can own their id and still track the count
    private static int animalCount;
    private String name;
    private String food; //public by default
    private int age; //restricted access to modify
protected char sex;

    //default constructor, looks just like a method but it doesn't have a return type
    public Animal() {
    }

    //parameterized constructor, what does that look like?
    public Animal(String name) {
        this.name = name;
    }

    //overload the constructor (more to overloading constructor come back to this later)
    public Animal(String name, String food) {
        animalCount++;
        id = animalCount;
        this.name = name;
        this.food = food;
    }

    //getter
    public int getAge() {
        return this.age;
    }

    //setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Error, age must be greater than zero");
        }
    }

        //method- Behavior
        public void eat(){
            System.out.println(this.food);
        }
        //abstract method - signature - it has no body
    public abstract void makeNoise();

    //static method
    public static void printUniqueAnimalMethod(Animal animal){
        if(animal instanceof Dog){
 ((Dog)animal).fetch();
        }
        if(animal instanceof Cat){
            ((Cat)animal).scratch();
        }
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public int getId() {
        return id;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    //String representation of an object
        @Override
        //because the java developers already wrote it we have to override it to make it do what I want it to do
        public String toString(){
            return " -> Name: " + this.name +
                    " -> Food: " + this.food;
        }

    }

