import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Contacts extends AbstractNote implements WriteToFile{
    private String phoneNumber;
    private String nameOfContact;
    private TypeOfNumber typeOfNumber;

    public Contacts(String nameOfContact, String phoneNumber,  TypeOfNumber typeOfNumber , TypeOfNote typeOfNote, String text, LocalDate date) {
        super(text, date, typeOfNote);
        this.phoneNumber = phoneNumber;
        this.nameOfContact = nameOfContact;
        this.typeOfNumber = typeOfNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNameOfContact() {
        return nameOfContact;
    }

    public void setNameOfContact(String nameOfContact) {
        this.nameOfContact = nameOfContact;
    }

    public TypeOfNumber getTypeOfNumber() {
        return typeOfNumber;
    }

    public void setTypeOfNumber(TypeOfNumber typeOfNumber) {
        this.typeOfNumber = typeOfNumber;
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
        return "Информация о контакте: " +" ** "+
                "Номер телефона: " + phoneNumber + " ** " +
                "Имя контакта: " + nameOfContact + " ** " +
                "Тип номера: " + typeOfNumber +" ** "+
                "Текст: " + super.getText() +" ** " +
                "Дата создания: " + super.getDate() +" ** "+
                "Тип заметки: " + super.getTypeOfNote() +" ** "+
                "\n";
    }
}
