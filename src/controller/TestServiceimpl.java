package controller;

public class TestServiceimpl implements TestService {

	@Override
	public String setTextArea(String s) {
		String str="";
		for(int i=2;i<9;i++) {
			for(int col=1;col<9;col++) {
				str=str+i+"*"+col+"="+i*col;
			}
		}
		return str;
	}

	public String appendTextArea(String s) {
		// TODO Auto-generated method stub
		String str="Hello JavaFX"+s+"!\n";
		return str;
	}
}
