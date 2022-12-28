package employeeTechouts;

public class Pajo {
    private static int id;
    private String name;
    private  String address;
    public Pajo(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    static int p=0;
   static void cheek(int n) throws EmployeeNotFound {


           if (id == n) {
               System.out.println("Welcome");

           }
           else if (p>=2) {
               throw new EmployeeNotFound("Invalid employee");
           }
           else {
               p++;
           }

    }
}
