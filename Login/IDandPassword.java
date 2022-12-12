package Login;

import java.util.HashMap;

public class IDandPassword {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPassword(){
        logininfo.put("Ecky","Ganteng");
        logininfo.put("Ecky1","Gantengbgt");
        logininfo.put("Ecky2","Gantengdeh");
        logininfo.put("123","123");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }






}
