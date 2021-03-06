package basics;


public class  impl2Class extends implClass{
    public impl2Class() {
        super();
    }

    @Override
    public int add(int a1, int a2, int a3) {
        // TODO Implement this method
        return a1+a2+a3;
    }

    @Override
    public int add(int a1, int a2) {
        // TODO Implement this method
        return a1+a2;
    }
    public static void main(String args[])
    {
        impl2Class obj = new impl2Class();
        
        int a1=1, a2=2, a3=3;
        System.out.println(obj.add(a1, a2, a3));//from implClass
        
        System.out.println(obj.add(a1, a2));//from Interface1
        

    }
}
