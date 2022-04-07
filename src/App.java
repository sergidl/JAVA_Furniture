public class App {
    public static void main(String[] args) throws Exception {
        // Create a new instance of the Closet class
        System.out.println("\n\nArmari\n");
        Closet closet = new Closet("Ëscuter", "Wood", "Brown", 5, 2, 10);
        // Print the name of the closet
        System.out.println(closet.getName());
        // Print the material of the closet
        System.out.println(closet.getMaterial());
        // Print the color of the closet
        System.out.println(closet.getColor());
        // Print the length of the closet
        System.out.println(closet.getLength());
        // Print the width of the closet
        System.out.println(closet.getWidth());
        // Print the height of the closet
        System.out.println(closet.getHeight());

        // Create a new instance of the Stool class
        System.out.println("\n\nTaburet\n");
        Stool stool = new Stool("Sïllant", "Wood", "White", 4, true);
        // Print the name of the stool
        System.out.println(stool.getName());
        // Print the material of the stool
        System.out.println(stool.getMaterial());
        // Print the color of the stool
        System.out.println(stool.getColor());
        // Print the number of legs of the stool
        System.out.println(stool.getNumberOfLegs());
        // Print the foldable of the stool
        System.out.println(stool.getFoldable());

        // Create a new instance of the Table class
        System.out.println("\n\nTaula:\n");
        Table table = new Table("Toublë", "Steel", "Grey", 5, 1, 1, 4, true);
        // Print the name of the table
        System.out.println(table.getName());
        // Print the material of the table
        System.out.println(table.getMaterial());
        // Print the color of the table
        System.out.println(table.getColor());
        // Print the length of the table
        System.out.println(table.getLength());
        // Print the width of the table
        System.out.println(table.getWidth());
        // Print the height of the table
        System.out.println(table.getHeight());
        // Print the number of legs of the table
        System.out.println(table.getNumberOfLegs());
        // Print the extendable of the table
        System.out.println(table.getExtendable());

        // Create a new instance of the Chair class
        System.out.println("\n\nCadira\n");
        Chair chair = new Chair("Xhïya", "Plastic", "Black", 3);
        // Print the name of the chair
        System.out.println(chair.getName());
        // Print the material of the chair
        System.out.println(chair.getMaterial());
        // Print the color of the chair
        System.out.println(chair.getColor());
        // Print the number of legs of the chair
        System.out.println(chair.getNumberOfLegs());
    }
}
