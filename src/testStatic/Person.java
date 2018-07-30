package testStatic;

class Person {
    static{
        System.out.println("3.person static");
    }
    public Person(String str){
        System.out.println("person"+str);
    }
}
