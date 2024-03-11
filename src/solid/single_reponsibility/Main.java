package solid.single_reponsibility;

public class Main {
    public static void main(String[] args) {
        TextManipulate textManipulate = new TextManipulate("");
        TextPrint textPrint = new TextPrint(textManipulate);

        textManipulate.appendText("Hello!");
        System.out.println("append: " + textPrint.printText());
        textManipulate.appendText("How are you?");
        System.out.println("append: " + textPrint.printText());
        textManipulate.textFind("are");
        System.out.println("find: " + textPrint.printText());
        textManipulate.appendText("Hope you are doings well.");
        System.out.println("append: " + textPrint.printText());
        textManipulate.textFindAndReplace("doings", "doing as");
        System.out.println("findReplace: " + textPrint.printText());
        textManipulate.textFindAndDelete("as");
        System.out.println("findDelete: " + textPrint.printText());

        System.out.println("============================");
        Printer printer = new Printer(textManipulate);
        printer.printer();
    }
}