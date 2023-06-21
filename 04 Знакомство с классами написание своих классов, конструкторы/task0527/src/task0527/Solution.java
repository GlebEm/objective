package task0527;

/* 
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.


Requirements:
1. Создай класс Dog.
2. Создай класс Cat.
3. В классе Dog должно быть три переменные.
4. В классе Cat должно быть три переменные.
5. Должен быть создан хотя бы один объект типа Mouse.
6. Должен быть создан хотя бы один объект типа Dog.
7. Должен быть создан хотя бы один объект типа Cat.*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5); //5. Должен быть создан хотя бы один объект типа Mouse.
        Mouse taffiMouse = new Mouse("Taffi", 10, 4);
        Dog spikeDog = new Dog("Spike", 56, 16); //6. Должен быть создан хотя бы один объект типа Dog.
        Dog tikeDog = new Dog("TikeSpikeSon", 14, 1);
        Cat tomCat = new Cat("Tom", 36, 20);
        Cat toodlzCat = new Cat("Toodlz", 32, 16); //7. Должен быть создан хотя бы один объект типа Cat.
        Cat bootchCat = new Cat("Bootch", 38, 22);
        System.out.println(toodlzCat.height);//напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog { //2. Создай класс Dog.
        String name;
        int height;
        int tail; //3. В классе Dog должно быть три переменные.

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat { //2. Создай класс Cat.
        String name;
        int height;
        int tail; //4. В классе Cat должно быть три переменные.

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
