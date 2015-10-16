package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by chentao on 15-10-16.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    /**
     * Province 表建表语句
     */
    public static final String CREATE_PROVINCE = "create tabel Province("
            + "id integer primary key autoincreament, "
            + "province_name text, "
            + "province_code text)";

    /**
     * City建表语句
     */
    public static final String CREATE_CITY = "creat table City("
            +"id integer primary key autoincrement,"
            +"city_name text,"
            +"city_code text,"
            +"province_id integer)";

    /**
     * County 表建表语句
     */
    public static final String CREATE_COUNTY = "creat tabel County("
            +"id integer primary key autoincrement,"
            +"county_name text,"
            +"county_code text,"
            +"city_id integer)";

    public CoolWeatherOpenHelper(Context context,String name,SQLiteDatabase.CursorFactory factory,
                                 int version) {
        super(context,name,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);  //创建Province表
        db.execSQL(CREATE_CITY);  //创建City表
        db.execSQL(CREATE_COUNTY); //创建County表
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion) {

    }
}
