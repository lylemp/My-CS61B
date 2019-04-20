public class Playground {

    public static void main(String[] args) {
        //Test out your code here

        //Type2 is-a Type1 (subclass is-a superclass); superclass is-not-necessarily-a subclass
        //Type1 a = new Type1();
        //Type1 b = new Type2();
        //b.method() cannot occur, since the static type (Type1) does not have method(). However,

        //casting b as a Type2 bypasses this barrier and allows it to access Type2's class, which does have method()
        //((Type2)b).method();

        Type1 a = new Type1();
        Type2 b = new Type2();
        Type1 c = new Type2();

        //((Type2)a).method(); //the casting makes method() visible, but uncallable. ouch
        ((Type2)b).method();
        ((Type2)c).method(); //as it is right now, c can't call method() bc its static type does not have method().
        //however, upon casting TYpe2, it changes the static type to Type2 to allow access, and since the dynamic type is also Type2, it can be called.
        //contrast this with a, which, although is casted to Type2 (that is, the static type is changed to Type2, allowing access) the dynamic type is still Type1, and therefore results in a runtime error.

        /*a.helloWorld();
        b.helloWorld();
        c.helloWorld();
        System.out.println();
        a.goodbyeWorld();
        b.goodbyeWorld();
        c.goodbyeWorld();
        System.out.println();
        //((Type2)a).helloWorld(); ERROR. Can't cast a subclass to an object with the superclass as its static
        ((Type1)c).goodbyeWorld();
        System.out.println();
        c = (Type1) b; //CAN cast the superclass to an object with the subclass as its static
        c.goodbyeWorld();
        System.out.println();
        Type1 d = new Type2();
        b = (Type2) d;*/
    }
}
