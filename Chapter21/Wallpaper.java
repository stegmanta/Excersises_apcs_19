import java.util.Scanner;
public class Wallpaper{

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the width of the room in inches :");
        Double width = Double.parseDouble(scan.nextLine());

        System.out.println("What is the length of the room in inches :");
        Double length = Double.parseDouble(scan.nextLine());

        System.out.println("What is the combined area of the openings in the room in inches :");
        Double openingArea = Double.parseDouble(scan.nextLine());

        Double areaOfRoomToBeCovered = (width*length)-openingArea;
        Double neeededWallpaperRolls = Math.ceil(areaOfRoomToBeCovered/27.0);

        System.out.println("You need "+ neeededWallpaperRolls + " rolls of wallpaper");






    }
}