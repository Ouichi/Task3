package org.example;
import  java.util.Map;
import  java.util.ArrayList;

public class Datain {
    public String name;
    public int cm;
    public  int kg;
    //    public ArrayList<Integer> date=new ArrayList<>();
    public Map<String,ArrayList> datamap;
    public void Pow(String name,int cm,int kg,Map datamap){
        ArrayList<Integer> date=new ArrayList<>();
        date.add(cm);
        date.add(kg);
        this.datamap=datamap;
        this.datamap.put(name,date);
//        System.out.println(date.get(0));
    }
    public String getName(){
        return name;
    }
    public int getCm() {
        return cm;
    }
    public int getKg() {
        return kg;
    }
    //    public ArrayList<Integer> getDate(){
//        return date;
//    }
    public Map<String,ArrayList> getDatamap(){
        return datamap;
    }
}

