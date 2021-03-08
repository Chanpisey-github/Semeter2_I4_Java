package tp09.Ex1;

public class Group {
    private String name;// A, B, ...
    private String description;// Good students

    public Group(String name) {
        this.name = name;
        description = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name;
    }
}
