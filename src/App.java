public class App {
    public static void main(String[] args) throws Exception {
        // CLOSET
        System.out.println("\n\nArmari\n");
        Closet closet = new Closet("Ëscuter", "Wood", "Brown", 5, 2, 10);
        System.out.println(closet.getName());
        System.out.println(closet.getMaterial());
        System.out.println(closet.getColor());
        System.out.println(closet.getLength());
        System.out.println(closet.getWidth());
        System.out.println(closet.getHeight());

        // STOOL
        System.out.println("\n\nTaburet\n");
        Stool stool = new Stool("Sïllant", "Wood", "White", 4, true);
        System.out.println(stool.getName());
        System.out.println(stool.getMaterial());
        System.out.println(stool.getColor());
        System.out.println(stool.getNumberOfLegs());
        System.out.println(stool.getFoldable());

        // TABLE
        System.out.println("\n\nTaula:\n");
        Table table = new Table("Toublë", "Steel", "Grey", 5, 1, 1, 4, true);
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
        Chair chair = new Chair("Xhïya", "Plastic", "Black", 3);
        System.out.println(chair.getName());
        System.out.println(chair.getMaterial());
        System.out.println(chair.getColor());
        System.out.println(chair.getNumberOfLegs());
    }
}
