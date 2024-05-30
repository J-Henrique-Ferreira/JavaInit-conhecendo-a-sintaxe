package Java.Domain.Models;

public class Music extends Audio  {
    private String author;
    private String recordCompany;

    public Music(String name, String duration, String createdAt, String category, String author,
            String recordCompany) {
        super(name, duration, createdAt, category);
        this.author = author;
        this.recordCompany = recordCompany;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRecordCompany() {
        return recordCompany;
    }

    public void setRecordCompany(String recordCompany) {
        this.recordCompany = recordCompany;
    }
    
    @Override
    public String showInfo() {
        String infos = "Name: " + getName() + "\n" + "CreatedAt: " + getCreatedAt() + "\n";
        infos += "Duration: " + getDuration() + "\n";
        infos += "Category: " + getCategory() + "\n";
        infos += "Record Company: " + getCategory() + "\n";
        infos += "Author: " + getAuthor() + "\n";

        return infos;
    }
}