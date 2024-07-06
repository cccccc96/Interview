/**
 * @author czh
 * @description
 */
public class Main {
    public static void main(String[] args) {
        AuthLink authLink = new AuthLink3("1000013", "王工");
        authLink.appendNext(new AuthLink2("1000012", "张经理"))
                        .appendNext(new AuthLink1("1000011", "段总"));

        System.out.println(authLink.isAuth("wo","1"));
        AuthService.auth("1000013","1");

        System.out.println(authLink.isAuth("wo","1"));
        AuthService.auth("1000012","1");

        System.out.println(authLink.isAuth("wo","1"));
        AuthService.auth("1000011","1");

        System.out.println(authLink.isAuth("wo","1"));

    }
}
