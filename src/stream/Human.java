package stream;

public class Human {
private String id = "1";
private String name;
private Integer age;
private String surname;

    public Human(String id, String name, Integer age, String surname) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }
}
