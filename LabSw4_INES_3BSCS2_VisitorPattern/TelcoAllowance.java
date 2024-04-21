package LabSw4_INES_3BSCS2_VisitorPattern;
public class TelcoAllowance implements UsagePromo
{
    private double getAllowance(String telcoName)
    {
        if ("Smart".equals(telcoName))
        {
            return 15.0;
        }
        else if ("Globe".equals(telcoName))
        {
            return 10.0;
        }
        else if ("Ditto".equals(telcoName))
        {
            return 8.0;
        }
        else
        {
            return 0.0;
        }
    }
    @Override
    public String showAllowance(String telcoName, double money)
    {
        double allowance = getAllowance(telcoName);
        return telcoName + " offers a data allowance of " + allowance + " GB for ₱" + money + " per month.";
    }
}
