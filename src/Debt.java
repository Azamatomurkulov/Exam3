import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Debt extends Note implements WriteToFile{
    private BigDecimal debt;

    public Debt(String headLine,String text, LocalDate date, TypeOfNote typeOfNote,  BigDecimal debt) {
        super(text, date, typeOfNote, headLine);
        this.debt = debt;
    }

    public BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(BigDecimal debt) {
        this.debt = debt;
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
        return "Заметка: " +
                "Заголовок: " + super.getHeadLine() + " ** " +
                "Текст: " + super.getText() + " ** " +
                "Дата создания: " + super.getDate() +" ** "+
                "Тип заметки: " + super.getTypeOfNote() +" ** "+
                "Сумма долга: " + debt +
                "\n";
    }
}
