class Child extends Parent {
    String name;
    void doIt(){
        System.out.println("Do It Child");
        System.out.println("Parent name is "+super.name);
    }
}