class Address
{
    private String hno;
    private String streetName;
    private String city;
    private String state;
    public Address() { }
    public Address(String hno,String streetName,String city,String state)
    {
        this.hno = hno;   this.streetName = streetName;
        this.city = city;   this.state = state;
    }
    public String getHno()
    {
        return hno;
    }
    public String getStreetName()
    {
        return streetName;
    }
    public String getCity()
    {
        return city;
    }
    public String getState()
    {
        return state;
    }
}