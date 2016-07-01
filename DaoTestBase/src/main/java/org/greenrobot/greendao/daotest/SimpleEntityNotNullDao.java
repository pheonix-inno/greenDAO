package org.greenrobot.greendao.daotest;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SIMPLE_ENTITY_NOT_NULL".
*/
public class SimpleEntityNotNullDao extends AbstractDao<SimpleEntityNotNull, Long> {

    public static final String TABLENAME = "SIMPLE_ENTITY_NOT_NULL";

    /**
     * Properties of entity SimpleEntityNotNull.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property SimpleBoolean = new Property(1, boolean.class, "simpleBoolean", false, "SIMPLE_BOOLEAN");
        public final static Property SimpleByte = new Property(2, byte.class, "simpleByte", false, "SIMPLE_BYTE");
        public final static Property SimpleShort = new Property(3, short.class, "simpleShort", false, "SIMPLE_SHORT");
        public final static Property SimpleInt = new Property(4, int.class, "simpleInt", false, "SIMPLE_INT");
        public final static Property SimpleLong = new Property(5, long.class, "simpleLong", false, "SIMPLE_LONG");
        public final static Property SimpleFloat = new Property(6, float.class, "simpleFloat", false, "SIMPLE_FLOAT");
        public final static Property SimpleDouble = new Property(7, double.class, "simpleDouble", false, "SIMPLE_DOUBLE");
        public final static Property SimpleString = new Property(8, String.class, "simpleString", false, "SIMPLE_STRING");
        public final static Property SimpleByteArray = new Property(9, byte[].class, "simpleByteArray", false, "SIMPLE_BYTE_ARRAY");
    };


    public SimpleEntityNotNullDao(DaoConfig config) {
        super(config);
    }
    
    public SimpleEntityNotNullDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SIMPLE_ENTITY_NOT_NULL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"SIMPLE_BOOLEAN\" INTEGER NOT NULL ," + // 1: simpleBoolean
                "\"SIMPLE_BYTE\" INTEGER NOT NULL ," + // 2: simpleByte
                "\"SIMPLE_SHORT\" INTEGER NOT NULL ," + // 3: simpleShort
                "\"SIMPLE_INT\" INTEGER NOT NULL ," + // 4: simpleInt
                "\"SIMPLE_LONG\" INTEGER NOT NULL ," + // 5: simpleLong
                "\"SIMPLE_FLOAT\" REAL NOT NULL ," + // 6: simpleFloat
                "\"SIMPLE_DOUBLE\" REAL NOT NULL ," + // 7: simpleDouble
                "\"SIMPLE_STRING\" TEXT NOT NULL ," + // 8: simpleString
                "\"SIMPLE_BYTE_ARRAY\" BLOB NOT NULL );"); // 9: simpleByteArray
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SIMPLE_ENTITY_NOT_NULL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SimpleEntityNotNull entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindLong(2, entity.getSimpleBoolean() ? 1L: 0L);
        stmt.bindLong(3, entity.getSimpleByte());
        stmt.bindLong(4, entity.getSimpleShort());
        stmt.bindLong(5, entity.getSimpleInt());
        stmt.bindLong(6, entity.getSimpleLong());
        stmt.bindDouble(7, entity.getSimpleFloat());
        stmt.bindDouble(8, entity.getSimpleDouble());
        stmt.bindString(9, entity.getSimpleString());
        stmt.bindBlob(10, entity.getSimpleByteArray());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, SimpleEntityNotNull entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindLong(2, entity.getSimpleBoolean() ? 1L: 0L);
        stmt.bindLong(3, entity.getSimpleByte());
        stmt.bindLong(4, entity.getSimpleShort());
        stmt.bindLong(5, entity.getSimpleInt());
        stmt.bindLong(6, entity.getSimpleLong());
        stmt.bindDouble(7, entity.getSimpleFloat());
        stmt.bindDouble(8, entity.getSimpleDouble());
        stmt.bindString(9, entity.getSimpleString());
        stmt.bindBlob(10, entity.getSimpleByteArray());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public SimpleEntityNotNull readEntity(Cursor cursor, int offset) {
        SimpleEntityNotNull entity = new SimpleEntityNotNull( //
            cursor.getLong(offset + 0), // id
            cursor.getShort(offset + 1) != 0, // simpleBoolean
            (byte) cursor.getShort(offset + 2), // simpleByte
            cursor.getShort(offset + 3), // simpleShort
            cursor.getInt(offset + 4), // simpleInt
            cursor.getLong(offset + 5), // simpleLong
            cursor.getFloat(offset + 6), // simpleFloat
            cursor.getDouble(offset + 7), // simpleDouble
            cursor.getString(offset + 8), // simpleString
            cursor.getBlob(offset + 9) // simpleByteArray
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SimpleEntityNotNull entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setSimpleBoolean(cursor.getShort(offset + 1) != 0);
        entity.setSimpleByte((byte) cursor.getShort(offset + 2));
        entity.setSimpleShort(cursor.getShort(offset + 3));
        entity.setSimpleInt(cursor.getInt(offset + 4));
        entity.setSimpleLong(cursor.getLong(offset + 5));
        entity.setSimpleFloat(cursor.getFloat(offset + 6));
        entity.setSimpleDouble(cursor.getDouble(offset + 7));
        entity.setSimpleString(cursor.getString(offset + 8));
        entity.setSimpleByteArray(cursor.getBlob(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(SimpleEntityNotNull entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(SimpleEntityNotNull entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
