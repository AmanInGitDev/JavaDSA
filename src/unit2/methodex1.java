class Mobile
    {
        public void playMusic()
        {
            System.out.println("Playing music");
        }
        // We are using public to make it accessible, it is necessary to write void because
        // We are expecting in return

        public void playGames()
        {
            System.out.println("Playing games");
        }

        public String beingRecorded(int time)
        {
            if (time == 10)
            {
                System.out.print("Time is " + time);
                return " and its Being Recorded";
                // Whenever code not meets its requirement it's jump out from the if condition and returns the 'String'.
                //or if it meets the condition it executes and the return form inside return string.
                // and it will stop the execution
            }
            return "The memory is full cant record further.";
        }  // Here we have to write return anything because we are using String method
    }


    public class methodex1
    {
        public static void main(String[] args)
        {
            Mobile obj = new Mobile();
            obj.playMusic();
            obj.playGames();

            String str = obj.beingRecorded(2);
            System.out.println(str);
            // This is how the String is now used by creating the object
        }
    }


