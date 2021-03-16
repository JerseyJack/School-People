package common;

public class Address 
{

    public String firstLine, country, postcode;

    public Address(String firstLine, String country, String postcode)
    {
        this.firstLine = firstLine;
        this.country = country;
        this.postcode = postcode;
    }

    public String fullAddress()
    {
        String output = String.format("%s \n%s \n%s", getFirstLine(), getCountry(), getPostcode());
        return output;
    }

    public String getFirstLine()
    {
        return firstLine;
    }

    public String getCountry()
    {
        return country;
    }

    public String getPostcode()
    {
        return postcode;
    }
}
