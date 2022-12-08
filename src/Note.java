import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Note extends AbstractNote implements WriteToFile {
    private String headLine;


    public Note(String headLine,LocalDate date, TypeOfNote typeOfNote, String text) {
        super(text, date, typeOfNote);
        this.headLine = headLine;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    @Override
    public void createRecord() {
        try {
            FileWriter fileWriter = new FileWriter("NoteBook.txt",true);
            fileWriter.write(this.toString());
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Заметка: "+" ** "+
                "Тип заметки: "+ super.getTypeOfNote() +" ** "+
                "Заголовок: " + headLine + " ** "+
                "Текст: " + super.getText() + " ** " +
                "Дата создания: " + super.getDate() +
                "\n";
    }
}