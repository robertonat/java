public class event{
    public String name;
    private String location; 

    public event(String name, String location){
        this.name = name;
        this.location = location;
    }
    public String getName(){
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }
}