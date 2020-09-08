package login;

public class CheckLoginImpl implements CheckLogin{

	@Override
	public boolean checkLogin(String u_name, String pass) {
		// TODO Auto-generated method stub
		if(u_name.equals("admin") && pass.equals("admin")){
			return true;
		}
		return false;
	}
}
