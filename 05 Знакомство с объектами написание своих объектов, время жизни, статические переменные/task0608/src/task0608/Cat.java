package task0608;

/* 
Статические методы для кошек
Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
с помощью которых можно получить/изменить количество котов (переменную catCount).


Requirements:
1. Добавь в класс метод getCatCount.
2. Метод getCatCount должен возвращать int.
3. Метод getCatCount должен возвращать значение переменной catCount.
4. Добавь в класс метод setCatCount, принимающий int.
5. Метод setCatCount ничего не должен возвращать.
6. Метод setCatCount должен присваивать переменной catCount переданное значение.*/

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() { //1. Добавь в класс метод getCatCount.
       return Cat.catCount; //3. Метод getCatCount должен возвращать значение переменной catCount.
       //напишите тут ваш код
    }
    public static void setCatCount(int catCount) { //5. Метод setCatCount ничего не должен возвращать. 4. Добавь в класс метод setCatCount, принимающий int.
        Cat.catCount = catCount; //6. Метод setCatCount должен присваивать переменной catCount переданное значение.*/
        //напишите тут ваш код
    }
    public static void main(String[] args) {
        setCatCount(9);
        int n = getCatCount();
        System.out.println(n);
    }
}
