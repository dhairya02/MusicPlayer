package com.example.system.musicplayer;

    /**
     * This represents a list.
     * It contains a default title and a Custom Title for that word
     */

    public class List {
        /**Default translation for the word*/
        private String mTitle;
        /**Miwok translation for the word*/
        private String mCustomTitle;

        public List(String DefaultTitle, String CustomTitle){
            mTitle = DefaultTitle;
            mCustomTitle = CustomTitle;
        }

        /**
         * Get the default translation of the word.
         * @return
         */

        public String getTitle() {
            return mTitle;
        }

        /**
         * Get miwok translation.
         */
        public String getCustomTitle() {
            return mCustomTitle;
        }
    }
