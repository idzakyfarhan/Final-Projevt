package Login;

public class Welcome <T>{ //generic
    T statement;
    Welcome (T statement) {
        this.statement = statement;
    }
    public T getStatement () {
        return this.statement;
    }
}
