package task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
������ �� ����������
�������� ���������, �������:
1. ��������� � ������� ����� N, ������� ������ ���� ������ 0
2. ����� ��������� N ����� � �������
3. ������� �� ����� ������������ �� ��������� N �����.


Requirements:
1. ��������� ������ ��������� ����� � ����������.
2. ��������� ������ �������� ����� �� �����.
3. � ������ ������ ���� ����� public static void main.
4. ������ ��������� ����� ������ � ����� Solution.
5. ��������� ������ �������� �� ����� ������������ �� ��������� N �����.
6. ��������� �� ������ ������ �������� �� �����, ���� N ������ ���� ����� 0.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("������� ���������� �������� �����");
        int N = Integer.parseInt(reader.readLine());
//        if (N <= 0)  {
//            throw new Exception("�������� ����� N(���������� �������� �����) ������ ����");
//        }
//        System.out.println("������� ����� (������ ����� � ����� ������)");
        int maximum = 0;
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(reader.readLine());
            if (maximum <= n) {
                maximum = n;
            }
        }
        //�������� ��� ��� ���
        if (N > 0)
            System.out.println(+maximum);
        else System.out.println();
    }
}
