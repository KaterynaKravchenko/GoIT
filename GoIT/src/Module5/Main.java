package Module5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(a == b);

        //equals is used to compare objects  // == // equals
        // Object e1 = new Employee(); - теряет методы родителя Employee, можно применять к интерфейса и абстрактным классам
        Employee e1 = new Employee();
        e1.setId(101);
        Employee e2 = new Employee();
        e2.setId(101);

        //System.out.println(e1 == e2); wrong!!
        System.out.println(e1.equals(e2));
        //Печатает 'true'
        //hashcode - значение(число), которое высчитывается на основании содержания ячейки; исп.для структуры данных
        //если по equals объекты равны, значит и по hashcode тоже равны. обратно - нет.
        //если переопределяем equals, то и hashcode нужно переопределять
        //e1.setId(100);
        //e2.setId(100);

        Set employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        //Печатает два объекта
        System.out.println(employees);
    }
}
