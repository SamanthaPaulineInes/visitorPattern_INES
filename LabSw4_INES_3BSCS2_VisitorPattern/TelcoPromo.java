package LabSw4_INES_3BSCS2_VisitorPattern;
public class TelcoPromo
{
    public static void main(String[] args)
    {
        TelcoSubscription smart = new Telco(15, 500, "Smart",false);
        TelcoSubscription globe = new Telco(10, 450, "Globe",true);
        TelcoSubscription ditto = new Telco(8, 400, "Ditto",true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.print("\nTELECOMMUNICATIONS OFFERS");

        System.out.println("\n\n" + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println(promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println(promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));

        System.out.print("\n");
    }
}
