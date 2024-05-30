package Java.Domain.Models;

import java.util.ArrayList;

public class PodCast extends Audio {
    private String organizationName;
    private ArrayList<String> authors;

    public PodCast(String name, String duration, String createdAt, String category, ArrayList<String> authors, String organizationName) {
        super(name, duration, createdAt, category);
        this.organizationName = organizationName;
        this.authors = authors;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getAuthors() {
        StringBuilder names = new StringBuilder();
        for (String author : authors) {
            names.append(author);
        }
        return names.toString();
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    @Override
    public String showInfo() {
        String infos = "Name: " + getName() + "\n" + "CreatedAt: " + getCreatedAt() + "\n";
        infos += "Duration: " + getDuration() + "\n";
        infos += "Category: " + getCategory() + "\n";
        infos += "Authors: " + getAuthors() + "\n";

        return infos;
    }
}
