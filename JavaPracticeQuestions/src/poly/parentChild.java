package poly;


public class parentChild {
    public static class parent {
        public void foo() {
            System.out.println("I am foo in parent");
        }

        public void bar() {
            System.out.println("I am bar in parent");
        }
    }

    public static class child extends parent {
        public void foo() {
            System.out.println("I am foo in child");
        }

        public void bar() {
            System.out.println("I am bar in child");
        }
    }

    public static void main(String args[]) {
        parent parchil = new child();
        parent parpar = new parent();
        parpar.foo();
        child chchild = new child();
        chchild.bar();
        parchil.bar();
    }
}
