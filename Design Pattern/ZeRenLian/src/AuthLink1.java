import sun.security.krb5.internal.rcache.AuthList;

import java.util.Date;

/**
 * @author czh
 * @description
 */
public class AuthLink1 extends AuthLink {
    public AuthLink1(String levelUserId,String level){
        super(levelUserId,level);
    }

    @Override
    public String isAuth(String uid, String uuid) {
        Date info = AuthService.queryAuthInfo(levelUserId,uuid);
        if(info==null){
            return "等待1级别审批";
        }
        return "审批完成";
    }
}
