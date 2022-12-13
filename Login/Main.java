package Login;



public class Main {

    public static void main(String[] args) {
        IDandPassword idandPassword = new IDandPassword();
        LoginPage loginPage = new LoginPage(idandPassword.getLoginInfo());

        Welcome<String> iStatement = new Welcome<>("Welcome to Steam");
        System.out.println(iStatement.getStatement());
    }



}