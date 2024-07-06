package org.example.engine;

import org.example.logic.LogicFilter;
import org.example.logic.impl.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author czh
 * @description
 */
public class EngineConfig {
    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }


}
