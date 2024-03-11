package solid.single_reponsibility;

public class TextManipulate {
    private String text;

    public TextManipulate(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void appendText(String word) {
        text = text.concat(word);
    }

    public boolean textFind(String word) {
        if (text.contains(word)) {
            return true;
        }
        return false;
    }

    public void textFindAndReplace(String oldWord, String newWord) {
        if (text.contains(oldWord)) {
            text = text.replace(oldWord, newWord);
        }
    }

    public void textFindAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
    }

    // Text Print moved to TextPrinter Class
}
