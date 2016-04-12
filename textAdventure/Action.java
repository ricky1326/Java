public class Action{

    private String action;
    private String secondWord;

    public Action(String word1, String word2){
        action = word1;
        this.secondWord = word2;
    }


    public boolean invalidAction() {
        return (action == null);
    }

    public boolean hasSecondWord(){
        return (secondWord != null);
    }

    public String getAction(){
        return action;
    }

    public String getSecondWord(){
        return secondWord;
    }

}