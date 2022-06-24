package com.turing.oop.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlatformFactory {
	private static Map<String,Platform> cache = new HashMap<>();
    
    public static Platform getInstance(String platformType)
    {
        Platform p = cache.get(platformType);
        if(p == null)
        {
            switch(platformType)
            {
                case ".NET":
                    p = new DotNetPlatform();
                break;
                case "JAVA":
                    p = new JavaPlatform();
                break;
            }
            cache.put(platformType, p);
            
        }
        return p;
    }
}
