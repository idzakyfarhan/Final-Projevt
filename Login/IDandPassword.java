package Login;

import java.util.HashMap;

public class IDandPassword<T> {
    String[] nama = {"Ecky","John","Hai"};
    HashMap<String,String> logininfo = new HashMap<String,String>(); //Collections using hashmap

    IDandPassword(){
        logininfo.put(nama[0],"312");
        logininfo.put("Ecky","213");
        logininfo.put("123","123");


        ///exception handling
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
