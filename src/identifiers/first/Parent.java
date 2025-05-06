package identifiers.first;

public class Parent {

    public  String first = "public";
    String second = "default";
    protected String third = "protected";
    private  String fourth = "private";

    public void  firstmethod(){
        System.out.println("public");
    }
    void  secondtmethod(){
        System.out.println("default");
    }
    protected void  thirdmethod(){
        System.out.println("protected");
    }
    private void  fourthmethod(){
        System.out.println("private");
    }

    public void testIdentifiers(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);


        firstmethod();
        secondtmethod();
        thirdmethod();
        fourthmethod();
    }


}
