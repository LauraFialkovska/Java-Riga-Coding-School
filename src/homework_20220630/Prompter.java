package homework_20220630;

import java.util.Scanner;

public class Prompter {
    Scanner scan = new Scanner(System.in);

    void chatBotHeader() {
        System.out.println("Čato ar mums");
        System.out.println("Lūdzam nerakstīt šajā sarakstē personas datus, piemēram, vārdu, " +
                "dzimšanas datumu vai informāciju par veselību.");
    }

    void virtualAssistant() {
        System.out.println("\n" + ".:: Virtuālais asistents ::."+ "\n");
    }

    String askClientForInput() {
        System.out.print("\n" + "Es: ");
        return scan.nextLine();
    }

    String chatBotWelcome() {
        chatBotHeader();
        virtualAssistant();
        System.out.println("Sveiki!");
        System.out.println("\n" + "Tu saraksties ar mūsu Swedbank Virtuālo asistentu.");
        System.out.println("Uzdod jautājumus par mūsu pakalpojumu \"Aizdevums\"!");
        System.out.println("\n" + "Kā varam Tev palīdzēt?");

        return askClientForInput();
    }

    void vaMenu() {
        virtualAssistant();
        System.out.println("Precizē, vai vēlies:");
        System.out.println("-> Saņemt aizdevumu");
        System.out.println("-> Apskatīt vai mainīt esošo līgumu");
        System.out.println("-> Veikt ikmēneša maksājumu");
        System.out.println("-> Veikt papildu vai pilnu atmaksu");
    }

    // Saņemt aizdevumu
    void vaGetLoan() {
        virtualAssistant();
        System.out.println("Aizdevuma saņemšanas iespējas tiek izvērtētas individuāli.");
        System.out.println("Tāpēc atrodi atbilstošu risinājumu savam mērķim un aizpildi pieteikumu.");
        System.out.println("Tikai tā Tu uzzināsi, vai vari saņemt aizdevumu un kādi būs līguma nosacījumi.");
        System.out.println("Pieteikuma aizpildīšana neuzliek Tev nekādas saistības.");
        System.out.println("\n" + "-> Atrast atbilstošu aizdevumu");
    }

    void vaFindRightLoan() {
        virtualAssistant();
        System.out.println("Tev atvēras web-lapa \"Atrast piemērotāko aizdevumu\".");
    }
    // Saņemt aizdevumu

    // Apskatīt vai mainīt esošo līgumu
    void vaViewOrChangeExistingContract() {
        virtualAssistant();
        System.out.println("Lai Tev palīdzētu, norādi, kāds ir Tava aizdevuma veids:");
        System.out.println("-> Patēriņa kredīts");
        System.out.println("-> Auto kredīts");
        System.out.println("-> Mazais mājokļa kredīts");
        System.out.println("-> Hipotekārais kredīts");
        System.out.println("-> Auto līzings");
        System.out.println("-> Studiju kredīts");
        System.out.println("-> Kredītlīnija");
        System.out.println("-> Kredītkarte");
    }

    void vaConsumerCredit() {
        virtualAssistant();
        System.out.println("Ja Tev ir aktīvs aizdevuma līgums, izvēlies:");
        System.out.println("* “Skatīt”, lai apskatītu tā nosacījumus, atlikumu un atmaksas grafiku");
        System.out.println("* “Izmaiņas un daļēja atmaksa”, lai mainītu maksājuma datumu un atmaksas kontu");
        System.out.println("\n" + "-> Neredzu iespēju mainīt līgumu");
        System.out.println("-> Skatīt vai mainīt līgumu");
    }

    void vaIDoNotSeePossibilityToChangeContract() {
        virtualAssistant();
        System.out.println("Izmaiņas nevar veikt:");
        System.out.println("* No plkst. 22:00 līdz 07:00");
        System.out.println("* Aizdevuma maksājuma datumā");
        System.out.println("* Ja ir atlikts aizdevuma maksājums");
        System.out.println("* Ja ir aktīvs parāds");
        System.out.println("* Ja kādā no kontiem ir negatīvs atlikums");
    }

