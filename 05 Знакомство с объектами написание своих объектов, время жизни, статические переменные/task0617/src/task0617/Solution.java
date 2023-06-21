package task0617;

/* 
������� ��� ����� ����
1. � ������ Solution ������� public static ����� Idea.
2. � ������ Idea ������� ����� public String getDescription(), ������� ����� ���������� ����� ������.
3. � ������ Solution ������ ����������� ����� public void printIdea(Idea idea), ������� ����� �������� �� ����� �������� ���� - ��� ��, ��� ���������� ����� getDescription().


Requirements:
1. � ������ Solution ������� public static ����� Idea.
2. � ������ Idea ������� ����� public String getDescription().
3. ����� getDescription ������ ���������� ����� ������.
4. � ������ Solution ������ ����� public static void printIdea(Idea idea).
5. ����� printIdea ������ �������� �������� ���� �� �����.*/

public class Solution {

    public static void printIdea(Idea idea) { //4. � ������ Solution ������ ����� public static void printIdea(Idea idea).
        System.out.println(idea.getDescription());
    }

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    //�������� ��� ��� ���
    public static class Idea {//1. � ������ Solution ������� public static ����� Idea.

        public String getDescription() { //2. � ������ Idea ������� ����� public String getDescription().
            return "�� ����, ����� ����"; //3. ����� getDescription ������ ���������� ����� ������.
        }

    }
}
