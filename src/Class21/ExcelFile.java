package Class21;
interface FileReader{
    void read();
}
// Created by Microsoft
public class ExcelFile implements FileReader{

    @Override
    public void read() {
        System.out.println("reading an Excel file");
    }
}
//created by NotePad++
class TxtFile implements FileReader{

    @Override
    public void read() {
        System.out.println("reading Text File");
    }
}