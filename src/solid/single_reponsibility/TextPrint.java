package solid.single_reponsibility;

public class TextPrint {
    private TextManipulate textManipulate;
    public TextPrint(TextManipulate textManipulate) {
        this.textManipulate = textManipulate;
    }

    public String printText() {
        return textManipulate.getText();
    }

    public String printRangeOfCharacter(int startIndex, int endIndex) {
        return textManipulate.getText().substring(startIndex, endIndex);
    }
}
