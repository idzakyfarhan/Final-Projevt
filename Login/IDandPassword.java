package Login;

import java.util.HashMap;

public class IDandPassword<T> {
    private String name;

    public String getName(){
        return name;
    }

    public String setName(String newName) {
        this.name = newName;
        return newName;
    }

    String[] nama = {"Ecky","John","Hai"};


    HashMap<String,String> logininfo = new HashMap<String,String>(); //Collections using hashmap

    IDandPassword(){
        logininfo.put(nama[0],"312");
        logininfo.put("Jeje","213");
        logininfo.put("Eric","123");
        logininfo.put("kayla","ugly");
        logininfo.put(setName("Arya"),"123"); //encapsulation


        //exception handling
        try {
            logininfo.put(nama[5],"12345"); //array

        } catch (Exception e){
            System.out.println("Not in the following index");
        }

    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }






}
