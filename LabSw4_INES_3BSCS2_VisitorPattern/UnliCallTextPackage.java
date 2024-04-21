package LabSw4_INES_3BSCS2_VisitorPattern;
public class UnliCallTextPackage implements UnliCallsTextOffer
{
    private String getUnliCallTextOffers(String telcoName)
    {
        if ("Smart".equals(telcoName))
        {
            return "However, they do not offer any free calls or texts, and you will be charged per use.";
        }
        else if ("Globe".equals(telcoName))
        {
            return "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.";
        }
        else if ("Ditto".equals(telcoName))
        {
            return "This plan includes unlimited calls and texts to all networks within the country.";
        }
        else
        {
            return "Unavailable";
        }
    }
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText)
    {
        String offer = getUnliCallTextOffers(telcoName);
        return offer;
    }
}