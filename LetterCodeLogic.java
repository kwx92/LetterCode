
package business;

/*
 * @author Katelyn Waddell
 */
public class LetterCodeLogic {
    public static String Encode(String msg)
    {
        String result = "";
        //result = "Encode received: " + msg.toUpperCase();
        String m = msg.toUpperCase();
        char c;
        int x;
        for(int i=0; i < m.length(); i++)
        {
            c = m.charAt(i);
            x = c; // char and int are directly eqvuivalent by the ASCII coding scheme
            if (x == 32)
            {
                x = 0; // space = 32 in ACII, 0 in LetterCode
            }
            
            else
            {
                x = x-64; //adjust ASCII to LetterCode (A=1, B=2, etc)
                if (x < 1 || x > 26)
                {
                    x = 99; // char was not A-Z
                }
            }
            result += String.valueOf(x) + " ";
        }
        return result;
    }//end of encode
    
    public static String Decode (String msg)
    {
        String result = "";
        int x;
        char c;
        String [] nums = msg.replaceAll(" ", "").trim().split(","); // splits msg and sizes the array, nums
        // ex: if msg = "1, 2, 3"
        // nums = {"1" , "2" , "3"};
        // nums [0] = "1" - not recognized as a numeric value
        
       
       for (int i=0; i < nums.length; i++)
       {
           try 
           {
               x = Integer.parseInt(nums[i]);
           }
           
           catch (Exception e)
           {
               x = 99;
           }
           
           if (x==0)
           {
               c = ' ';
           }
           else if (x < 1 || x > 26)
           {
               c = '?';
           }
           else 
           {
               x+= 64;
               c = (char) x; // cast variable x into a char
           }
           result += c;
       } // end of for loop
        return result;
    }
}
