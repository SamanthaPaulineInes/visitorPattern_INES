package LabSw4_INES_3BSCS2_VisitorPattern;
public class Telco implements TelcoSubscription
{
    private String telcoName;
    private double promoPrice;
    private int dateAllowance;
    private boolean unliCallText;

    public Telco(int dateAllowance, double promoPrice, String telcoName, boolean unliCallText)
    {
        this.dateAllowance = dateAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price)
    {
        this.promoPrice = price;
        return promo.showAllowance(telcoName, promoPrice);
    }
    @Override
    public String accept(UnliCallsTextOffer unliCallsTextOffer, boolean unliCallText)
    {
        this.unliCallText = unliCallText;
        return unliCallsTextOffer.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public void setDateAllowance(int dateAllowance)
    {
        this.dateAllowance = dateAllowance;
    }
    public int getDateAllowance()
    {
        return dateAllowance;
    }

    public void setPromoPrice(double promoPrice)
    {
        this.promoPrice = promoPrice;
    }
    public double getPromoPrice()
    {
        return promoPrice;
    }

    public void setTelcoName(String telcoName)
    {
        this.telcoName = telcoName;
    }
    public String getTelcoName()
    {
        return telcoName;
    }

    public void setUnliCallText(boolean unliCallText)
    {
        this.unliCallText = unliCallText;
    }
    public boolean getUnliCallText()
    {
        return unliCallText;
    }
}
