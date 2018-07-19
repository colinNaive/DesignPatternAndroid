package com.ctrip.designpatternapplication.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhenhua on 2018/7/17.
 * @email zhshan@ctrip.com ^.^
 */
public class SingleTonManager {

    private SingleTonManager() {

    }

    private static Map<String, Object> objectMap = new HashMap<>();

    public static void registerService(String key, Object object) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, object);
        }
    }

    public static Object getService(String key) {
        return objectMap.get(key);
    }
}
