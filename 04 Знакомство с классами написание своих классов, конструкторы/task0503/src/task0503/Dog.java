package task0503;


/* 
������� � ������� ��� ������ Dog
������� class Dog. � ������ ������ ���� ������ String name � ������� int age.
������ ������� � ������� ��� ���� ���������� ������ Dog.


Requirements:
1. ��������� �� ������ ��������� ������ � ����������.
2. � ������ Dog ������ ���� ���������� name � ����� String.
3. � ������ Dog ������ ���� ���������� age � ����� int.
4. � ������ ������ ���� ������ ��� ���������� name.
5. � ������ ������ ���� ������ ��� ���������� name.
6. � ������ ������ ���� ������ ��� ���������� age.
7. � ������ ������ ���� ������ ��� ���������� age.*/

public class Dog {
    private String name;
    private int age;

    public void setName(String dogName) {
        name = dogName;
    }
    public String getName() {
        return name;
    }
    public void setAge(int dogAge) {
        age = dogAge;
    }
    public int getAge() {
        return age;
    }
    //�������� ��� ��� ���

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("������");
        dog1.setAge(6);
        System.out.println("ϸ� "+ dog1.getName() + ". ������� " +dog1.getAge()+" ���.");
    }
}
