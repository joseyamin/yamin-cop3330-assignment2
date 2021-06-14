package ex27;

public class ValidChecker {
    public boolean firstNameValid(String firstName){
        if(firstName.length()<2){
            return false;
        }
        return true;
    }
    public boolean lastNameValid(String lastName){
        if(lastName.length()<2){
            return false;
        }
        return true;
    }
    public boolean zipCodeValid(String zipCode){
        //check length and if all values are digits
        if(zipCode.length()!=5){
            return false;
        }
        for(int i=0;i<5;i++){
            if(!Character.isDigit(zipCode.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public boolean employeeIDValid(String employeeID){
        if(employeeID.length()!=7){
            return false;
        }
        return (Character.isAlphabetic(employeeID.charAt(0)) && Character.isAlphabetic(employeeID.charAt(1)) && employeeID.charAt(2)=='-' && Character.isDigit(employeeID.charAt(3)) && Character.isDigit(employeeID.charAt(4))&& Character.isDigit(employeeID.charAt(5)));
    }
}
