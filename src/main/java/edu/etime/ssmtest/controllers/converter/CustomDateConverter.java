package edu.etime.ssmtest.controllers.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 参数绑定 字符串日期类型转换器
 *
 * @author yjh
 * @date 2019/10/18 9:28
 **/

public class CustomDateConverter implements Converter<String, Date> {

    public Date convert(String s) {
        //实现将日期串转换成日期类型 格式为（格式是yy-MM-dd）
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");

        try {
            //直接返回转换过后的日期类型
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //如果转换失败则返回null
        return null;
    }
}
