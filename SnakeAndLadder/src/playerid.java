public class playerid {
    private static playerid id=null;
    static int player_id;
    protected playerid(){
    	
    }
    public static playerid getInstance(){
    	if (id == null){
    		id=new playerid();
    		player_id=0;
    	}
    	return id;
    }
    public static int assignid(){
    	player_id+=1;
    	return player_id;
    }

}