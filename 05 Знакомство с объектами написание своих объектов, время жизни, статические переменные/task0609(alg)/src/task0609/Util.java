package task0609;

/* 
Расстояние между двумя точками
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.


Requirements:
1. Метод getDistance должен возвращать double.
2. Метод getDistance должен быть статическим.
3. Метод getDistance должен быть public.
4. Метод getDistance должен возвращать расстояние между точками.
5. Метод getDistance должен использовать метод double Math.sqrt(double a).*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) { //1. Метод getDistance должен возвращать double.2. Метод getDistance должен быть статическим.3. Метод getDistance должен быть public.
      double a1 =x1;
      double b1=y1;
      double a2 = x2;
      double b2 = y2;
      double result = Math.sqrt((Math.pow((a1-a2),2))+(Math.pow((b1-b2),2))); // d = √ (x1 - х2)^2 + (у1 - у2)^2
      return result; //напишите тут ваш код
    }

    public static void main(String[] args) {
    double g = getDistance(5,1,5,2);
        System.out.println(g);
    }
}
