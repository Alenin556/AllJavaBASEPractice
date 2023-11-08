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
            //Указываем инструкции обработки для метода
            FuncInterface newInt = (x)->System.out.println(3*x);
            FuncInterface newInt2 = (x) -> System.out.println(x*x);

            // Передаем параметры в метод
            newInt.function(5);
            newInt2.function(10);
            newInt.normalFunction();
        }
    }
