package innerclass;

public class Animal {

    String animalName;
    String type;
    Animal(String animalName,String type){

        this.animalName=animalName;
        this.type=type;
    }
        class Dog{

            String application;
            Dog(String application){

                this.application=application;
            }
            public void methodOne(){
                System.out.println("inner method of dog class !");
                System.out.println("animal name ::"+ animalName);
                System.out.println("animal type :: "+type);
                System.out.println("application of this animal :: "+application);
            }
            public static void main(String[] args) {
                System.out.println("Dog class inside Animal class");
            }
        }

        public static void main(String[] args) {
            System.out.println("Animal class main method");
            Dog dog = new Animal("Horse","pet").new Dog("riding"); // Create an instance of the inner class
            Dog.main(args); // Call the main method of the inner class
            dog.methodOne();
        }
}
