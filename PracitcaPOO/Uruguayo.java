public class Uruguayo extends Person{
    private String ci;
    private String department;
    private String neighborhood;

    public Uruguayo(){
    }
    
    public String GetCI(){
        return ci;
    }

    public void SetCI(String ci){
        this.ci = ci;
    }

    public String GetDepartment(){
        return department;
    }

    public void SetDepartment(String department){
        this.department = department;
    }

    public String GetNeighborhood(){
        return neighborhood;
    }

    public void SetNeighborhood(String neighborhood){
        this.neighborhood = neighborhood;
    }

    public void PrintInfo(){
        System.out.println("name: "+this.GetName()+" "+this.GetLastName());
        System.out.println("gender: "+this.GetGender());
        System.out.println("age: "+this.GetAge());
        System.out.println("CI: "+this.GetCI());
        System.out.println("Department: "+this.GetDepartment());
        System.out.println("Neighborhood: "+this.GetNeighborhood());
    }
    
    public void Move(String newDepartment, String newNeighborhood){
        this.SetDepartment(newDepartment);
        this.SetNeighborhood(newNeighborhood);
    }
}
