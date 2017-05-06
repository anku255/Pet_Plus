package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Contract class for App. Making the class final because it won't be extended in future.
 * It will be used to store constants used in databases.
 */

public final class PetContract {

    // To prevent from someone instantiating the contract class
    // make the constructor private

    private PetContract() {}

    /**
     * Inner class that defines constant for pets database.
     * Each entry represents a pet.
     */
    public static class PetEntry implements BaseColumns {

        /** Name of the database table for pets*/
        public static final String TABLE_NAME = "pets";

        /**
         * Unique ID number for the pet (only for use in the database table).
         *
         * Type: INTEGER
         */
        public static final String _ID = BaseColumns._ID;

        /**
         *  Name of the pet.
         *
         *  Type: TEXT
         */
        public static final String COLUMN_PET_NAME = "name";

        /**
         * Breed of the pet.
         *
         * Type: TEXT
         */
        public static final String COLUMN_PET_BREED = "breed";

        /**
         * Gender of the pet.
         * The only possible values are {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE}
         * or {@link #GENDER_FEMALE}
         *
         * TYPE: INTEGER
         */
        public static final String COLUMN_PET_GENDER = "gender";

        /**
         * Weight of the pet.
         *
         * TYPE: INTEGER
         */
        public static final String COLUMN_PET_WEIGHT = "weight";


        /**
        * Possible values for the gender of pets
        */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
