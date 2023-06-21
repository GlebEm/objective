package task0526;

/* 
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address


Requirements:
1. В классе Solution создай public static класс Man.
2. В классе Solution создай public static класс Woman.
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
6. Конструкторы должны инициализировать переменные класса.
7. В методе main необходимо создать по два объекта каждого типа.
8. Метод main должен выводить созданные объекты на экран в указанном формате.*/

public class Solution {
    public static void main(String[] args) {
     Man man1 = new Man("Патрик Бэйтман",27,"Центр Манхэттена 81-ая улица, 11 этаж здания American Gardens");
     Man man2 = new Man("Александр Левин",26,"Лобня");
     Woman woman1 = new Woman("Лариса",33,"Москва");
     Woman woman2 = new Woman("Зина",26,"Териберка"); //4. Создай по два объекта каждого класса
        // со всеми данными используя конструктор.
        System.out.println(man1.name+". Возраст: "+man1.age+" лет. Проживает по адресу: "+man1.address);
        System.out.println(man2.name+". Возраст: "+man2.age+" лет. Проживает по адресу: город "+man2.address);
        System.out.println(woman1.name+". Возрастом: "+woman1.age+" лет. Проживает по адресу: город "+woman1.address);
        System.out.println(woman2.name+". Возрастом: "+woman2.age+" лет. Проживает по адресу: город "+woman2.address);
        //5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
    }


    public static class Man {  //1. Внутри класса Solution создай public static классы Man и Woman.
        String name;
        int age;
        String address; //2. У классов должны быть поля: name (String), age (int), address (String).

        public Man(String name, int age, String address) { //3. Создай конструкторы, в которые передаются все возможные параметры.
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman { //1. Внутри класса Solution создай public static классы Man и Woman.
        String name;
        int age;
        String address; //2. У классов должны быть поля: name (String), age (int), address (String).

        public Woman(String name, int age, String address) { //3. Создай конструкторы, в которые передаются все возможные параметры.
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    //напишите тут ваш код
}
