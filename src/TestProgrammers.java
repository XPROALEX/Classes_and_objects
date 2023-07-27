public class TestProgrammers {
public static void main(String[]args){
    Programmer programmer1=new Programmer("Alessandro",26,false);
    Programmer programmer2=new Programmer("Riccardo",32,true);
    programmer1.drinkCoffe();
    programmer1.printDetails();
    programmer2.printDetails();
    programmer2.hasGlasses();
}
}
