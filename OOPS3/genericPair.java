package OOPS3;

public class genericPair<t> {
    
    private t first;
    private t second;
    public genericPair(t first , t second){
        this.first=first;
        this.second=second;
    }

    public t getFirst(){
        return first;
    }
    public t getSecond(){ 
        return second;
    }

    public void setFirst(t first){
        this.first=first;
    }
    public void setSecond(t second){
        this.second=second;
    }

}
