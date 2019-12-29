public interface Client{

// every client should have name
public void setName(String name);
public String getName(String name);
 
    // every client should have accountNo
    public void setAccountNumber( String AccountNumber);
    public String getAccountNumber(String AccountNumber);

    public void setChages(int charges);
    public int getCharges();
    
    
}