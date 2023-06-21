package task0502;

/* 
����������� ����� fight
�������� ����� boolean fight(Cat anotherCat):
�������� �������� ����� ����� � ����������� �� �� ����, �������� � ����.
������ ������ �������� �� �����������, ����� ����������� ��� ���, � ���� ���� ������ ���������� �� ����������� ���������.
����� ������ ����������, �������� �� �� (this) ��� ��� ���, �.�. ���������� true, ���� �������� � false - ���� ���������.
���� ����� � ����� �� �������, ���������� false.


Requirements:
1. ����� Cat ������ ��������� ����������� ��� ����������.
2. ����� Cat ������ ��������� ����� ��� ����: age, weight � strength. ���� ������ ���� ���������.
3. � ������ Cat ������ ���� ����� fight.
4. � ������ fight ����������� �������� ����� ����� � ����������� �� �� ����, �������� � ���� �������� �������.
5. ����� ������ ���������� ���� � ���� ��������, ���� �� ������� � ����� � ��� �� �����.
6. ���� ����� ���1 ���������� � ���� ���2, �� ���2 ������ ����������� ���� ���1.*/

public class Cat {
    public int age;
    public int weight;
    public int strength; //2. ����� Cat ������ ��������� ����� ��� ����: age, weight � strength. ���� ������ ���� ���������.

    public Cat() {  //1. ����� Cat ������ ��������� ����������� ��� ����������.
    }

    public boolean fight(Cat anotherCat) { //3. � ������ Cat ������ ���� ����� fight.
        int cat1count = 0;
        int cat2count = 0;
        if (this.age > anotherCat.age) {
            cat1count++;
        }
        if (anotherCat.age > this.age) {
            cat2count++;
        }

        if (this.weight > anotherCat.weight) {
            cat1count++;
        }
        if (anotherCat.weight > this.weight) {
            cat2count++;
        }
        if (this.strength > anotherCat.strength) {
            cat1count++;
        }
        if (anotherCat.strength > this.strength) {
            cat2count++;
        }

        if (cat1count > cat2count) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.age = 4;
        cat1.weight = 4;
        cat1.strength = 3;
        cat2.age = 3;
        cat2.weight = 3;
        cat2.strength = 3;
         System.out.println(cat1.fight(cat2));
        if (cat1.fight(cat2)) {
            System.out.println("������ ��� �������! ������ ��� ��������");
        } else if (!cat1.fight(cat2))
            System.out.println("����� ��� ������ ��� �������!");
    }
}
