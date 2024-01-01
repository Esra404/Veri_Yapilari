package VizeHazirlik.Yigit.diziİleOrnek;

public class Stack {
    int kapasite;
    int [] s;
    int ust;
    public Stack(int kapasite){
        this.kapasite=kapasite;
        s= new int [kapasite];
        ust =-1;
    }
    boolean doluMu(){
        if(ust == kapasite -1){
            return true;
        }else{
            return false;
        }
    }
    boolean bosMu(){
        return ust ==1;
    }
    void push(int x){
        if(!doluMu()){
            ust =ust+1;
            s[ust]=x;
            System.out.println(x);
        }

    }
    int pop(){
        if(!bosMu()){
            ust=ust-1;
            System.out.println(s[ust+1]);
            return s[ust+1];
        }
        return -1;
    }
}
