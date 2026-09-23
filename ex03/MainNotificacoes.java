public class MainNotificacoes {

    public static void processarEnvio(Notificacao notificacao, String texto) {
        notificacao.enviar(texto);
    }

    public static void main(String[] args) {
        Notificacao email = new EmailNotificacao("pedro@email.com");
        Notificacao sms = new SmsNotificacao("21999999999");
        Notificacao push = new PushNotificacao("dispositivo-123");

        processarEnvio(email, "Sua fatura chegou.");
        processarEnvio(sms, "Seu código de verificação é 4821.");
        processarEnvio(push, "Você tem uma nova mensagem.");
    }
}
