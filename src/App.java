import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // CLOSET
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\nArmari\n");
        System.out.println("Enter the name of the closet: ");
        String name=sc.nextLine();
        System.out.println("Enter the material of the closet: ");
        String material=sc.nextLine();
        System.out.println("Enter the color of the closet: ");
        String color=sc.nextLine();
        System.out.println("Enter the length of the closet: ");
        float length=sc.nextFloat();
        System.out.println("Enter the width of the closet: ");
        float width=sc.nextFloat();
        System.out.println("Enter the height of the closet: ");
        float height=sc.nextFloat();
        Closet closet=new Closet(name, material, color, length, width, height);
        System.out.println(closet.getName());
        System.out.println(closet.getMaterial());
        System.out.println(closet.getColor());
        System.out.println(closet.getLength());
        System.out.println(closet.getWidth());
        System.out.println(closet.getHeight());

        // STOOL
        System.out.println("\n\nTaburet\n");
        System.out.println("Enter the name of the stool: ");
        name=sc.nextLine();
        System.out.println("Enter the material of the stool: ");
        material=sc.nextLine();
        System.out.println("Enter the color of the stool: ");
        color=sc.nextLine();
        System.out.println("Enter the number of legs of the stool: ");
        int legs=sc.nextInt();
        System.out.println("Enter true or false if the stool is foldable: ");
        boolean foldable=sc.nextBoolean();
        Stool stool=new Stool(name, material, color, legs, foldable);
        System.out.println(stool.getName());
        System.out.println(stool.getMaterial());
        System.out.println(stool.getColor());
        System.out.println(stool.getNumberOfLegs());
        System.out.println(stool.getFoldable());

        // TABLE
        System.out.println("\n\nTaula:\n");
        System.out.println("Enter the name of the table: ");
        name=sc.nextLine();
        System.out.println("Enter the material of the table: ");
        material=sc.nextLine();
        System.out.println("Enter the color of the table: ");
        color=sc.nextLine();
        System.out.println("Enter the lenght of the table: ");
        length=sc.nextFloat();
        System.out.println("Enter the width of the table: ");
        width=sc.nextFloat();
        System.out.println("Enter the height of the table: ");
        height=sc.nextFloat();
        System.out.println("Enter the number of legs of the table: ");
        legs=sc.nextInt();
        System.out.println("Enter true or false if the table is extendable: ");
        boolean extendable=sc.nextBoolean();
        Table table=new Table(name, material, color, length, width, height, legs, extendable);
        System.out.println(table.getName());
        System.out.println(table.getMaterial());
        System.out.println(table.getColor());
        System.out.println(table.getLength());
        System.out.println(table.getWidth());
        System.out.println(table.getHeight());
        System.out.println(table.getNumberOfLegs());
        System.out.println(table.getExtendable());

        // CHAIR
        System.out.println("\n\nCadira\n");
        System.out.println("Enter the name of the chair: ");
        name=sc.nextLine();
        System.out.println("Enter the material of the chair: ");
        material=sc.nextLine();
        System.out.println("Enter the color of the chair: ");
        color=sc.nextLine();
        System.out.println("Enter the number of legs of the chair: ");
        legs=sc.nextInt();
        Chair chair=new Chair(name, material, color, legs);
        System.out.println(chair.getName());
        System.out.println(chair.getMaterial());
        System.out.println(chair.getColor());
        System.out.println(chair.getNumberOfLegs());
        
        sc.close();
    }
}
