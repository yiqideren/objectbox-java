
package io.objectbox;

// Copied from generated tests (& removed some unused Properties)

/**
 * Properties for entity "TestEntity". Can be used for QueryBuilder and for referencing DB names.
 */
public class TestEntityProperties implements Properties {

    public static final String __NAME_IN_DB = "TestEntity";

    public final static Property Id = new Property(0, long.class, "id", true, "id");
    public final static Property SimpleInt = new Property(1, int.class, "simpleInt", false, "simpleInt");
    public final static Property SimpleShort = new Property(2, short.class, "simpleShort", false, "simpleShort");
    public final static Property SimpleString = new Property(4, String.class, "simpleString", false, "simpleString");
    public final static Property SimpleBoolean = new Property(8, boolean.class, "simpleBoolean", false, "simpleBoolean");
    public final static Property SimpleByteArray = new Property(9, byte[].class, "simpleByteArray", false, "simpleByteArray");

    public final static Property[] __ALL_PROPERTIES = {
        Id,
        SimpleInt,
        SimpleShort,
        SimpleString,
        SimpleBoolean,
        SimpleByteArray
    };

    public final static Property __ID_PROPERTY = Id;

    @Override
    public Property[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override
    public Property getIdProperty() {
        return __ID_PROPERTY;
    }

    @Override
    public String getDbName() {
        return __NAME_IN_DB;
    }

}
