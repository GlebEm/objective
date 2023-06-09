package task0517;

/* 
������������ �������
������� ����� Cat (���) � ����� ��������������:
- ���,
- ���, ���, �������
- ���, ������� (��� �����������)
- ���, ����, (���, ����� � ������� - �����������. ��� - ���������)
- ���, ����, ����� (����� �������� ���)

������ ������������ - ������� ������ ��������.
��������, ���� ��� �� ��������, �� ����� ������� �����-������ ������� ���.
��� �� ����� ������ �� ������.
�� �� ���������� ��������. � ��� ����� ����� � �� ���� (null). �� �� �������� ������: null.


Requirements:
1. � ������ Cat ������ ���� ���������� name � ����� String.
2. � ������ Cat ������ ���� ���������� age � ����� int.
3. � ������ Cat ������ ���� ���������� weight � ����� int.
4. � ������ Cat ������ ���� ���������� address � ����� String.
5. � ������ Cat ������ ���� ���������� color � ����� String.
6. � ������ ������ ���� �����������, ����������� � �������� ��������� ���, �� ���������������� ��� ���������� ������, ����� ������.
7. � ������ ������ ���� �����������, ����������� � �������� ���������� ���, ���, ������� � ���������������� ��� ���������� ������, ����� ������.
8. � ������ ������ ���� �����������, ����������� � �������� ���������� ���, ������� � ���������������� ��� ���������� ������, ����� ������.
9. � ������ ������ ���� �����������, ����������� � �������� ���������� ���, ���� � ���������������� ��� ���������� ������, ����� ����� � ������.
10. � ������ ������ ���� �����������, ����������� � �������� ���������� ���, ����, ����� � ���������������� ��� ���������� ������, ����� �����.*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public Cat(String name) {    //6. � ������ ������ ���� �����������, ����������� � �������� ��������� ���, �� ���������������� ��� ���������� ������, ����� ������.
        this.name = name;
        this.age = 6;
        this.weight = 5;
        this.address = null;
        this.color = "���� ��������������������� ����";
        System.out.println("������ �����������");
    }

    public Cat(String name, int weight, int age) { //7. � ������ ������ ���� �����������, ����������� � �������� ���������� ���, ���, ������� � ���������������� ��� ���������� ������, ����� ������.
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address = null;
        this.color = "���� ��������������������� ����";
        System.out.println("������ �����������");
    }

    public Cat(String name, int age) { //8. � ������ ������ ���� �����������, ����������� � �������� ���������� ���, ������� � ���������������� ��� ���������� ������, ����� ������.
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.address = null;
        this.color = "���� ��������������������� ����";
        System.out.println("������ �����������.");
    }

    public Cat(int weight, String color) { //9. � ������ ������ ���� �����������, ����������� � �������� ���������� ���, ���� � ���������������� ��� ���������� ������, ����� ����� � ������.
        this.weight = weight;
        this.color = color;
        this.address = null;
        this.name = null;
        this.age = 6;
        System.out.println("��������� �����������. ��������� ��������");
    }

    public Cat(int weight, String color, String address) { //10. � ������ ������ ���� �����������, ����������� � �������� ���������� ���, ����, ����� � ���������������� ��� ���������� ������, ����� �����.
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.name = null;
        this.age = 6;
        System.out.println("����� �����������. ����� �������� ��� �������� ��������");
    }

    //�������� ��� ��� ���
    public static void main(String[] args) {
        Cat cat1 = new Cat("����");
        System.out.println("��� �� �����: "+cat1.name+"\n"+"���������: "
                +cat1.age+" ���."+"\n"+"�����: "+cat1.weight+" ��."+"\n"+
                "����������� �� ������: "+cat1.address+"\n"+"�����: "+cat1.color);
    }
}
