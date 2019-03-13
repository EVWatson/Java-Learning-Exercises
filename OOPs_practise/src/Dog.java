public class Dog {
    String name;
    String breed;
    int age;
    String colour;
    String speak;

    private Dog(String name, String breed, int age, String colour, String speak) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.colour = colour;
        this.speak = speak;
    }

    public String getDogName() {
        return name;
    }

    public String getDogBreed() {
        return breed;
    }

    public int getDogAge() {
        return age;
    }

    public String getDogColour() {
        return colour;
    }

    public String DogSpeaks() {
        return speak;
    }

//    public String makeSentence() {
////        return ("\n Name: " + this.getDogName() + "\n Breed: " + this.getDogBreed() + "\n Age: " + this.getDogAge() + " years" + "\n Colour: " + this.getDogColour() + "\n " + this.getDogName() + " says: " + this.DogSpeaks());
////    }


//    public static void main(String[] args) {
//
//        Dog jack = new Dog("Jack", "German Shepherd X Rottweiler", 12, "Black and Tan", "Woof!");
//        Dog cassy = new Dog( "Cassy", "Labrador X Cocker Spaniel", 10, "Gold", "Wuff!");
//
//
//        System.out.println(jack.makeSentence());
//        System.out.println(cassy.makeSentence());
//
//
//
//    }


}

