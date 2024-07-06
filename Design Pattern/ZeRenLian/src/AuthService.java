import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author czh
 * @description
 */
public class AuthService {
    private static Map<String, Date> map = new ConcurrentHashMap<>();

    public static Date queryAuthInfo(String uid, String uuid){
        return map.get(uid.concat(uuid));
    }

    public static void auth(String uid, String uuid){
        map.put(uid.concat(uuid),new Date());
    }
}
