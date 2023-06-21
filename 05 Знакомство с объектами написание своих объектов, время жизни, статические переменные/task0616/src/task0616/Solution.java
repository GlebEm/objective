package task0616;

/* 
Минимальное число статиков
Расставь минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась.


Requirements:
1. Реализацию и модификаторы доступа методов менять нельзя.
2. Добавь модификаторы static в нужные места.
3. В программе должно быть только 4 модификатора static.
4. Программа должна выводить текст на экран.*/

public class Solution {
    public static int step; //1

    public static void main(String[] args) { //2
        method1();
    }

    public static void method1() { //3
        method2();
    }

    public static void method2() { //4
        new Solution().method3();
    }

    public void method3() {
        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
        if (step > 1) {
            return;
        }
        main(null);
    }
}
