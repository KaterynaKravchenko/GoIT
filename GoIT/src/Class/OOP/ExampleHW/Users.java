package Class.OOP.ExampleHW;

public class Users {
    private String[] phones;
    private String[] models;

    public String[] getModels() {
        if(phones[0] == "iPhone"){
            return phones;
        }
        return models;
    }

    public Users(String[] phones) {
        this.phones = phones;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }
}
