public class Type2 extends Type1 {

    //explicitly stating constructor is optional, in this case
    public Type2() {
        super();
        System.out.println("Type2 initialized!");
    }

    //helloWorld method has been inherited

    public void goodbyeWorld() {
        System.out.println("bye bye world");

    }

    public void method() {
        System.out.println("method");
    }

    /*
    This is not overriding the method() signature
    public String method() {

    }*/

    //This is overriding the method() signature, with the introduction of a new parameter str
    public void method(String str) {
        System.out.println("method(String str) successfully called!");

    }

}
