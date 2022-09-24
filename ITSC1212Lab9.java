/**
* @author  Anurag Dasari // 
* ITSC1212 - 001, Mazumder
* @version 1.0 // add .1 for each update
* @since   2021-02-22 // date last updated
* Module_9 :Lab
* This application is a Checkerboard pattern
*/
public class ITSC1212Lab9 {
    public static void main(String[] args){
        char symbol = '%';                      //Defined character as %

        for (int i=0; i < 4; i++) {             //Loop for 4 lines
            for (int j = 0; j < 4; j++)  {      //Loop for 4 characters per line
                for (int k=0; k < 4; k++)       //Loop for 4 characters per section
                    System.out.print(symbol);   //Print symbol
                System.out.print(" ");          //Print space
                if(symbol=='#')                 //If statement to display #
                symbol = '%';                   //To display %
                else                            //Else statement for alternate symbols
                symbol='#';
            }
            System.out.println("");             //To print space
            if(symbol=='#')                     //If statement to display #
                symbol = '%';                   //To display %
            else                                //Else statement for alternate symbols
                symbol='#';    
        }
        
    }

    
}
