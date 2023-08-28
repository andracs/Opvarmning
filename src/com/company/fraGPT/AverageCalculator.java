/**
 *
 * Denne løsning er fra chatPGT, se på https://chat.openai.com/share/9160a5be-739f-4916-9bf2-bf9c8ea37ff1
 *
 * Dette program indlæser tal fra brugeren og beregner det løbende gennemsnit af de indtastede tal.
 * Brugeren kan indtaste tal indtil de vælger at afslutte ved at skrive 'q' eller 'Q'.
 * For hvert tal, der indtastes, vises det aktuelle gennemsnit af de tidligere indtastede tal.
 *
 * Programmet bruger klassen AverageCalculator til at opretholde indtastede tal og beregne gennemsnittet.
 * Hvis der ikke er indtastet nogen tal, vil gennemsnittet være 0.0.
 *
 * Brug af programmet:
 * 1. Programmet starter ved at hilse brugeren velkommen.
 * 2. Brugeren bliver bedt om at indtaste et tal. Hvis tallet er en gyldig numerisk værdi,
 *    bliver det tilføjet til AverageCalculator, og det aktuelle gennemsnit vises.
 * 3. Hvis brugeren indtaster 'q' eller 'Q', afsluttes programmet.
 * 4. Hvis brugeren indtaster en ikke-numerisk værdi, får de en fejlmeddelelse.
 * 5. Efter afslutning viser programmet en afsluttende besked.
 */


package com.company.fraGPT;

class AverageCalculator {
    private int total = 0;
    private int count = 0;

    public void addNumber(int number) {
        total += number;
        count++;
    }

    public double getAverage() {
        if (count == 0) {
            return 0; // Avoid division by zero
        }
        return (double) total / count;
    }
}