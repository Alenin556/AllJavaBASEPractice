package Lambda;

@FunctionalInterface
    interface FuncInterface
    {
        // An abstract function
        abstract void function(int x);

        // A non-abstract (or default) function
        default void normalFunction()
        {
            System.out.println("Hello");
        }
    }

    class Test
    {
        public static void main(String args[])
        {
            // lambda expression to implement above
            // functional interface. This interface
            // by default implements abstractFun()
            FuncInterface newInt = (int x)->System.out.println(3*x);
            FuncInterface newInt2 = (int x) -> System.out.println(x*x);

            // This calls above lambda expression and prints 10.
            newInt.function(5);
            newInt2.function(10);
            newInt.normalFunction();
        }
    }
