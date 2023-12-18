package inheritance;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        // rocky.fetch();
        // rocky.makeSound();
        feed(rocky);

        Animal sasha = new Cat();
        feed(sasha);
        // sasha.makeSound();
        // Sasha cannot fetch because it was instantiated
        // as an Animal type which doesnt have fetch

        // ((Cat)sasha).scratch(); // type is down casted for this line alone

        boolean isDog = sasha instanceof Dog; // returns true
    }

    public static void feed(Animal animal) {

        if (animal instanceof Dog) {
            System.out.println("heres your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("heres your cat food");
        }
    }
}
