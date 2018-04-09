
package game;

public class User {
    private String username;
    private int points;
    
    public User(){}
    public User(String username)
    {
        this.username=username;
    }
    public void addPoints()
    {
        points+=20;
    }
    public void deductPoints()
    {
        points-=5;
    }
    public int getPoints()
    {
        if(points<0) return 0;
        return points;
    }
    
    
}
