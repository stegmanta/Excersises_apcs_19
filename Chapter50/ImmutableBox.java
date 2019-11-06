public class ImmutableBox{

    public static void main(String []args){
        MoreImmutableBox rectangularBox = new MoreImmutableBox(6.0,9.0,8.9);

        System.out.println("The volume of the box is " + rectangularBox.Volume());
        System.out.println("The area of the box is " + rectangularBox.Area());
    }
}