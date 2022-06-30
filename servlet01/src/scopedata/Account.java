package scopedata;

import java.io.Serializable;

public class Account implements Serializable {
	public String id;
	public String pass;
	public String mail;
	public String name;
	public int age;
	public int tel;
	public Account( String _id, String _pass, String _name,
			String _mail, int _age, int _tel ) {
		id = _id; pass = _pass; name = _name; mail = _mail; age = _age; tel = _tel;
	}
	public void  setId( String  _id ) {
    	id = _id;
    }
    public void  setPass( String _pass ) {
    	pass = _pass;
    }
    public void setName( String _name ) {
    	name = _name;
    }
    public void setMail( String _mail ) {
    	mail = _mail;
    }
    public void setAge( int _age ) {
    	age = _age;
    }
    public void setTel( int _tel ) {
    	tel = _tel;
    }
	public String getId() { return id; }
	public String getPass() { return pass; }
	public String getName() { return name; }
	public String getMail() { return mail; }
	public int getAge() { return age; }
	public int getTel() { return tel; }
}
