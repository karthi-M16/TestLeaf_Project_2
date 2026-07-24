public class Constructor {

    String name = "jhon";
    int id = 67;
    boolean status = true;
    Double no  = 0.657;

     public Constructor(){

        this("hari", 89);

        System.out.println("default");
    }

    public Constructor(String name , int id){

        
        this.name = name;
        this.id = id;
       
    }

    public Constructor(boolean status , String name , int id){

        this();
        this.name = name;
        this.id = id;
        this.status = status;
    }

    public static void main(String[] args) {
       
        Constructor con1 = new Constructor(true ,"karthi" , 16);
        Constructor con = new Constructor();
        Constructor con2 = new Constructor("rock" , 67);

       
 System.out.println(con.status+" "+con.name+" "+con.id+" "+con.no);
 System.out.println(con1.status+" "+con1.name+" "+con1.id);
 System.out.println(con2.id+" "+con2.name);
  System.out.println(con.name+" "+con.id);
       
    }
    
}
