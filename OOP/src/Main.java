public class Main {
    public static void main(String[] args) {
        // Object Creating

        var textBox1 = new TextBox();
        var textBox2 = new TextBox();

        textBox1.setText("Box 1");
        System.out.println(textBox1.text);

        textBox2.setText("Box 2");
        System.out.println(textBox2.text);

        System.out.println("Memory Allocation:");

        var TextBox3 = new TextBox();
        var TextBox4 = TextBox3;

        TextBox4.setText("Hello World");
        System.out.println(TextBox3.text);
    }
}