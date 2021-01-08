package com.miao.springmvc.convert;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author miaoyin
 * @date 2021/1/7 - 22:28
 * @commet:
 */
public class DataConvert implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if (s != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

            try {
                return simpleDateFormat.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
