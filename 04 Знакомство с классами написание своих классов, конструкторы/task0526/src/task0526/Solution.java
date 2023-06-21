package task0526;

/* 
1. ������ ������ Solution ������ public static ������ Man � Woman.
2. � ������� ������ ���� ����: name (String), age (int), address (String).
3. ������ ������������, � ������� ���������� ��� ��������� ���������.
4. ������ �� ��� ������� ������� ������ �� ����� ������� ��������� �����������.
5. ������� ������ �� ����� � ����� �������: name + " " + age + " " + address


Requirements:
1. � ������ Solution ������ public static ����� Man.
2. � ������ Solution ������ public static ����� Woman.
3. ����� Man ������ ��������� ����������: name(String), age(int) � address(String).
4. ����� Woman ������ ��������� ����������: name(String), age(int) � address(String).
5. � ������� Man � Woman ������ ���� ������������, ����������� ��������� � ������ String, int � String.
6. ������������ ������ ���������������� ���������� ������.
7. � ������ main ���������� ������� �� ��� ������� ������� ����.
8. ����� main ������ �������� ��������� ������� �� ����� � ��������� �������.*/

public class Solution {
    public static void main(String[] args) {
     Man man1 = new Man("������ �������",27,"����� ���������� 81-�� �����, 11 ���� ������ American Gardens");
     Man man2 = new Man("��������� �����",26,"�����");
     Woman woman1 = new Woman("������",33,"������");
     Woman woman2 = new Woman("����",26,"���������"); //4. ������ �� ��� ������� ������� ������
        // �� ����� ������� ��������� �����������.
        System.out.println(man1.name+". �������: "+man1.age+" ���. ��������� �� ������: "+man1.address);
        System.out.println(man2.name+". �������: "+man2.age+" ���. ��������� �� ������: ����� "+man2.address);
        System.out.println(woman1.name+". ���������: "+woman1.age+" ���. ��������� �� ������: ����� "+woman1.address);
        System.out.println(woman2.name+". ���������: "+woman2.age+" ���. ��������� �� ������: ����� "+woman2.address);
        //5. ������� ������ �� ����� � ����� �������: name + " " + age + " " + address
    }


    public static class Man {  //1. ������ ������ Solution ������ public static ������ Man � Woman.
        String name;
        int age;
        String address; //2. � ������� ������ ���� ����: name (String), age (int), address (String).

        public Man(String name, int age, String address) { //3. ������ ������������, � ������� ���������� ��� ��������� ���������.
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman { //1. ������ ������ Solution ������ public static ������ Man � Woman.
        String name;
        int age;
        String address; //2. � ������� ������ ���� ����: name (String), age (int), address (String).

        public Woman(String name, int age, String address) { //3. ������ ������������, � ������� ���������� ��� ��������� ���������.
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    //�������� ��� ��� ���
}
