package ex34;

public class EmployeeManager {

    private String employees[]={"John Smith","Jackie Jackson", "Chris Jones", "Amanda Cullen","Jeremy Goodwin"};
    public int employeesSize=5;

    //set removed position to nothing, ""
    public void removeEmployee(String employeeName){
        for(int i=0;i<employees.length;i++){
            if(employees[i].equalsIgnoreCase(employeeName)){
                employees[i]="";
                employeesSize--;
            }
        }
    }

    public String toString(){
        String str="There are "+employeesSize+" employees: \n";
        for(int i=0;i< employees.length;i++){
            if(!employees[i].equals("")){
                str+=employees[i]+"\n";
            }
        }
        return str;
    }

}
