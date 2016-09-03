package Class.OOP.ExampleHW;

public class Main {
    public static void main(String[] args) {
        String[] phones = {"iPhone", "HTC", "Lenovo"};//создаем массив со значениями
        Users user = new Users(phones); // добавление через конструктор массива значений в класс Юзер
        System.out.println(user.getModels());

        //user.setPhones(phones); //добавление через сеттер массива значений в класс Юзер
    }
}
