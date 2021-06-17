public class Q34 {
    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger =  new WildAnimal("Feline", 80, "Short");
        System.out.println(wolf.type +  " " + wolf.maxSpeed + " " + wolf.bounds);
        System.out.println(tiger.type +  " " + tiger.maxSpeed + " " + tiger.bounds);
    }

}
class Animal {
    String type = "Canine";
    int maxSpeed = 60;

    Animal () { }
    Animal (String type, int maxSpeed){
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}
class WildAnimal extends Animal {
    String bounds;
    WildAnimal (String bounds) {
        // line n1
    }
    WildAnimal (String type, int maxSpeed, String bounds){
        // line n2
    }
}

/*
And given the code fragment:
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger =  new WildAnimal("Feline", 80, "Short");
        System.out.println(wolf.type +  " " + wolf.maxSpeed + " " + wolf.bounds);
        System.out.println(tiger.type +  " " + tiger.maxSpeed + " " + tiger.bounds);

and this output:

Canine 60 Long
Feline 80 Short

Which two modifications enable the code to print this output? (Choose two.)

    A   Replace n1 with:
        super();
        this.bounds = bounds;

    B   Replace n1 with:
        this.bounds = bounds;
        super();

    C   Replace n2 with:
        super(type, maxSpeed);
        this(bounds);

    D   Replace n1 with:
        this("Canine", 60);
        this.bounds = bounds;

    E   Replace n2 with:
        super(type, maxSpeed);
        this.bounds = bounds;




A.	Option A
B.	Option B
C.	Option C
D.	Option D
E.	Option E

 */

