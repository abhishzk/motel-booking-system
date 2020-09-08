package login;

public class AvgUser extends CheckLoginImpl {
	@Override
	public boolean checkLogin(String u_name, String pass) {
		// TODO Auto-generated method stub
		if(u_name.equals("User") && pass.equals("User")){
			return true;
		}
		return false;
	}
}
