public class App {
    public static void main(String[] args) throws Exception {
    Child child = new Child();
    child.name = "Alpha";
    child.doIt();
    System.out.println(child.name);

    Parent parent = (Parent) child;
    parent.doIt();
    System.out.println(parent.name);
}
}
