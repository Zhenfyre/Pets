package com.example.android.pets.data;

// PetContracts class has constants available to us and is used by all classes


import android.provider.BaseColumns;

public final class PetContract {

    public static abstract class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "Name";
        public static final String COLUMN_PET_GENDER = "Gender";
        public static final String COLUMN_PET_BREED = "Breed";
        public static final String COLUMN_PET_WEIGHT = "Weight";

        /**
         * Possible values for pet gender.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }

}
