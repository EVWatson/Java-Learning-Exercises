public class Cat {

    private String name;
    private String breed;
    private int age;
    private String colour;
    private String speak;

     Cat(String name, String breed, int age, String colour, String speak) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.colour = colour;
        this.speak = speak;
    }

    public String getCatName() {
        return name;
    }

    public String getCatBreed() {
        return breed;
    }

    public int getCatAge() {
        return age;
    }

    public String getCatColour() {
        return colour;
    }

    public String catSpeaks() {
        return speak;
    }

//    public String makeSentence() {
//        return ("\n Name: " + this.getCatName() + "\n Breed: " + this.getCatBreed() + "\n Age: " + this.getCatAge() + " years" + "\n Colour: " + this.getCatColour() + "\n " + this.getCatName() + " says: " + this.catSpeaks());
//    }
//
//    public static void feedCat() {
//        for (int biscuits = 10; biscuits > 0; biscuits -- ) {
//            System.out.println("crunch");
//        }
    }





//    public static void main(String[] args) {
//
//        Cat louie = new Cat("Louie", "Domestic Short Hair", 3, "Tabby", "Meow!");
//        Cat pepper = new Cat( "Pepper", "Domestic Short Hair", 3, "Tortoise-Shell", "Purrrrrr");
//
//        System.out.println(louie.name + " " + louie.colour);
//
//        System.out.println(louie.makeSentence());
//        System.out.println(pepper.makeSentence());
//
//        feedCat();
//
//
//
//    }


}
