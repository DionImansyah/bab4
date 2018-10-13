package latihanbab4;

public class latihanbab4 {
    
    public static void StatementIf() {
        double grade = 92.0;
        if ( grade >= 90 ) {
        System.out.println ("exellent");
        }
        else if (( grade < 90 ) && (grade >= 80)) {
        System.out.println ("good job");
        }
        else if (( grade < 80 ) && (grade >= 60)) {
        System.out.println ("study harder");
        }
        else{
        System.out.println ("you failed");
        }
        
    }    
    public static void StatementSwitch(){
        int grade = 92;
        switch(grade){
        case 100:
        System.out.println ("exellent");     
        break;
        case 92:
        System.out.println ("good job");
        break;
        case 80:
        System.out.println ("study harder");
        break;
        default:
        System.out.println ("you failed");
        }
    
    }    
    public static void StatementBreak(){
    String names[] = {"beah", "bianca", "lance", "belle", "nico", "yza", "gem", "ethan"};
    String searchName = "yza";
    boolean foundName = false;
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(searchName)){
            foundName = true;
            break;
            }
        }
        if (foundName){
            System.out.println(searchName + " found");
        }
        else{
            System.out.println(searchName + "not found");
        }
        
    }    
    public static void LebeledBreakStatement(){
    String names[] = {"beah", "bianca", "lance", "beah"};
    int count = 0;
    searchLabel:
    for (int i = 0; i < names.length; i++) {
            if(!names[i].equals("beah")){
            break searchLabel;
            }
            count++;  
        }
    System.out.println ("there are " + count + " beah in the list");
    }   
    public static void LebeledContinueStatement(){
    String names[] = {"beah", "bianca", "lance", "beah"};
    int count = 0;
    searchLabel:
    for (int i = 0; i < names.length; i++) {
            if(!names[i].equals("beah")){
            continue;
            }
            count++;  
        }
    System.out.println ("there are " + count + " beah in the list");
    }     
    public static void LebeledStatementContinue(){
        outerLoop:
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++){
                System.out.println("inside for (j) loop");
                if(j == 2) continue outerLoop;
            }
            System.out.println("inside for (i) loop");
        }
    }
    public static void InfinityLoop(){
    for(;;){
    String searchName = "fuck";
    System.out.println(searchName + " found");
        }
    }   
 
    
  public static void main(String[] args) {
       //StatementIf();
       //StatementSwitch();
       //StatementBreak();
       //LebeledBreakStatement();
       //LebeledContinueStatement();
       //LebeledStatementContinue();
       //InfinityLoop();
    }   
}
