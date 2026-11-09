public class Task {
    private String title;
    private boolean completed;

    public Task(String title){
        this.title = title;
        this.completed = false;
    }

    public void complete(){
        this.completed = true;
    }

    public String getTitle(){
        return title;
    }

    public boolean isCompleted(){
        return completed;
    }

    @Override 
    public String toString(){
        if(isCompleted()){
            return "[x] " + title;
        }else{
            return "[ ] " + title;
        }
    }
}