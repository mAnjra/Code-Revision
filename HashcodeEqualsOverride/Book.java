package HashcodeEqualsOverride;

import java.util.Objects;

public class Book {
    private String name;
    private int publishingYear;

    public Book(String name, int publishingYear){
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        Book compared = (Book) object;

        if (this.publishingYear != compared.getPublishingYear()) {
            return false;
        }

        if (this.name == null || !this.name.equals(compared.getName())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() { // if the equals method deems objects to be the same, then the same hashcode numeric value is given to it.
        if(this.name == null){
            return 13;
        }
        return this.publishingYear + this.name.hashCode(); // delegates to string hashcode method adds publishing year. same name and publishing year = same numeric value = same bucket
    }
}
