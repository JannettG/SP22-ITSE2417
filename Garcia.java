
public class Garcia implements FinalProject{
    
    public Garcia()
    {
        
    }
    
    public void begin()
    {

        System.out.print("Input a string, and I'll make it easy for a dizzy mirror to read it. (Enter to quit): ");
     
        String input = Itse2417Main.myScan.nextLine();

        System.out.println();
        
//reverses the string
            String reversed ="";

            for (int i = 0; i < input.length(); i++)
             {
                 char temp = input.charAt(i);
                 reversed = temp + reversed;
             }


            char[] reversedArray = reversed.toCharArray();

//capitalizes every other letter
            for (int i = 0; i < reversedArray.length; i += 2) 
              {
                if (reversedArray[i] == ' ')
                { 
                    i++;
                }

                reversedArray[i] = Character.toUpperCase(reversedArray[i]); 
              }   

//prints new string           
                String formattedInput = new String(reversedArray);
                System.out.print(formattedInput);

                System.out.println();
                System.out.println();

                System.out.println(".emoclew er'uoY");
    }
    
}
