abstract class Animal {
    public abstract void makeSound();
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }
}