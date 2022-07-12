package creational.template;

public class Test {
    public static void main(String[] args) {
        ExcelFile fileExcel = new ExcelFile();
        fileExcel.readProcessAndSave();

        TextFile fileText = new TextFile();
        fileText.readProcessAndSave();
    }
}
