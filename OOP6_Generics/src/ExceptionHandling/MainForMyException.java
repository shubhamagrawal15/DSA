package ExceptionHandling;

public class MainForMyException {
    public static void main(String[] args) {

        try{
            String name = "shubham";
            if(name.equals("shubham")){
                throw new MyException("name is kunal");
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
