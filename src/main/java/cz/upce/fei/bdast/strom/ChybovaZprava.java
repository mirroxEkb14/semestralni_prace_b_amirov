package cz.upce.fei.bdast.strom;

/**
 * Třída reprezentuje výčtový typ pro různé chybové zprávy v datové struktuře Strom. Každá konstanta
 * představuje jednu konkrétní chybovou zprávu
 */
public enum ChybovaZprava {
    NULL_KLIC("Hledaný klíč je null."),
    PRVEK_NENALEZEN("Prvek nebyl nalezen."),
    KONEC_ITERACE("Konec iterace."),
    PRAZDNY_ZASOBNIK("Chyba při provádění iterace: zásobník je prázdný a nelze odebrat prvek"),
    PRAZDNY_KOREN("Kořen nebyl nalezen.");

    private final String zprava;

    /**
     * Konstruktor s danou chybovou zprávou
     *
     * @param zprava Chybová zpráva asociovaná s danou konstantou
     */
    ChybovaZprava(String zprava) { this.zprava = zprava; }

    /**
     * Slouží k získání textového popisu chybové zprávy asociované s konstantou
     *
     * @return Textový popis chybové zprávy
     */
    public String getZprava() { return zprava; }
}