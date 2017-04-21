package com.zxj.wd.util;

import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by chris on 2017/4/21.
 */
public class AjaxUtils {

    public static void rendText(HttpServletResponse response,String content)
        throws IOException
    {
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(content);
    }

    public static void  rendJson(HttpServletResponse response,boolean success,
         String message)throws IOException
    {
        JSONObject obj = new JSONObject();
        obj.put("isSuccess",success);
        obj.put("message",message);
        rendText(response,obj.toString());

    }
}
