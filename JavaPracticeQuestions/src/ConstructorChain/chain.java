package ConstructorChain;


public class chain {
    static int x,y;
    chain()
    {
        this(x=0);
        System.out.println("Hi from without params");
    }
    chain(int x)
    {
        this(x=0,y=0);
        System.out.println("Hi from one param");
    }
    chain(int x, int y)
    {
        System.out.println("Hi from two params");
    }
    public static void main(String args[]) 
    {
            chain obj = new chain();
        
        }
}
