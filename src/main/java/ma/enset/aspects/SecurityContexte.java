package ma.enset.aspects;

public class SecurityContexte {
    private static String username="";
    private static String password="";
    private static String[] roles={};
    public static void authenticateUser(String u,String p,String[] inputRoles){
        if((u.equals("root"))&&(p.equals("password")) ){
            username= u;password=p;
            roles=inputRoles;
        }
        else throw new RuntimeException("Invalid ");
    }
    public static boolean hasRole(String role){
        for (String r:roles) {
            if(r.equals(role))return true;
        }
        return false;
    }
}
