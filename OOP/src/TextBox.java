public class TextBox {
    public String text = ""; // Field

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = ""; // Don't need to user this, because it's clear that text is connected with text from class and not with parameter
    }
}
