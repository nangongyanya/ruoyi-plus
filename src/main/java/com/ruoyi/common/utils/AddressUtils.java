package com.ruoyi.common.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import com.ruoyi.common.utils.datx.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;

/**
 * 获取地址类
 * 
 * @author Rimon
 */
public class AddressUtils
{
    private static final Logger log = LoggerFactory.getLogger(AddressUtils.class);

    public static final String IP_URL = "http://ip.taobao.com/service/getIpInfo.php";

    public static String getRealAddressByIP(String ip)
    {
        String address = "";
        try
        {
            // address = HttpUtils.sendPost(IP_URL, "ip=" + ip);
            String filePath = ResourceUtils.getURL("classpath:").getPath() + "datx/17monipdb.datx";
            filePath=filePath.substring(1,filePath.length());
            City city = new City(filePath);
            String[] json=city.find(ip);
            address =json[1]+" "+json[2];
        }
        catch (Exception e)
        {
            log.error("根据IP获取所在位置----------错误消息：" + e.getMessage());
        }
        return address;
    }
}
