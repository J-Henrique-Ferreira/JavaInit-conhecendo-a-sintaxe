package Java.Domain.Models;

import Java.Domain.Contracts.InfosMedia;

public class Audio implements InfosMedia {
    private String name;
    private String duration;
    private String createdAt;
    private String category;

    public Audio(String name, String duration, String createdAt, String category) {
        this.name = name;
        this.duration = duration;
        this.createdAt = createdAt;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String showInfo() {
        return "infos de audio padrao";
    }
}
