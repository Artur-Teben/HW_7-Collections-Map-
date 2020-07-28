package main.java.family;

import java.util.Objects;

public class Family implements Comparable<Family>{
    private final String name;
    private final String nameOfEmblem;
    private final String title;
    private int quantityMember;

    public Family(String name, String nameOfEmblem, String title, int quantityMember) {
        this.name = name;
        this.nameOfEmblem = nameOfEmblem;
        this.title = title;
        this.quantityMember = quantityMember;
    }

    public String getName() {
        return name;
    }

    public String getNameOfEmblem() {
        return nameOfEmblem;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantityMember() {
        return quantityMember;
    }

    public void setQuantityMember(int quantityMember) {
        this.quantityMember = quantityMember;
    }

    @Override
    public int compareTo(Family family) {
        return name.compareTo(family.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return quantityMember == family.quantityMember &&
                Objects.equals(name, family.name) &&
                Objects.equals(nameOfEmblem, family.nameOfEmblem) &&
                Objects.equals(title, family.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nameOfEmblem, title, quantityMember);
    }

    @Override
    public String toString() {
        String formName = String.format("Name = %-11s", name);
        String formNameOfEmblem = String.format("Name of emblem = %-50s", nameOfEmblem);
        String formTitle = String.format("Title = %-34s", title);
        String formQuantityMember = String.format("Quantity of membes = %-2s", quantityMember);
        return "house: [ " +
                 formName +
                "| " + formNameOfEmblem +
                "| " + formTitle +
                "| " + formQuantityMember +
                "]";
    }
}
