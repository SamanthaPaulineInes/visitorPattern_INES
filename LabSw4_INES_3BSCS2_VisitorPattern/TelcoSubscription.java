package LabSw4_INES_3BSCS2_VisitorPattern;
public interface TelcoSubscription
{
    public String accept(UsagePromo promo, double price);
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);

    public int getDateAllowance();
    public double getPromoPrice();
    public String getTelcoName();
    public boolean getUnliCallText();
}
