package com.git.test;

import java.util.Map;

public class GitDemo {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("11","test1");
        jsonObject.put("22","test2");
        String toJSONString = jsonObject.toJSONString();
        Map<String,Object> jsVersionMap  = JSONObject.parseObject(toJSONString);
        System.out.println(JSONUtil.toJsonStr(jsVersionMap));
    }
}
