package single_reponsibility;

public class Printer {
    private TextManipulate textManipulate;

    public Printer(TextManipulate textManipulate) {
        this.textManipulate = textManipulate;
    }

    public void printer() {
        System.out.println("Waiting for printer: " + textManipulate.getText());
    }
}
