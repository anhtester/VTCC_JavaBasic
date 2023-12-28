package Bai1_JavaBasic.Ham;

public class DemoHamTestAutomation {

    public static void clickElement(String elementName) {
        //Dùng code auto để thao tác click vào 1 phần tử trên web/mobile
        System.out.println("Click on element: " + elementName);
    }

    public static void setText(String elementName, String value) {
        //Dùng code auto để thao tác click vào 1 phần tử trên web/mobile
        System.out.println("Set Text to input: " + elementName);
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        setText("Email input", "admin@example.com");
        setText("Password input", "123456");
        clickElement("Button Login");
    }
}
