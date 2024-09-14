sealed class A extends Thread implements Cloneable permits B, C {

}

sealed class B extends A permits D {

}

final class C extends A {

}

non-sealed class D extends B {

}

sealed interface X permits Y {

}

non-sealed interface Y extends X {

}

public class SealedClasses {
    public static void main(String args[]) {
        
    }
}