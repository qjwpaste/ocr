package com.yaxi.ocr.ocr.controller;


import com.yaxi.ocr.ocr.util.BodyInfoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class OcrInfoController {

    @Autowired
    BodyInfoUtils bodyInfoUtils;

    /**
     * 正面side=face背面side=back
     * http://localhost:8082/info?url=C:/Users/Administrator/Desktop/1.jpg&side=face
     * @param request
     * @return 身份证信息
     */
    @RequestMapping("/info")
    public String makeOcrInfo(HttpServletRequest request){
        String url = request.getParameter("url");
        String side = request.getParameter("side");
        //System.out.println(url);
        String bodyInfo = bodyInfoUtils.makeBodyInfo(url,side);
        return bodyInfo;
    }
}
