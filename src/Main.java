import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Note note1 = new Note("Заметка №1", LocalDate.now(),TypeOfNote.IDEAS,"Напоминание: в четверг экзамен.");
        Note note2 = new Note("Заметка №2",LocalDate.now(),TypeOfNote.IDEAS,"Мысли о улучшении программы.");

        Debt debt1 = new Debt("Должник Саша","Брал сок в долг",LocalDate.now(),TypeOfNote.DEBT,new BigDecimal("98128"));
        Debt debt2 = new Debt("Должник Миша","Покупал макароны, яйца, курицу",LocalDate.now(),TypeOfNote.DEBT,new BigDecimal("259"));

        Contacts contacts1 = new Contacts("Маша","557546790",TypeOfNumber.MOBILE,TypeOfNote.IDEAS,"Позвонить Маше в понедельник.",LocalDate.now());
        Contacts contacts2 = new Contacts("Анна","505768922",TypeOfNumber.LOCAL,TypeOfNote.IDEAS,"Скинуть Анне ДЗ",LocalDate.now());
        Contacts contacts3 = new Contacts("Анастасия","503657988",TypeOfNumber.MOBILE,TypeOfNote.DEBT,"Брала в долг",LocalDate.now());


        WriteToFile[] writeToFiles = {note1,note2,debt1,debt2,contacts1,contacts2,contacts3};
        for (WriteToFile writeToFile : writeToFiles) {
            writeToFile.createRecord();
        }
    }
}
