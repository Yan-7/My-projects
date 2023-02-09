import java.util.Scanner;

public class DictionarySystem {


    static Scanner scanner = new Scanner(System.in);
    static boolean systemOn = true;

    public static void start() {
        ;
        while (systemOn == true) {
            System.out.println("welcome, insert action:");
            System.out.println("1 - add ");
            System.out.println("2 - getDefinition");
            System.out.println("3 - edit ");
            System.out.println("4 - delete");
            System.out.println("5 - sort (not working yet)");
            System.out.println("6 - print all");
            System.out.println("0 - exit");
            int choice = scanner.nextInt();
            switch (choice) {

                case 0:
                    System.out.println("thank you and goodbye");
                    systemOn = false;
                    break;
                case 1:
                    System.out.println("enter key: ");
                    String key = scanner.next();
                    System.out.println("enter value: ");
                    String value = scanner.next();
                    Dictionary.addEntry(key, value);
                    System.out.println("new key and value: "+key + " "+value);
                    System.out.println(" ");
                    break;
                case 2:    //get definition
                    System.out.println("enter key:");
                    String myKey = scanner.next();
                    Dictionary.getDefinition(myKey);
                    System.out.println();
                    break;
                case 3: // edit
                    System.out.println("enter new key:");
                    String key3 = scanner.next();
                    System.out.println("enter value:");
                    String val3 = scanner.next();
                    Dictionary.editEntry(key3, val3);
                    break;
                case 4:  //delete
                    System.out.println("select key to delete");
                    String key4 = scanner.next();
                    Dictionary.deleteEntry(key4);
                    System.out.println(" ");
                    break;
                case 5:
                    Dictionary.getEntitiesSorted();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("printing all of the keys: ");
                    Dictionary.printAll();
                    System.out.println();
            }


        }
    }
}
