/**
 * @author czh
 * @description
 */
public abstract class AuthLink {
    private AuthLink next;
    protected String levelUserId;
    protected String level;

    public AuthLink(String levelUserId,String level){
        this.levelUserId = levelUserId;
        this.level = level;
    }

    public AuthLink appendNext(AuthLink authLink){
        this.next = authLink;
        return next;
    }

    public AuthLink next(){
        return next;
    }

    public abstract String isAuth(String uid, String uuid);
}
