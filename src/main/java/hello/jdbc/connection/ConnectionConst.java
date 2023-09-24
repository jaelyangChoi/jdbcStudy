package hello.jdbc.connection;

//생성을 못하게 추상 클래스로 상수 정의
public abstract class ConnectionConst {
    public static final String URL = "jdbc:h2:tcp://localhost/~/test";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "";
}