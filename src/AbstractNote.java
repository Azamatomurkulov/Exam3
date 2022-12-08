import java.time.LocalDate;

public abstract class AbstractNote {
    private String text;
    private LocalDate date;
    private TypeOfNote typeOfNote;

    public AbstractNote(){

    }

    public AbstractNote(String text, LocalDate date, TypeOfNote typeOfNote) {
        this.text = text;
        this.date = date;
        this.typeOfNote = typeOfNote;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TypeOfNote getTypeOfNote() {
        return typeOfNote;
    }

    public void setTypeOfNote(TypeOfNote typeOfNote) {
        this.typeOfNote = typeOfNote;
    }

    @Override
    public String toString() {
        return "AbstractNote{" +
                "text='" + text + '\'' +
                ", date=" + date +
                ", typeOfNote=" + typeOfNote +
                '}';
    }
}

