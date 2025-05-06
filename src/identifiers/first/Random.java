package identifiers.first;

public class Random {

    public void testIdentifier() {

        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        //System.out.println(parent.fourth);

        parent.firstmethod();
        parent.secondtmethod();
        parent.thirdmethod();
        //parent.fourthmethod();
    }
}
