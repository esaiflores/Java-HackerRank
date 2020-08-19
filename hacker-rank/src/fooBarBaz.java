public class fooBarBaz {

        public void printFooBarBaz (int x){
            for (int i = 1; i <= x; i++) {
                if (i % 2 == 0) System.out.println("foo");
                else if (i % 3 == 0) System.out.println("bar");
                else if (i % 6 == 0) System.out.println("baz");
                else System.out.println(i);
            }
        }

}

