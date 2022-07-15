package homework_20220630;

public class ChatBot {
    public static void main(String[] args) {
        ChatBotSearchPhrases phrases = new ChatBotSearchPhrases();
        Prompter prompter = new Prompter();

        String clientInput = prompter.chatBotWelcome();

        while (true) {
            // ---
            if (clientInput.equals(phrases.phrase1)) {
                prompter.vaGetLoan();
            }

            if (clientInput.equals(phrases.phrase2)) {
                prompter.vaFindRightLoan();
            }
            // ---

            // ---
            if (clientInput.equals(phrases.phrase3)) {
                prompter.vaViewOrChangeExistingContract();
            }

            if (clientInput.equals(phrases.phrase4)
                    || clientInput.equals(phrases.phrase5)
                    || clientInput.equals(phrases.phrase6)) {
                prompter.vaConsumerCredit();
            }

            if (clientInput.equals(phrases.phrase7)) {
                prompter.vaIDoNotSeePossibilityToChangeContract();
            }

            if (clientInput.equals(phrases.phrase8)
                    || clientInput.equals(phrases.phrase9)) {
                prompter.vaMyCommitments();
            }

            if (clientInput.equals(phrases.phrase10)) {
                prompter.vaMortgageLoan();
            }

            if (clientInput.equals(phrases.phrase11)) {
                prompter.vaCarLeasing();
            }

            if (clientInput.equals(phrases.phrase12)
                    || clientInput.equals(phrases.phrase13)) {
                prompter.vaStudyLoan();
            }

            if (clientInput.equals(phrases.phrase14)) {
                prompter.vaWriteBankMessage();
            }

            if (clientInput.equals(phrases.phrase15)) {
                prompter.vaCreditCard();
            }

            if (clientInput.equals(phrases.phrase16)) {
                prompter.vaViewMyCards();
            }
            // ---

            // ---
            if (clientInput.equals(phrases.phrase17)) {
                prompter.vaMakeMonthlyPayment();
            }

            if (clientInput.equals(phrases.phrase18)
                    || clientInput.equals(phrases.phrase19)) {
                prompter.vaMakeAdditionalOrFullRefund();
            }
            // ---

            if (clientInput.contains("Paldies")
                    || clientInput.contains("paldies")) {
                prompter.vaThanks();
            }

            if (clientInput.contains("Neka")
                    || clientInput.contains("neka")
                    || clientInput.contains("Ata")
                    || clientInput.contains("ata")
                    || clientInput.contains("Visu labu")
                    || clientInput.contains("visu labu")
                    || clientInput.contains("Beigt")
                    || clientInput.contains("beigt")) {
                prompter.vaBye();
                break;
            }

            if (!clientInput.equals("Ok")
                    && !clientInput.equals("ok")
                    && !clientInput.contains("Labi")
                    && !clientInput.contains("labi")
                    && !clientInput.contains("Skaidrs")
                    && !clientInput.contains("skaidrs")
                    && !clientInput.equals("")
                    && !clientInput.equals(phrases.phrase1)
                    && !clientInput.equals(phrases.phrase2)
                    && !clientInput.equals(phrases.phrase3)
                    && !clientInput.equals(phrases.phrase4)
                    && !clientInput.equals(phrases.phrase5)
                    && !clientInput.equals(phrases.phrase6)
                    && !clientInput.equals(phrases.phrase7)
                    && !clientInput.equals(phrases.phrase8)
                    && !clientInput.equals(phrases.phrase9)
                    && !clientInput.equals(phrases.phrase10)
                    && !clientInput.equals(phrases.phrase11)
                    && !clientInput.equals(phrases.phrase12)
                    && !clientInput.equals(phrases.phrase13)
                    && !clientInput.equals(phrases.phrase14)
                    && !clientInput.equals(phrases.phrase15)
                    && !clientInput.equals(phrases.phrase16)
                    && !clientInput.equals(phrases.phrase17)
                    && !clientInput.equals(phrases.phrase18)
                    && !clientInput.equals(phrases.phrase19)
                    && !clientInput.contains("Paldies")
                    && !clientInput.contains("paldies")
                    && !clientInput.contains("Neka")
                    && !clientInput.contains("neka")
                    && !clientInput.contains("Ata")
                    && !clientInput.contains("ata")
                    && !clientInput.contains("Visu labu")
                    && !clientInput.contains("visu labu")
                    && !clientInput.contains("Beigt")
                    && !clientInput.contains("beigt")
            ) {
                prompter.vaMenu();
            }

            clientInput = prompter.askClientForInput();
        }
    }
}
