import java.util.List;
import java.util.ArrayList;
//SUBJECT
class Console{//Publisher
    List <Observer> list = new ArrayList<>();
    private String msg = "Wellcome to the console.";
    
    void addObserver(Observer obj){
        if(!list.contains(obj)){
            list.add(obj);
        }else{
            System.out.print("This obj is already subscribed.\n");
        }
    }
    
    void removeObserver(Observer obj){
        if(list.contains(obj)){
            list.remove(obj);
        }else{
            System.out.print("Cannot remove the non existent subscriber\n");
        }
    }
    
    void changeMessage(String msg){
        this.msg = msg;
        notifyObservers();
    }
    
    void notifyObservers(){
        for(Observer obj : list){
            obj.update();
        }
    }
    
    void showMessage(){
        System.out.print(msg);
        System.out.print("\n");
    }
    
}

    

