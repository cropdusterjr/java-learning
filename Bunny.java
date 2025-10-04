class Bunny {
    int age;
    String name;
 
    void hop() {
        System.out.println(name + " hops around.");
    }
 
    void eat(String food) {
        if (food.equals("carrots")) {
            System.out.println(name + " eats the " + food + ".");
            hop(); // because carrots are our favorite food
        } else if (food.equals("lettuce")) {
            System.out.println(name + " eats the " + food + ".");
        } else {
            System.out.println(name + " cannot eat the " + food + ".");
        }
    }
 
    void sleep() {
        System.out.println(name + " takes a nap.");
    }
}
