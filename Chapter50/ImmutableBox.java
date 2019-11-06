public class ImmutableBox{

    public static void main(String []args){
        MoreImmutableBox rectangularBox = new MoreImmutableBox(6.0,9.0,8.9);
        MoreImmutableBox anotherBox = new MoreImmutableBox(8,9,9);

        System.out.println("The volume of the first box is " + rectangularBox.Volume());
        System.out.println("The area of the first box is " + rectangularBox.Area());
        System.out.println("the area of the second box is " + anotherBox.Area());
        // System.out.println("The area of the second box is " + theBox.Area());

    }
}