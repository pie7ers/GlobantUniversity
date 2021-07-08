public class MainPOO {
    public static boolean AmIUruguayoOrChileno(Person person){
        boolean isFrom = person instanceof Uruguayo ? true : false;
        return isFrom;
    }
    
    public static void main(String arg[]){
        Uruguayo uruguayo = new Uruguayo();
        uruguayo.SetName("Federico");
        uruguayo.SetLastName("Valverde");
        uruguayo.SetAge(22);
        uruguayo.SetGender("Male");
        uruguayo.SetCI("12345678");
        uruguayo.SetDepartment("Montevideo");
        uruguayo.SetNeighborhood("Peñarol");
        uruguayo.Move("Madrid", "Real Madrid");
        uruguayo.PrintInfo();
        System.out.println(uruguayo.GetName() + " is uruguayo? " + AmIUruguayoOrChileno(uruguayo));
        
        Chileno chileno = new Chileno();
        chileno.SetName("Arturo");
        chileno.SetLastName("Vidal");
        chileno.SetAge(34);
        chileno.SetGender("Male");
        chileno.SetDNI("12345678");
        chileno.SetRegion("Santiago");
        chileno.SetComuna("Colo-Colo");
        System.out.println(chileno.GetName() + " is uruguayo? " + AmIUruguayoOrChileno(chileno));
        
    }
}
