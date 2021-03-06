package DeadLockDemo;


/**
 * Java program to create a deadlock by imposing circular wait.
 *
 * @author WINDOWS 8
 *
 */
public class DeadLockDemo {

    /*
     * This method request two locks, first String and then Integer
     */
    public void method1() {
        method2();
        synchronized (String.class) {
            System.out.println("Aquired lock on String.class object");

            synchronized (Integer.class) {
                System.out.println("Aquired lock on Integer.class object");
            }
        }
    }

    /*
     * This method also requests same two lock but in exactly
     * Opposite order i.e. first Integer and then String. 
     * This creates potential deadlock, if one thread holds String lock
     * and other holds Integer lock and they wait for each other, forever.
     */
    public void method2() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }

    public static void main(String args[]) {
        DeadLockDemo obj = new DeadLockDemo(); //only one object

        Thread t1 = new Thread() {
            public void run() {
                obj.method1();
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                obj.method2();
            }
        };
        t1.start();
        t2.start();
    }
}
