class TissueRunner {

    public static void main(String... values) {

        TissueStore tissueStore = new TissueStore();

        Tissue tissue1  = new Tissue("Softy", "Paper", 2, "White", "Rose", 10, 50, "Paper", "Cleaning", "India");
        Tissue tissue2 = new Tissue("CleanX", "Wet", 3, "White", "Lemon", 20, 80, "Cotton", "Face", "USA");
        Tissue tissue3 = new Tissue("Bella", "Paper", 2, "White", "None", 15, 60, "Paper", "Cleaning", "India");
        Tissue tissue4 = new Tissue("Papia", "Wet", 3, "White", "Aloe", 25, 90, "Cotton", "Face", "India");
        Tissue tissue5 = new Tissue("Origami", "Paper", 2, "White", "None", 30, 70, "Paper", "Cleaning", "India");
        Tissue tissue6 = new Tissue("Velvet", "Wet", 3, "White", "Rose", 20, 85, "Cotton", "Face", "USA");
        Tissue tissue7 = new Tissue("SoftCare", "Paper", 2, "White", "None", 10, 55, "Paper", "Cleaning", "India");
        Tissue tissue8 = new Tissue("EcoSoft", "Paper", 2, "White", "Mint", 15, 65, "Paper", "Cleaning", "India");
        Tissue tissue9 = new Tissue("FreshWipe", "Wet", 3, "White", "Lemon", 20, 95, "Cotton", "Face", "USA");
        Tissue tissue10 = new Tissue("GreenSoft", "Paper", 2, "White", "None", 25, 75, "Paper", "Cleaning", "India");
        Tissue tissue11 = new Tissue("SilkTouch", "Wet", 3, "White", "Rose", 20, 100, "Cotton", "Face", "USA");
        Tissue tissue12 = new Tissue("DailyUse", "Paper", 2, "White", "None", 10, 50, "Paper", "Cleaning", "India");
        Tissue tissue13 = new Tissue("PureSoft", "Paper", 2, "White", "Mint", 15, 60, "Paper", "Cleaning", "India");
        Tissue tissue14 = new Tissue("GlowWipe", "Wet", 3, "White", "Aloe", 25, 90, "Cotton", "Face", "India");
        Tissue tissue15 = new Tissue("UltraSoft", "Paper", 2, "White", "None", 30, 80, "Paper", "Cleaning", "India");
        Tissue tissue16 = new Tissue("CarePlus", "Wet", 3, "White", "Rose", 20, 85, "Cotton", "Face", "USA");
        Tissue tissue17 = new Tissue("CleanMate", "Paper", 2, "White", "None", 15, 55, "Paper", "Cleaning", "India");
        Tissue tissue18 = new Tissue("FreshSoft", "Wet", 3, "White", "Lemon", 20, 95, "Cotton", "Face", "USA");
        Tissue tissue19 = new Tissue("SoftPlus", "Paper", 2, "White", "None", 25, 70, "Paper", "Cleaning", "India");
        Tissue tissue20 = new Tissue("EcoCare", "Paper", 2, "White", "Mint", 30, 75, "Paper", "Cleaning", "India");

        tissueStore.saveTissue(null);
        tissueStore.saveTissue(tissue1);
        tissueStore.saveTissue(tissue2);
        tissueStore.saveTissue(tissue3);
        tissueStore.saveTissue(tissue4);
        tissueStore.saveTissue(tissue5);
        tissueStore.saveTissue(tissue6);
        tissueStore.saveTissue(tissue7);
        tissueStore.saveTissue(tissue8);
        tissueStore.saveTissue(tissue9);
        tissueStore.saveTissue(tissue10);
        tissueStore.saveTissue(tissue11);
        tissueStore.saveTissue(tissue12);
        tissueStore.saveTissue(tissue13);
        tissueStore.saveTissue(tissue14);
        tissueStore.saveTissue(tissue15);
        tissueStore.saveTissue(tissue16);
        tissueStore.saveTissue(tissue17);
        tissueStore.saveTissue(tissue18);
        tissueStore.saveTissue(tissue19);
        tissueStore.saveTissue(tissue20);

        tissueStore.displayAll();
    }
}