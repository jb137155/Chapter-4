package animals;

import types.Primate;





    /**
     * Write a description of class animals.Orangutan here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    public class Ring_Tailed_Lemurs extends Primate
    {
        // instance variables - replace the example below with your own
        private String age;

        /**
         * Constructor for objects of class animals.Orangutan
         */
        public Ring_Tailed_Lemurs()
        {
            super("animals.Ring_Tailed_Lemurs", "Gray and white, sometimes nice");
            this.age = "very young";
        }

        /**
         * An example of a method - replace this comment with your own
         *
         *
         */
        @Override
        public String makeNoise()
        {
            // put your code here
            return "howls and climb trees.";
        }


    }

