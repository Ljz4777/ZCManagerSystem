package com.neusoft.mapping;

import java.util.HashMap;
import java.util.Map;

public class MappingFactory {

    public static final String GUESTBOOK_MAPPING = "guestbook";

    private static MappingFactory mappingFactory = null;

    private Map<String,EntityMapping> maps = new HashMap();

    private MappingFactory(){}

    public static MappingFactory getInstance(){
        if(mappingFactory == null){
            mappingFactory = new MappingFactory();
            //向Map集合中添加元素
            mappingFactory.maps.put(GUESTBOOK_MAPPING,new GuestbookMapping());
            //mappingFactory.maps.put();
        }
        return mappingFactory;
    }

    /**
     * 从集合当中根据key来获取元素
     */
    public EntityMapping getMapping(String key){
        return maps.get(key);
    }

}
