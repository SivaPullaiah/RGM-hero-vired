package CustomHasinig;
public class simpleHashingFuction {
    public static int customHashFunction(String input){
        int hashCode=0;
        for(int i=0;i<input.length();i++){
            hashCode += input.charAt(i);
        }
        return hashCode;

    }
    public static void main(String[] args){
        String name ="Gousiya";
        int hashCode = customHashFunction(name);
        System.out.println(name);
        System.out.println(hashCode);

    }
    
}