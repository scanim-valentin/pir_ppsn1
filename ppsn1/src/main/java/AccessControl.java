import co.junwei.cpabe.Cpabe;

public class AccessControl {
    //  PUBLIC
    // PPSN2
    public String PostObject(String Obj) {
        Cpabe test = new Cpabe() ;

        return null ;
    }

    public String GetRemoteObject(String Obj) {
        return null ;
    }

    public String GetDefaultPolicy() {
        return DEFAULT_POLICY ;
    }

    public void GiveAccess(String Usr) {
    }

    public void RevokeAccess(String Usr) {
    }

    // Stegano
    public String GetCipheredKey(String Object){
        return null ;
    }

    // PRIVATE

    private String DEFAULT_POLICY = "" ;

    //Post object
    private String UploadObject(String Obj){
        return null ;
    }

    private String Cipher(String Obj){
        return null ;
    }

    //Get object
    private boolean CheckAccess(String Obj){
        return false ;
    }

    private String Decipher(String Obj){
        return null ;
    }

    //Revoke
    private void ModifyDefaultPolicy(String Policy){
    }

    void main(){

    }
}