    void vaMyCommitments() {
        virtualAssistant();
        System.out.println("Tev atvēras web-lapa \"Manas saistības\".");
    }

    void vaMortgageLoan() {
        virtualAssistant();
        System.out.println("Ja Tev ir aktīvs aizdevuma līgums, izvēlies:");
        System.out.println("* “Apskatīt”, lai apskatītu tā nosacījumus, atlikumu un atmaksas grafiku");
        System.out.println("* “Izmaiņas un daļēja atmaksa”, lai mainītu maksājuma datumu, atmaksas kontu " +
                "vai pieteiktu izmaksu");
        System.out.println("\n" + "-> Skatīt vai mainīt līgumu");
    }

    void vaCarLeasing() {
        virtualAssistant();
        System.out.println("Izvēlies auto līzinga līguma numuru, lai:");
        System.out.println("* Apskatītu pamatnosacījumus");
        System.out.println("* Apskatītu atlikumu");
        System.out.println("* Apskatītu maksājuma grafiku");
        System.out.println("* Pieteiktu izmaiņas");
        System.out.println("\n" + "-> Skatīt vai mainīt līgumu");
    }

    void vaStudyLoan() {
        virtualAssistant();
        System.out.println("Izvēlies “Skatīt” pretī aizdevuma līgumam un apskati tā:");
        System.out.println("* Pamatnosacījumus");
        System.out.println("* Atlikumu");
        System.out.println("* Maksājuma grafiku");
        System.out.println("\n" + "Lai izvērtētu iespēju veikt izmaiņas līgumā, nosūti bankas ziņojumu, " +
                "norādot līguma numuru un veicamās izmaiņas.");
        System.out.println("Nepieciešamības gadījumā mēs ar Tevi sazināsimies.");
        System.out.println("\n" + "-> Skatīt vai mainīt līgumu");
        System.out.println("-> Rakstīt bankas ziņojumu");
    }

    void vaWriteBankMessage() {
        virtualAssistant();
        System.out.println("Tev atvēras web-lapa \"Nosūtīt ziņojumu\".");
    }

    void vaCreditCard() {
        virtualAssistant();
        System.out.println("Pretī kartei izvēlies:");
        System.out.println("* “Līguma nosacījumi un izmaiņas”, lai apskatītu līgumu un veiktu tajā izmaiņas");
        System.out.println("* “Palielināt kredīta limitu”, lai nosūtītu jaunu pieteikumu kredītlimita izvērtēšanai");
        System.out.println("* “Par manu karti”, lai apskatītu kartes priekšrocības un atmaksas nosacījumus");
        System.out.println("\n" + "-> Apskatīt manas kartes");
    }

    void vaViewMyCards() {
        virtualAssistant();
        System.out.println("Tev atvēras web-lapa \"Manas kartes\".");
    }
    // Apskatīt vai mainīt esošo līgumu

    // Veikt ikmēneša maksājumu
    void vaMakeMonthlyPayment() {
        virtualAssistant();
        System.out.println("Parasti ikmēneša maksājums notiek automātiski izvēlētajā maksājuma datumā dienas beigās.");
        System.out.println("-> Veikt papildu aizdevuma atmaksu");
        System.out.println("-> Apskatīt aizdevuma atmaksas grafiku");
    }
    // Veikt ikmēneša maksājumu

    // Veikt papildu vai pilnu atmaksu
    void vaMakeAdditionalOrFullRefund() {
        virtualAssistant();
        System.out.println("Pretī aizdevuma līgumam izvēlies:");
        System.out.println("* “Dzēst kredītu”, lai atmaksātu pilnu summu");
        System.out.println("* “Veikt izmaiņas”, lai atmaksātu daļu summas");
        System.out.println("Jauno atmaksas grafiku redzēsi pirms izmaiņu apstiprināšanas.");
    }
    // Veikt papildu vai pilnu atmaksu

    void vaThanks() {
        virtualAssistant();
        System.out.println("Prieks palīdzēt!");
    }

    void vaBye() {
        virtualAssistant();
        System.out.println("Lai Tev izdevusies diena!");
    }
}
