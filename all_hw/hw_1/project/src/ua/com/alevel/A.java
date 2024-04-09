package ua.com.alevel;

public class A {
    String name;
    String creator;
    int year;
    public static void main(String [] args){
        ua.com.alevel.test.B ava = new ua.com.alevel.test.B();

        A info = new A();
        info.name="Java";
        info.year=1995;
        info.creator="James Gosling";
        //System.out.println(info.name + " was developed by " + info.creator + " in " + info.year + "!!!");
        ava.print(info.name + " was developed by " + info.creator + " in " + info.year + "!!!");


    }
}