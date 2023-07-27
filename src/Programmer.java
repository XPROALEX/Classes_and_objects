public class Programmer {
    private String name;
    private int age;
    private boolean wearGlasses;
    public Programmer(String name,int age,boolean wearGlasses){
        this.name=name;
        this.age=age;
        this.wearGlasses=wearGlasses;
    }
    public void drinkCoffe() {
        System.out.println("Espresso is the secret!");
    }
    public void printDetails() {
        System.out.println(name+" is a "+age+"-yo programmer");
    }
    public void hasGlasses() {
        System.out.println("Is " +name+" wearing glasses? "+wearGlasses);
    }
}
