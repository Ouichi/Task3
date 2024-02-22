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
            System.out.println("名前："+key+"\n"+"身長："+datamap.get(key).get(0)+"  体重："+datamap.get(key).get(1)+"\n");
        }

        System.out.println("検索する名前を入力してください");
        String searchname = scanner.nextLine();
        if (datamap.containsKey(searchname)){
            System.out.println(searchname+"の身長："+datamap.get(searchname).get(0)+"  体重："+datamap.get(searchname).get(1)+"\n");
        }
        else{
            System.out.println(searchname+"のデータはありません");
        }

    }
}