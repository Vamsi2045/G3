public class Day4_conditions {
    public String fizzString(String str) {
        /*  Scanner mango = new Scanner(System.in);
          system.out.println("str :");
            String str = mango.next();
        */
            
            if(str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b'){
              return "FizzBuzz";
            }
            else if(str.charAt(str.length() - 1) == 'b'){
              return "Buzz";
            }
            else if(str.charAt(0) == 'f'){
              return "Fizz";
            }
            else{
              return str;
            }
        }
        

        public boolean squirrelPlay(int temp, boolean isSummer) {
            if(isSummer == true){
              if(temp >= 60 && temp <= 100){
                return true;
              }
              else{git commit -m "first commit"
                return false;
              }
            }
            else{
              if(temp >= 60 && temp <= 90){
                return true;
              }
              else{
                return false;
              }
            }
          }
    
}
