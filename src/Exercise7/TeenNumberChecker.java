package Exercise7;

public class TeenNumberChecker {
    public boolean hasTeen (int i, int j, int k){
        int parametr[]={i,j,k};
            if(parametr[0]<13 || parametr[0]>19) {
                if(parametr[1]<13 || parametr[1]>19){
                    if(parametr[2]<13 || parametr[2]>19){
                        return false;
                    }
                }
            }
        return true;
    }

    public boolean isTeen(int i){
        if(i>=13 && i<=19){
            return  true;
        } else return false;
    }
}
