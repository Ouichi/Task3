package org.example;
import  java.util.HashMap;
import  java.util.Map;
import  java.util.ArrayList;
import  java.util.List;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String,ArrayList> datamap= new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Datain number1=new Datain();

        number1.Pow("koko",177,83,datamap);
        number1.Pow("pupuru",158,50,datamap);
        number1.Pow("buta",168,75,datamap);

        for(var name:datamap.entrySet()){
            String key=name.getKey();
            System.out.println("���O�F"+key+"\n"+"�g���F"+datamap.get(key).get(0)+"  �̏d�F"+datamap.get(key).get(1)+"\n");
        }

        System.out.println("�������閼�O����͂��Ă�������");
        String searchname = scanner.nextLine();
        if (datamap.containsKey(searchname)){
            System.out.println(searchname+"�̐g���F"+datamap.get(searchname).get(0)+"  �̏d�F"+datamap.get(searchname).get(1)+"\n");
        }
        else{
            System.out.println(searchname+"�̃f�[�^�͂���܂���");
        }

    }
}