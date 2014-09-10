//hw 2
//Arithmetic 
public class Arithmetic {
    public static void main (String [] args) {
    // number of socks
    int nSocks=3;
    // cost per pair of socks
    double sockCost$=2.58;
    
    // number of drinking glasses
    int nGlasses=6;
    // cost per glass
    double glassCost$=2.29;
    
    // number of boxes per envelope
    int nEnvelopes=1;
    double envelopeCost$=3.35;
    double taxPercent=0.06;
    
    double totalSockCost$; // total cost of socks
    double sockTax; // tax on socks
    double costSocks; // cost of socks without tax
    costSocks=(nSocks * sockCost$);
    sockTax= taxPercent * costSocks; // tax on socks
    totalSockCost$=costSocks + sockTax; // total cost of socks
    
    double totalGlassesCost$; // total cost of glasses
    double glassesTax; // tax on glasses
    double costGlasses; // cost of glasses without tax
    costGlasses=nGlasses * glassCost$;
    glassesTax=taxPercent * costGlasses;
    totalGlassesCost$=costGlasses + glassesTax;
    
    double totalEnvelopeCost$; // total cost of envelopes
    double envelopesTax; // tax on envelopes
    double costEnvelopes; // cost of envelopes without tax
    costEnvelopes=nEnvelopes * envelopeCost$;
    envelopesTax=taxPercent * costEnvelopes;
    totalEnvelopeCost$=costEnvelopes + envelopesTax;
    
    // print out recipt of each of the items
    System.out.println ("Socks");
    System.out.println ("Number of pairs: "+nSocks+" ");
    System.out.println ("Cost of each pair of socks: "+sockCost$+"");
    System.out.println ("Cost of Socks: "+costSocks+"");
    System.out.println ("Sales Tax on Socks:" +sockTax+"");
    System.out.println ("Total Cost of Socks: "+totalSockCost$+"");
    
    System.out.println ("Glasses");
    System.out.println ("Number of glasses: "+nGlasses+" ");
    System.out.println ("Cost of each glass: "+glassCost$+"");
    System.out.println ("Cost of Glasses: "+costGlasses+"");
    System.out.println ("Sales Tax on Glasses:" +glassesTax+"");
    System.out.println ("Total Cost of Glasses: "+totalGlassesCost$+"");
    
    System.out.println ("Envelopes");
    System.out.println ("Number of boxes of Envelopes: "+nEnvelopes+" ");
    System.out.println ("Cost of each box of Envelopes: "+envelopeCost$+"");
    System.out.println ("Cost of Envelopes: "+costEnvelopes+"");
    System.out.println ("Sales Tax on Envelopes:" +envelopesTax+"");
    System.out.println ("Total Cost of Envelopes: "+totalEnvelopeCost$+"");
   
    // print out information about whole purchase
    double costPurchase; // cost of items w/o tax
    double totalSalesTax; // total sales tax
    double totalCostPurchase; // cost of all items including tax
    costPurchase= costSocks + costGlasses + costEnvelopes;
    totalSalesTax =sockTax + glassesTax + envelopesTax;
    totalCostPurchase = totalSockCost$ + totalGlassesCost$ + totalEnvelopeCost$;
    System.out.println ("Summary");
    System.out.println ("Total cost of items: "+costPurchase+"");
    System.out.println ("Total Sales Tax: "+totalSalesTax+"");
    System.out.println ("Total Cost of Purchase: "+totalCostPurchase+"");
    

    
    }
}
