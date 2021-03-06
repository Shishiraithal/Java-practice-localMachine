package programmes.WOSynchronization;


class testSync {
    public static void main(String args[]) {
        WithoutSynchronize obj = new WithoutSynchronize(); //only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
class MyThread1 extends Thread {
    WithoutSynchronize t;

    MyThread1(WithoutSynchronize t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }

}
class MyThread2 extends Thread {
    WithoutSynchronize t;

    MyThread2(WithoutSynchronize t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}
