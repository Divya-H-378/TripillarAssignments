package assignments.module3.BasicMethodsandoop;

class Person {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Divya");
        System.out.println(p.getName());
    }
}
 