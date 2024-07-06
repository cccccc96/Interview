import java.util.Date;

/**
 * @author czh
 * @description
 */
public class AuthLink2 extends AuthLink {
    public AuthLink2(String levelUserId, String level){
        super(levelUserId,level);
    }

    @Override
    public String isAuth(String uid, String uuid) {
        Date info = AuthService.queryAuthInfo(levelUserId,uuid);
        if(info==null){
            return "等待2级别审批";
        }
        return next().isAuth(levelUserId,uuid);
    }
}
