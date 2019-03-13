package com.example.android.todolist.database;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

/**
 * Created by Greta Grigutė on 2018-07-31.
 */
public class DateConverter {
    @TypeConverter
    public  static Date toDate (Long timestamp){
        return timestamp == null ? null: new Date(timestamp);
    }

    @TypeConverter
    public static Long toTimestamp (Date date){return date == null? null: date.getTime();}
}
