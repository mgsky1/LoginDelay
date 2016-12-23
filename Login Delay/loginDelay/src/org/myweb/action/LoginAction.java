package org.myweb.action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport
{

   private String user;
   private String password;
   private boolean isValidate = false;
   
   public void setUser(String user) {
	this.user = user;
   }
   
   public void setPassword(String password) {
	this.password = password;
   }
   
   public String getUser() {
	return user;
   }
   
   public String getPassword() {
	return password;
   }
   
   public String execute()
   {
	   for(int i = 0 ; i < 1000000 ; i++)
	   {
		   System.out.println(i);
	   }
	   validate();
	   if(this.isValidate)
	   {
		   return "success";
	   }
	   else
	   {
		   return "input";
	   }
   }
   
   public void validate()
   {
	   if(getUser().equals("abc") && getPassword().equals("abc"))
	   {
		   addActionMessage("OK");
		   this.isValidate = true;
	   }
	   else
	   {
	      addActionError("FAILED");
	   }
   }
   
   public void show()
   {
	   System.out.println("我被运行了。。。");
   }
}
