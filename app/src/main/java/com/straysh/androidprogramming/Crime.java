package com.straysh.androidprogramming;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private Date mDate;
    private String mTitle;
    private boolean mIsSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    /**
     * * 日期格式化类（必须掌握）
     * API:
     * G  Era 标志符  Text  AD
     * y  年  Year  1996; 96
     * M  年中的月份  Month  July; Jul; 07
     * w  年中的周数  Number  27
     * W  月份中的周数  Number  2
     * D  年中的天数  Number  189
     * d  月份中的天数  Number  10
     * F  月份中的星期  Number  2
     * E  星期中的天数  Text  Tuesday; Tue
     * a  Am/pm 标记  Text  PM
     * H  一天中的小时数（0-23）  Number  0
     * k  一天中的小时数（1-24）  Number  24
     * K  am/pm 中的小时数（0-11）  Number  0
     * h  am/pm 中的小时数（1-12）  Number  12
     * m  小时中的分钟数  Number  30
     * s  分钟中的秒数  Number  55
     * S  毫秒数  Number  978
     * z  时区  General time zone  Pacific Standard Time; PST; GMT-08:00
     * Z  时区  RFC 822 time zone  -0800  
     * */
    public String getFormatedDate(){
//        DateFormat dateFormat2 = DateFormat.getDateTimeInstance();
//        return dateFormat2.format(mDate);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, MMM dd, yyyy", Locale.CHINA);
        return simpleDateFormat.format(mDate);
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mIsSolved;
    }

    public void setSolved(boolean solved) {
        mIsSolved = solved;
    }
}
