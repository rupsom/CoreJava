
public class GetTestSet {

	private String emailAddress;

	public String getEmailAddress() {
		System.out.println("\n" + emailAddress);
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		if(emailAddress.indexOf("@") != -1)
			this.emailAddress = emailAddress;
		else
			throw new IllegalArgumentException ("Email address is invalid.");
	}

}
